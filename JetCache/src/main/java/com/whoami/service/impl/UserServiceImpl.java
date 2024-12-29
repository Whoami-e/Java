package com.whoami.service.impl;

import com.alicp.jetcache.Cache;
import com.alicp.jetcache.CacheManager;
import com.alicp.jetcache.anno.CacheType;
import com.alicp.jetcache.anno.Cached;
import com.alicp.jetcache.template.QuickConfig;
import com.whoami.entity.User;
import com.whoami.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

/**
 * @ Author：enrl
 * @ Date：2024-12-28-20:37
 * @ Version：1.0
 * @ Description：
 */
@Service
public class UserServiceImpl implements UserService {

    @Resource
    private CacheManager cacheManager;
    private Cache<String, User> cache;


    @PostConstruct
    public void init() {
        QuickConfig qc = QuickConfig.newBuilder(":user")
                .expire(Duration.ofMinutes(10))
                .cacheType(CacheType.BOTH)
                .syncLocal(true)
                .build();
        cache = cacheManager.getOrCreateCache(qc);
    }


    @Override
    @Cached(name = ":user", expire = 10, timeUnit = TimeUnit.MINUTES, cacheType = CacheType.BOTH)
    public User getUser() {
        return new User().builder("MR.X", 25);
    }
}
