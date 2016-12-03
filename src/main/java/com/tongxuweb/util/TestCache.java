package com.tongxuweb.util;

import org.springframework.cache.annotation.Cacheable;

/**
 * Created by higgs on 16/12/1.
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
