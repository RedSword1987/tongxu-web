package com.tongxuweixin.menu;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Configuration;

/**
 * Created by higgs on 16/12/15.
 */
@Configuration
@EnableCaching
public class WeixinConfig {
    @Value("${weixin_corpId}")
    private String weixin_corpId;

    @Value("${weixin_secret}")
    private String weixin_secret;

    @Value("${weixin_token}")
    private String weixin_token;

    public static String weixin_corpId_="wx2fd1d3906c5ef8f9";
    public static String weixin_secret_="b5b18c7c1fe8d889adc1922a41a03053";
    public static String weixin_token_;

    static {
        try {

        } catch (Exception e) {

        }
    }


}
