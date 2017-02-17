package com.tongxuweb.service.impl;

import com.tongxuweb.dao.TaskGetdataTaobaoDao;
import com.tongxuweb.domain.generate.TaskGetdataTaobao;
import com.tongxuweb.domain.generate.TaskGetdataTaobaoOrder;
import com.tongxuweb.service.TaskGetdataTaobaoService;
import com.tongxuweb.util.DateUtil;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Date;

/**
 * Created by higgs on 17/2/14.
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class TaskGetdataTaobaoServiceImpl implements TaskGetdataTaobaoService{
    @Resource
    private TaskGetdataTaobaoDao taskGetdataTaobaoDao;


    public TaskGetdataTaobao save(TaskGetdataTaobao taskGetdataTaobao) {
        taskGetdataTaobao.setIsMerge(0);
        taskGetdataTaobaoDao.insertSelective(taskGetdataTaobao);
        return taskGetdataTaobao;
    }


}
