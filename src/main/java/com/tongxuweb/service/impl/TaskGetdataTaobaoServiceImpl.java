package com.tongxuweb.service.impl;

import com.tongxuweb.dao.TaskGetdataTaobaoDao;
import com.tongxuweb.dao.TaskGetdataTaobaoOrderDao;
import com.tongxuweb.domain.create.OTaskGetdataTaobao;
import com.tongxuweb.domain.entity.SearchTaskBean;
import com.tongxuweb.domain.entity.SearchTaskResultBean;
import com.tongxuweb.domain.entity.common.PaginationResult;
import com.tongxuweb.domain.generate.TaskGetdataTaobao;
import com.tongxuweb.domain.generate.TaskGetdataTaobaoExample;
import com.tongxuweb.domain.generate.TaskGetdataTaobaoOrder;
import com.tongxuweb.service.TaskGetdataTaobaoService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class TaskGetdataTaobaoServiceImpl implements TaskGetdataTaobaoService{
    @Resource
    private TaskGetdataTaobaoDao taskGetdataTaobaoDao;

    @Resource
    private TaskGetdataTaobaoOrderDao taskGetdataTaobaoOrderDao;


    public TaskGetdataTaobao getOne(Long id) {
        return taskGetdataTaobaoDao.selectByPrimaryKey(id);
    }

    public OTaskGetdataTaobao save(OTaskGetdataTaobao taskGetdataTaobao) {
        taskGetdataTaobao.setIsMerge(0);
        taskGetdataTaobao.setStatus(1);
        taskGetdataTaobao.setTypeNum(0);
        if (2==taskGetdataTaobao.getType()){
            taskGetdataTaobao.setBeginDate(null);
            taskGetdataTaobao.setEndDate(null);
            if (taskGetdataTaobao.getOrderids() != null && taskGetdataTaobao.getOrderids().size() > 0) {
                taskGetdataTaobao.setTypeNum(taskGetdataTaobao.getOrderids().size());
            }
        }


        taskGetdataTaobaoDao.insertSelective(taskGetdataTaobao);
        Long id = taskGetdataTaobao.getId();
        if (id != null && taskGetdataTaobao.getOrderids() != null && taskGetdataTaobao.getOrderids().size() > 0) {
            for (String ids : taskGetdataTaobao.getOrderids()) {

                TaskGetdataTaobaoOrder taskGetdataTaobaoOrder = new TaskGetdataTaobaoOrder();
                taskGetdataTaobaoOrder.setOrderinfoId(ids);
                taskGetdataTaobaoOrder.setTaskId(id);
                taskGetdataTaobaoOrderDao.insertSelective(taskGetdataTaobaoOrder);

            }
        }
        return taskGetdataTaobao;
    }

    public List<OTaskGetdataTaobao> getNeedTask() {
        List<OTaskGetdataTaobao> result = taskGetdataTaobaoDao.listNeedTask();

        if (result == null) {
            result = new ArrayList<OTaskGetdataTaobao>();
        } else {
            for (OTaskGetdataTaobao oTaskGetdataTaobao : result) {
                if (2 == oTaskGetdataTaobao.getType()) {
                    oTaskGetdataTaobao.setOrderids(taskGetdataTaobaoDao.getOrderids(oTaskGetdataTaobao.getId()));
                }

            }
        }
        return result;
    }

    public int finishTask(TaskGetdataTaobao taskGetdataTaobao) {
        int result = 0;
        if (taskGetdataTaobao != null && taskGetdataTaobao.getId() != null) {
            taskGetdataTaobao.setStatus(2);
            result = taskGetdataTaobaoDao.updateByPrimaryKeySelective(taskGetdataTaobao);
        }

        return result;
    }

    public PaginationResult listTask(SearchTaskBean searchTaskBean) {
        PaginationResult result = new PaginationResult();

        List<TaskGetdataTaobao> re = taskGetdataTaobaoDao.listTask(searchTaskBean);
        Integer count = taskGetdataTaobaoDao.countTask(searchTaskBean);
        searchTaskBean.setTotal(count);


        result.setPagination(searchTaskBean);
        result.setRows(re);
        return result;
    }

    public PaginationResult listTaskResult(SearchTaskResultBean searchTaskResultBean) {
        PaginationResult result = new PaginationResult();

        TaskGetdataTaobao task = null;
        if (searchTaskResultBean.getId() != null) {
            task = taskGetdataTaobaoDao.selectByPrimaryKey(searchTaskResultBean.getId());
        }

        List<TaskGetdataTaobaoOrder> re = null;
        if (task != null) {
            if (1 == task.getType()) {
                searchTaskResultBean.setBeginDate(task.getBeginDate());
                searchTaskResultBean.setEndDate(task.getBeginDate());

                re = taskGetdataTaobaoDao.listTaskResult1(searchTaskResultBean);
                Integer count = taskGetdataTaobaoDao.countTaskResult1(searchTaskResultBean);
                searchTaskResultBean.setTotal(count);

            } else if (2 == task.getType()) {
                re = taskGetdataTaobaoDao.listTaskResult2(searchTaskResultBean);
                Integer count = taskGetdataTaobaoDao.countTaskResult2(searchTaskResultBean);
                searchTaskResultBean.setTotal(count);

            }
        } else {
            re = taskGetdataTaobaoDao.listTaskResult1(searchTaskResultBean);
            Integer count = taskGetdataTaobaoDao.countTaskResult1(searchTaskResultBean);
            searchTaskResultBean.setTotal(count);
        }


        result.setPagination(searchTaskResultBean);
        result.setRows(re);
        return result;
    }

    public List<Map<String, Object>> listTaskResultMap(SearchTaskResultBean searchTaskResultBean) {
        List<Map<String, Object>> result = new ArrayList<Map<String, Object>>();
        TaskGetdataTaobao task = null;
        if (searchTaskResultBean.getId()!=null){
            task=taskGetdataTaobaoDao.selectByPrimaryKey(searchTaskResultBean.getId());
        }
        if (task!=null){
            if (1 == task.getType()) {
                searchTaskResultBean.setBeginDate(task.getBeginDate());
                searchTaskResultBean.setEndDate(task.getBeginDate());
                result = taskGetdataTaobaoDao.listTaskResult1Map(searchTaskResultBean);

            } else if (2 == task.getType()) {
                result = taskGetdataTaobaoDao.listTaskResult2Map(searchTaskResultBean);
            }
        }else{
            result = taskGetdataTaobaoDao.listTaskResult1Map(searchTaskResultBean);
        }

        return result;
    }

    public boolean updateTaskuStatus(String ids, Integer status) {
        boolean result = true;
        String[] at = ids.split(",");
        List<Long> idList = new ArrayList<Long>();
        for (String id : at) {
            idList.add(Long.valueOf(id));
        }
        TaskGetdataTaobaoExample example = new TaskGetdataTaobaoExample();
        example.createCriteria().andIdIn(idList);
        TaskGetdataTaobao remp = new TaskGetdataTaobao();
        remp.setStatus(status);
        taskGetdataTaobaoDao.updateByExampleSelective(remp, example);
        return result;
    }

    public void update(TaskGetdataTaobao taskGetdataTaobao) {
        taskGetdataTaobaoDao.updateByPrimaryKeySelective(taskGetdataTaobao);
    }


}
