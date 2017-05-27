package com.tongxuweb.quartz.impl;

import com.tongxuweb.quartz.TbStaticQuartz;
import com.tongxuweb.util.DateUtil;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * Created by red
 */
@Component
public class TbStaticQuartzImpl implements TbStaticQuartz {
    //每5秒执行一次
    @Scheduled(cron = "0 0 */1 * * ? ")
    public void test() {
        System.out.println("-------定时器启动了-------" + DateUtil.getTimeStringNow("yyyy-MM-dd HH:mm:ss"));
    }
}
