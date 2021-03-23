package com.wdy.framework.controller;

import com.wdy.framework.util.result.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/redis")
public class RedisController {
    @Autowired
    @Qualifier("springRedisTemplate")
    private RedisTemplate redisTemplate;

    @GetMapping("/test")
    public Result test(){
        redisTemplate.opsForValue().set("yang","yang");
        return Result.success();
    }
}
