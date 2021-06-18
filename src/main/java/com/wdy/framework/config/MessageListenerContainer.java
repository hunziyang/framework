package com.wdy.framework.config;

import org.springframework.context.annotation.Bean;
import org.springframework.data.redis.connection.lettuce.LettuceConnectionFactory;
import org.springframework.data.redis.listener.PatternTopic;
import org.springframework.data.redis.listener.RedisMessageListenerContainer;
import org.springframework.data.redis.listener.adapter.MessageListenerAdapter;
import org.springframework.stereotype.Component;

@Component
public class MessageListenerContainer {
    /**
     * 制定REDIS订阅规则
     * @param lettuceConnectionFactory
     * @return
     */
    @Bean
    public RedisMessageListenerContainer redisMessageListenerContainer(LettuceConnectionFactory lettuceConnectionFactory,MessageListenerAdapter messageListenerAdapter){
        RedisMessageListenerContainer container =new RedisMessageListenerContainer();
        container.setConnectionFactory(lettuceConnectionFactory);
        container.addMessageListener(new SubscribeListener(),new PatternTopic("subscribe"));
        container.addMessageListener(messageListenerAdapter,new PatternTopic("student"));
        return container;
    }

    @Bean
    public MessageListenerAdapter messageListenerAdapter(MessageReceive messageReceive){
        return new MessageListenerAdapter(messageReceive,"receive");
    }
}
