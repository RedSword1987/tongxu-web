package com.tongxuweb.redis;

import org.springframework.cache.annotation.Cacheable;

/**
 */
public class Constant {

    @Cacheable("users")
    public String findByUsername(String username) {
        String sss = "asss";
        return sss;
    }
}
