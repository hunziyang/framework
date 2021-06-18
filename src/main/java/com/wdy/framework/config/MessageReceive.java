package com.wdy.framework.config;

import com.wdy.framework.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer;
import org.springframework.stereotype.Component;

@Component
public class MessageReceive {

    @Autowired
    private Jackson2JsonRedisSerializer jackson2JsonRedisSerializer;
    public void receive(String str){
        Student student =(Student)jackson2JsonRedisSerializer.deserialize(str.getBytes());
        System.out.println(student.getName());
    }
}
