package com.tongxuweb.service.impl;

import com.tongxuweb.dao.TaskRunDao;
import com.tongxuweb.dao.TaskRunParamDao;
import com.tongxuweb.dao.TaskTypeDao;
import com.tongxuweb.dao.TbOrderDao;
import com.tongxuweb.domain.create.DTaskRun;
import com.tongxuweb.domain.entity.common.Pagination;
import com.tongxuweb.domain.entity.common.PaginationResult;
import com.tongxuweb.domain.generate.*;
import com.tongxuweb.service.TaskTypeService;
import com.tongxuweb.util.StringUtil;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class TaskTypeServiceImpl implements TaskTypeService {

    @Resource
    private TaskTypeDao taskTypeDao;

    @Resource
    private TaskRunDao taskRunDao;

    @Resource
    private TbOrderDao tbOrderDao;


    @Resource
    private TaskRunParamDao taskRunParamDao;


    public PaginationResult taskTypePage(Pagination pagination) {
        PaginationResult result = new PaginationResult();
        TaskTypeExample ex = new TaskTypeExample();
        ex.setOrderByClause("id asc limit " + pagination.getOffset() + "," + pagination.getLimit());
        List<TaskType> re = taskTypeDao.selectByExample(ex);

        Integer count = taskTypeDao.countByExample(new TaskTypeExample());
        pagination.setTotal(count);


        result.setPagination(pagination);
        result.setRows(re);
        return result;
    }


    public List<DTaskRun> listTaskRun(Pagination pagination, String code, Integer status) {
        TaskRunExample ex = new TaskRunExample();
        TaskRunExample.Criteria criteria = ex.createCriteria();
        if (!StringUtil.isEmpty(code)) {
            criteria.andCodeEqualTo(code);
        }
        if (status != null) {
            criteria.andStatusEqualTo(status);
        }
        ex.setOrderByClause("id asc limit " + pagination.getOffset() + "," + pagination.getLimit());
        List<TaskRun> re = taskRunDao.selectByExample(ex);
        return convert(re);
    }

    public PaginationResult taskRunPage(Pagination pagination, String code) {
        PaginationResult result = new PaginationResult();
        TaskRunExample ex = new TaskRunExample();
        TaskRunExample.Criteria criteria = ex.createCriteria();
        if (!StringUtil.isEmpty(code)) {
            criteria.andCodeEqualTo(code);
        }

        List<DTaskRun> li = listTaskRun(pagination, code, null);
        Integer count = taskRunDao.countByExample(ex);
        pagination.setTotal(count);


        result.setPagination(pagination);
        result.setRows(li);
        return result;
    }

    public void taskRunDelete(List<Long> ids) {
        if (ids.size() > 0) {
            TaskRunExample ex = new TaskRunExample();
            ex.createCriteria().andIdIn(ids);
            taskRunDao.deleteByExample(ex);

            TaskRunParamExample exP = new TaskRunParamExample();
            exP.createCriteria().andTaskRunIdIn(ids);
            taskRunParamDao.deleteByExample(exP);
        }
    }


    public List<DTaskRun> convert(List<TaskRun> taskRuns) {
        List<DTaskRun> result = new ArrayList<DTaskRun>();
        if (taskRuns != null && taskRuns.size() > 0) {
            List<Long> ids = new ArrayList<Long>();
            for (TaskRun taskRun : taskRuns) {
                ids.add(taskRun.getId());
            }
            TaskRunParamExample t = new TaskRunParamExample();
            t.createCriteria().andTaskRunIdIn(ids);
            List<TaskRunParam> rr = taskRunParamDao.selectByExample(t);
            Map<Long, Map<String, String>> paramMap = new HashMap<Long, Map<String, String>>();
            for (TaskRunParam taskRunParam : rr) {
                Map<String, String> temp = paramMap.get(taskRunParam.getTaskRunId());
                if (temp == null) {
                    temp = new HashMap<String, String>();
                }
                temp.put(taskRunParam.getKeyEn(), taskRunParam.getKeyValue());
                paramMap.put(taskRunParam.getTaskRunId(), temp);
            }

            for (TaskRun taskRun : taskRuns) {
                DTaskRun fa = new DTaskRun(taskRun);
                Map<String, String> temp = paramMap.get(taskRun.getId());
                if (temp != null && temp.size() > 0) {
                    String paramBeginDate = temp.get("paramBeginDate");
                    String paramEndDate = temp.get("paramEndDate");
                    String orderNum = temp.get("orderNum");
                    String orderIds = temp.get("orderIds");
                    fa.setParamBeginDate(paramBeginDate);
                    fa.setParamEndDate(paramEndDate);
                    fa.setOrderIds(orderIds);
                    fa.setOrderNum(orderNum);
                }
                result.add(fa);
            }

        }
        return result;
    }

    public void taskRunAdd(DTaskRun taskRun) {
        taskRun.setStatus(1);
        taskRunDao.insertSelective(taskRun);

        if (!StringUtil.isEmpty(taskRun.getCode())) {
            if ("main".equals(taskRun.getCode())) {
                TaskRunParam taskRunParam1 = new TaskRunParam();
                taskRunParam1.setKeyEn("paramBeginDate");
                taskRunParam1.setKeyValue(taskRun.getParamBeginDate());
                taskRunParam1.setTaskRunId(taskRun.getId());
                taskRunParam1.setType(1);

                TaskRunParam taskRunParam2 = new TaskRunParam();
                taskRunParam2.setKeyEn("paramEndDate");
                taskRunParam2.setKeyValue(taskRun.getParamEndDate());
                taskRunParam2.setTaskRunId(taskRun.getId());
                taskRunParam2.setType(1);

                taskRunParamDao.insertSelective(taskRunParam1);
                taskRunParamDao.insertSelective(taskRunParam2);
            } else if ("wuliu".equals(taskRun.getCode())) {

                //
                taskRun.initOrderNum();
                //

                TaskRunParam taskRunParam1 = new TaskRunParam();
                taskRunParam1.setKeyEn("orderIds");
                taskRunParam1.setKeyValue(taskRun.getOrderIds());
                taskRunParam1.setTaskRunId(taskRun.getId());
                taskRunParam1.setType(1);

                TaskRunParam taskRunParam2 = new TaskRunParam();
                taskRunParam2.setKeyEn("orderNum");
                taskRunParam2.setKeyValue(taskRun.getOrderNum());
                taskRunParam2.setTaskRunId(taskRun.getId());
                taskRunParam2.setType(1);

                taskRunParamDao.insertSelective(taskRunParam1);
                taskRunParamDao.insertSelective(taskRunParam2);
            } else if ("money".equals(taskRun.getCode())) {

                TbOrderExample ex = new TbOrderExample();
                ex.createCriteria().andStatusEqualTo(1).andDateIsNull();
                ex.setOrderByClause(" id desc limit 10");
                List<String> orderIds = new ArrayList<String>();
                List<TbOrder> ali = tbOrderDao.selectByExample(ex);
                for (TbOrder tbOrder : ali) {
                    orderIds.add(tbOrder.getOrderinfoId());
                }

                TaskRunParam taskRunParam1 = new TaskRunParam();
                taskRunParam1.setKeyEn("orderIds");
                taskRunParam1.setKeyValue(StringUtil.joinListString(orderIds, ","));
                taskRunParam1.setTaskRunId(taskRun.getId());
                taskRunParam1.setType(1);

                TaskRunParam taskRunParam2 = new TaskRunParam();
                taskRunParam2.setKeyEn("orderNum");
                taskRunParam2.setKeyValue(String.valueOf(orderIds.size()));
                taskRunParam2.setTaskRunId(taskRun.getId());
                taskRunParam2.setType(1);

                taskRunParamDao.insertSelective(taskRunParam1);
                taskRunParamDao.insertSelective(taskRunParam2);

            }
        }

    }

    public void taskRunUpdate(DTaskRun taskRun) {
        taskRunDao.updateByPrimaryKeySelective(taskRun);
        TaskRun old = taskRunDao.selectByPrimaryKey(taskRun.getId());
        if (!StringUtil.isEmpty(old.getCode())) {
            if ("main".equals(old.getCode())) {
                TaskRunParamExample t1 = new TaskRunParamExample();
                t1.createCriteria().andTaskRunIdEqualTo(taskRun.getId()).andKeyEnEqualTo("paramBeginDate");

                TaskRunParam taskRunParam1 = new TaskRunParam();
                taskRunParam1.setKeyValue(taskRun.getParamBeginDate());

                taskRunParamDao.updateByExampleSelective(taskRunParam1, t1);


                TaskRunParamExample t2 = new TaskRunParamExample();
                t2.createCriteria().andTaskRunIdEqualTo(taskRun.getId()).andKeyEnEqualTo("paramEndDate");

                TaskRunParam taskRunParam2 = new TaskRunParam();
                taskRunParam2.setKeyValue(taskRun.getParamEndDate());

                taskRunParamDao.updateByExampleSelective(taskRunParam2, t2);

            } else if ("wuliu".equals(old.getCode())) {
                taskRun.initOrderNum();

                TaskRunParamExample t1 = new TaskRunParamExample();
                t1.createCriteria().andTaskRunIdEqualTo(taskRun.getId()).andKeyEnEqualTo("orderNum");

                TaskRunParam taskRunParam1 = new TaskRunParam();
                taskRunParam1.setKeyValue(taskRun.getOrderNum());

                taskRunParamDao.updateByExampleSelective(taskRunParam1, t1);


                TaskRunParamExample t2 = new TaskRunParamExample();
                t2.createCriteria().andTaskRunIdEqualTo(taskRun.getId()).andKeyEnEqualTo("orderIds");

                TaskRunParam taskRunParam2 = new TaskRunParam();
                taskRunParam2.setKeyValue(taskRun.getOrderIds());

                taskRunParamDao.updateByExampleSelective(taskRunParam2, t2);

            }
        }

    }

    public PaginationResult taskRunWuliuResultPage(Pagination pagination, Long id) {
        TaskRunParamExample ex = new TaskRunParamExample();
        ex.createCriteria().andTaskRunIdEqualTo(id).andKeyEnEqualTo("orderIds");
        List<TaskRunParam> li = taskRunParamDao.selectByExample(ex);
        List<String> orderList = new ArrayList<String>();
        if (li.size() > 0) {
            for (String oneOrder : li.get(0).getKeyValue().split(",")) {
                orderList.add(oneOrder);
            }
        } else {
            orderList.add("");
        }


        PaginationResult result = new PaginationResult();
        TbOrderExample tbEx = new TbOrderExample();
        tbEx.createCriteria().andOrderinfoIdIn(orderList);
        tbEx.setOrderByClause("id asc limit " + pagination.getOffset() + "," + pagination.getLimit());
        List<TbOrder> re = tbOrderDao.selectByExample(tbEx);

        Integer count = tbOrderDao.countByExample(tbEx);
        pagination.setTotal(count);

        result.setPagination(pagination);
        result.setRows(re);
        return result;
    }
}
