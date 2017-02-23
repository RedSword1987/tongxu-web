package com.tongxuweb.service.interceptor;


import org.apache.ibatis.executor.statement.StatementHandler;
import org.apache.ibatis.mapping.BoundSql;
import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.plugin.Intercepts;
import org.apache.ibatis.plugin.Invocation;
import org.apache.ibatis.plugin.Plugin;
import org.apache.ibatis.plugin.Signature;
import org.apache.ibatis.reflection.DefaultReflectorFactory;
import org.apache.ibatis.reflection.MetaObject;
import org.apache.ibatis.reflection.ReflectorFactory;
import org.apache.ibatis.reflection.factory.DefaultObjectFactory;
import org.apache.ibatis.reflection.factory.ObjectFactory;
import org.apache.ibatis.reflection.wrapper.DefaultObjectWrapperFactory;
import org.apache.ibatis.reflection.wrapper.ObjectWrapperFactory;
import org.apache.ibatis.session.RowBounds;

import java.sql.Connection;
import java.util.Properties;


@Intercepts(@Signature(type = StatementHandler.class, method = "prepare", args = {Connection
        .class }))
public class PageInterceptor implements Interceptor {
    /**
     * The constant SQL_END_DELIMITER.
     */
    protected static final String SQL_END_DELIMITER = ";";
    private static final ObjectFactory DEFAULT_OBJECT_FACTORY = new DefaultObjectFactory();
    private static final ObjectWrapperFactory DEFAULT_OBJECT_WRAPPER_FACTORY = new
            DefaultObjectWrapperFactory();
    private static final ReflectorFactory DEFAULT_REFLECTOR_FACTORY = new DefaultReflectorFactory();

    /**
     * Intercept object.
     *
     * @param invocation the invocation
     * @return the object
     * @throws Throwable the throwable
     */
    public Object intercept(Invocation invocation) throws Throwable {

        StatementHandler statementHandler = (StatementHandler) invocation.getTarget();
        MetaObject metaStatementHandler = MetaObject.forObject(statementHandler, DEFAULT_OBJECT_FACTORY,
                DEFAULT_OBJECT_WRAPPER_FACTORY, DEFAULT_REFLECTOR_FACTORY);

        BoundSql boundSql = statementHandler.getBoundSql();

        RowBounds rowBounds = (RowBounds) metaStatementHandler.getValue("delegate.rowBounds");

        if (rowBounds == null || rowBounds == RowBounds.DEFAULT) {

            return invocation.proceed();

        }

        String originalSql = (String) metaStatementHandler.getValue("delegate.boundSql.sql");

        metaStatementHandler.setValue("delegate.boundSql.sql", getLimitString(originalSql, rowBounds
                .getOffset(), rowBounds.getLimit()));

        metaStatementHandler.setValue("delegate.rowBounds.offset", RowBounds.NO_ROW_OFFSET);

        metaStatementHandler.setValue("delegate.rowBounds.limit", RowBounds.NO_ROW_LIMIT);

        System.out.println(boundSql);
        return invocation.proceed();

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
     * @param properties the properties
     */
    public void setProperties(Properties properties) {

    }

    /**
     * Gets limit string.
     *
     * @param sql1   the sql 1
     * @param offset the offset
     * @param limit  the limit
     * @return the limit string
     */
    public String getLimitString(String sql1, int offset, int limit) {
        String sql = sql1;
        sql = trim(sql);
        StringBuffer sb = new StringBuffer(sql.length() + 20);
        sb.append(sql);
        if (offset > 0) {
            sb.append(" limit ").append(offset).append(',').append(limit)
                    .append(SQL_END_DELIMITER);
            //pg: limit ? offset ?
            //mysql:limit ?,?
            //
        } else {
            sb.append(" limit ").append(limit);
        }
        //SQL_END_DELIMITER
        return sb.toString();
    }

    private String trim(String sql1) {
        String sql = sql1;
        sql = sql.trim();
        if (sql.endsWith(SQL_END_DELIMITER)) {
            sql = sql.substring(0, sql.length() - 1
                    - SQL_END_DELIMITER.length());
        }
        return sql;
    }


}
