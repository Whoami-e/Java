package com.whoami.config;

import com.alicp.jetcache.anno.config.EnableMethodCache;
import org.springframework.context.annotation.Configuration;

/**
 * @ Author：enrl
 * @ Date：2024-12-28-20:25
 * @ Version：1.0
 * @ Description：JetCache配置类
 */
@EnableMethodCache(basePackages = "com.whoami")
@Configuration
public class JetCacheConfig {
}
