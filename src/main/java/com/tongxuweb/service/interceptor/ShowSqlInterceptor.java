package com.tongxuweb.service.interceptor;


import com.tongxuweb.util.JsonUtil;
import com.tongxuweb.util.StringUtil;
import org.apache.ibatis.executor.Executor;
import org.apache.ibatis.mapping.BoundSql;
import org.apache.ibatis.mapping.MappedStatement;
import org.apache.ibatis.mapping.ParameterMapping;
import org.apache.ibatis.plugin.*;
import org.apache.ibatis.reflection.MetaObject;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.ResultHandler;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.type.TypeHandlerRegistry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Properties;
import java.util.regex.Matcher;

@Intercepts({
        @Signature(type = Executor.class, method = "update",
                args = {MappedStatement.class, Object.class}),
        @Signature(type = Executor.class, method = "query",
                args = {MappedStatement.class, Object.class, RowBounds.class, ResultHandler.class})})
@Resource
@Service
public class ShowSqlInterceptor implements Interceptor {


    private static final Logger LOGGER_TABLE = LoggerFactory.getLogger("p_log_table");
    private static final Logger LOGGER = LoggerFactory.getLogger(ShowSqlInterceptor.class);

    /**
     * Gets sql.
     *
     * @param boundSql the bound sql
     * @param sqlId    the sql id
     * @param time     the time
     * @return the sql
     */
    public static String getSql(String sqlSource,
                                String sqlId, long time) {
        StringBuilder str = new StringBuilder(100);
        str.append(sqlSource);
        str.append("; - ");
        str.append(time);
        str.append("ms");
        str.append(":");
        str.append(sqlId);
        return str.toString();
    }

    private static String getParameterValue(Object obj) {
        String value;
        if (obj instanceof String) {
            value = "'" + obj.toString() + "'";
        } else if (obj instanceof Date) {
            DateFormat formatter = DateFormat.getDateTimeInstance(DateFormat.DEFAULT,
                    DateFormat.DEFAULT, Locale.CHINA);
            value = "'" + formatter.format((Date) obj) + "'";
        } else {
            if (obj != null) {
                value = obj.toString();
            } else {
                value = "";
            }

        }
        return Matcher.quoteReplacement(value);
    }

    /**
     * Show sql string.
     *
     * @param configuration the configuration
     * @param boundSql      the bound sql
     * @return the string
     */
    public static String showSql(Configuration configuration, BoundSql boundSql) {
        Object parameterObject = boundSql.getParameterObject();
        List<ParameterMapping> parameterMappings = boundSql.getParameterMappings();
        String sql = boundSql.getSql().replaceAll("[\\s]+", " ");
        if (parameterMappings.size() > 0 && parameterObject != null) {
            TypeHandlerRegistry typeHandlerRegistry = configuration.getTypeHandlerRegistry();
            if (typeHandlerRegistry.hasTypeHandler(parameterObject.getClass())) {
                sql = sql.replaceFirst("\\?", getParameterValue(parameterObject));

            } else {
                MetaObject metaObject = configuration.newMetaObject(parameterObject);
                for (ParameterMapping parameterMapping : parameterMappings) {
                    String propertyName = parameterMapping.getProperty();
                    if (metaObject.hasGetter(propertyName)) {
                        Object obj = metaObject.getValue(propertyName);
                        sql = sql.replaceFirst("\\?", getParameterValue(obj));
                    } else if (boundSql.hasAdditionalParameter(propertyName)) {
                        Object obj = boundSql.getAdditionalParameter(propertyName);
                        sql = sql.replaceFirst("\\?", getParameterValue(obj));
                    }
                }
            }
        }
        return sql;
    }

    /**
     * Intercept object.
     *
     * @param invocation the invocation
     * @return the object
     * @throws Throwable the throwable
     */
    public Object intercept(Invocation invocation) throws Throwable {
        Object[] args = invocation.getArgs();
        MappedStatement mappedStatement = (MappedStatement) invocation.getArgs()[0];
        Object parameter = null;
        if (args.length > 1) {
            parameter = invocation.getArgs()[1];
        }

        String sqlId = mappedStatement.getId();

        BoundSql boundSql = mappedStatement.getBoundSql(parameter);

        Configuration configuration = mappedStatement.getConfiguration();
        Object returnValue = null;
        long start = System.currentTimeMillis();
        try {
            returnValue = invocation.proceed();
        } finally {
            long end = System.currentTimeMillis();
            long time = end - start;
            if (time > 1) {
                String sqlSource = showSql(configuration, boundSql);
                String sql = getSql(sqlSource, sqlId, time);
                LOGGER.info(sql);
                String name = mappedStatement.getSqlCommandType().name();
                if (!name.startsWith("SELECT")) {
                    saveLog(name, sqlSource);
                }

            }
        }
        return returnValue;
    }

    private String getTableNameFromSql(String sql, String op) {
        String tableName = null;
        try {
            String lowerSql = sql.toLowerCase();
            int start = 0;
            int end = 0;
            if ("INSERT".equalsIgnoreCase(op)) {
                start = lowerSql.indexOf("into") + "into".length();
                end = lowerSql.indexOf("(", start);
            } else if ("UPDATE".equalsIgnoreCase(op)) {
                start = lowerSql.indexOf("update") + "update".length();
                end = lowerSql.indexOf("set", start);
            } else if ("DELETE".equalsIgnoreCase(op)) {
                start = lowerSql.indexOf("from") + "from".length();
                end = lowerSql.indexOf("where", start);
            }
            tableName = lowerSql.substring(start, end).trim();
        } catch (Exception e) {

        }

        return tableName;
    }

    private void saveLog(String name, String sql) {
        String tableName = getTableNameFromSql(sql, name);
        if (!StringUtil.isEmpty(tableName) && !"p_log_table".equalsIgnoreCase(tableName)) {
//            PLogTable log = new PLogTable();
//            log.setContent(sql);
//            log.setTableName(tableName);
//            if (name.startsWith("INSERT")) {
//                log.setType(1);
//            } else if (name.startsWith("UPDATE")) {
//                log.setType(2);
//            } else if (name.startsWith("DELETE")) {
//                log.setType(3);
//            }
//
//            if (log.getType() != null) {
//                LOGGER_TABLE.info(JsonUtil.toJson(log));
//                // pLogTableMapper.insertSelective(log);
//            }


        }
    }


    /**
     * Plugin object.
     *
     * @param target the target
     * @return the object
     */
    public Object plugin(Object target) {
        return Plugin.wrap(target, this);
    }

    /**
     * Sets properties.
     *
     * @param properties0 the properties 0
     */
    public void setProperties(Properties properties0) {
    }
}

