package com.wdy.framework.config;

import org.springframework.data.redis.connection.Message;
import org.springframework.data.redis.connection.MessageListener;
import org.springframework.stereotype.Component;

@Component
public class SubscribeListener implements MessageListener {
    /**
     * 获取订阅信息
     * @param message
     * @param bytes
     */
    @Override
    public void onMessage(Message message, byte[] bytes) {
        String channel = new String(bytes);
        String m = new String(message.getBody());
        System.out.println(channel+"-"+m);
    }
}
