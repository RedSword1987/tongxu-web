package com.tongxuweb.util;

import org.springframework.cache.annotation.Cacheable;

/**
 */
public class TestCache {
    @Cacheable("testCache")
    public static String sss(String ss) {
        return ss + "asffs";
    }

    public String sssaaaaaaa(String ss) {
        return ss + "asffs";
    }
}
