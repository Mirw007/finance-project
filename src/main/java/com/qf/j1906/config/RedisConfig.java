package com.qf.j1906.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;

/**
 * @Author: 大飞qwer
 * Date: 2019/12/9 15:03
 * @Version 1.0
 */
@Configuration
public class RedisConfig {
    @Bean
    public JedisConnectionFactory jedisConnectionFactory(){
        return new JedisConnectionFactory();
    }
    @Bean
    public RedisTemplate redisTemplate(@Qualifier("jedisConnectionFactory")JedisConnectionFactory jedisConnectionFactory){
        RedisTemplate<Object, Object> redisTemplate = new RedisTemplate<>();
        redisTemplate.setConnectionFactory(jedisConnectionFactory);
        redisTemplate.setKeySerializer(new RedisUtilsSerializable());
        redisTemplate.setValueSerializer(new RedisUtilsSerializable());
        return redisTemplate;
    }
}
