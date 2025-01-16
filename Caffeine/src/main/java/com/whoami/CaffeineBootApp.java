package com.whoami;

import com.github.benmanes.caffeine.cache.Cache;
import com.github.benmanes.caffeine.cache.Caffeine;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

/**
 * @ Author：enrl
 * @ Date：2024-12-30-15:45
 * @ Version：1.0
 * @ Description：
 */
public class CaffeineBootApp {
    public static void main(String[] args) throws Exception {
        Cache<Object, String> cache = Caffeine.newBuilder()
                .maximumSize(100)
                .recordStats()
                .expireAfterAccess(Duration.ofSeconds(2))
                .removalListener((key, value, cause) -> System.out.println("key:" + key + " value:" + value + " cause:" + cause))
                .build();

        cache.put("a", "A");
        cache.put("b", "B");

        cache.invalidate("a");
        TimeUnit.SECONDS.sleep(3);
        System.out.println(cache.getIfPresent("b"));
        TimeUnit.SECONDS.sleep(Long.MAX_VALUE);

    }
}
