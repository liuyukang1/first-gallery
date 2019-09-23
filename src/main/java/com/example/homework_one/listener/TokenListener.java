package com.example.homework_one.listener;

import org.springframework.data.redis.core.RedisTemplate;

import javax.annotation.Resource;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import java.util.List;

/**
 * @author: lyk
 * @date: 9/22/2019
 */
@WebListener
public class TokenListener implements ServletContextListener {

    @Resource
    private RedisTemplate redisTemplate;

    private static final String ALL_TOKEN = "ALL_USER_TOKENS";

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        List<String> tokens
                = redisTemplate.opsForList().range(ALL_TOKEN, 0, -1);

        System.out.println("当前redis存储量为：" + tokens.size());
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("上下文销毁");
    }
}
