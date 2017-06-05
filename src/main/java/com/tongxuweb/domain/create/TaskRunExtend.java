package com.tongxuweb.domain.create;

import com.tongxuweb.domain.generate.TaskRun;

import java.util.Map;

/**
 */
public class TaskRunExtend extends TaskRun {

    Map<String, Object> param;

    public Map<String, Object> getParam() {
        return param;
    }

    public void setParam(Map<String, Object> param) {
        this.param = param;
    }
}
