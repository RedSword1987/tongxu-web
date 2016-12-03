package com.tongxuweb.redis;

import org.springframework.cache.annotation.Cacheable;

/**
 * Created by higgs on 16/12/1.
 */
public class Constant {

    @Cacheable("users")
    public String findByUsername(String username) {
        String sss = "asss";
        return sss;
    }
}
