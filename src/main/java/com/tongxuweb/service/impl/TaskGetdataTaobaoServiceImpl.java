package com.tongxuweb.service.impl;

import com.tongxuweb.dao.TaskGetdataTaobaoDao;
import com.tongxuweb.dao.TaskGetdataTaobaoOrderidsDao;
import com.tongxuweb.domain.create.OTaskGetdataTaobao;
import com.tongxuweb.domain.entity.SearchTaskBean;
import com.tongxuweb.domain.entity.common.PaginationResult;
import com.tongxuweb.domain.generate.TaskGetdataTaobao;
import com.tongxuweb.domain.generate.TaskGetdataTaobaoOrderids;
import com.tongxuweb.service.TaskGetdataTaobaoService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by higgs on 17/2/14.
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class TaskGetdataTaobaoServiceImpl implements TaskGetdataTaobaoService{
    @Resource
    private TaskGetdataTaobaoDao taskGetdataTaobaoDao;

    @Resource
    private TaskGetdataTaobaoOrderidsDao taskGetdataTaobaoOrderidsDao;


    public OTaskGetdataTaobao save(OTaskGetdataTaobao taskGetdataTaobao) {
        taskGetdataTaobao.setIsMerge(0);
        taskGetdataTaobao.setStatus(1);
        if (2==taskGetdataTaobao.getType()){
            taskGetdataTaobao.setBeginDate(null);
            taskGetdataTaobao.setEndDate(null);
        }
        taskGetdataTaobaoDao.insertSelective(taskGetdataTaobao);
        Long id = taskGetdataTaobao.getId();
        if (id != null && taskGetdataTaobao.getOrderids() != null && taskGetdataTaobao.getOrderids().size() > 0) {
            for (String ids : taskGetdataTaobao.getOrderids()) {
                TaskGetdataTaobaoOrderids taskGetdataTaobaoOrderids = new TaskGetdataTaobaoOrderids();
                taskGetdataTaobaoOrderids.setTaskId(id);
                taskGetdataTaobaoOrderids.setOrderinfoId(ids);
                taskGetdataTaobaoOrderidsDao.insertSelective(taskGetdataTaobaoOrderids);
                System.out.println(taskGetdataTaobaoOrderids);
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
        searchTaskBean.setTotalNumber(count);


        result.setPagination(searchTaskBean);
        result.setData(re);
        return result;
    }


}
