package com.example.service1.feign.factory;

import com.example.service1.feign.Service2Client;
import com.example.service1.feign.fallback.Service2FeignFallBack;
import org.springframework.cloud.openfeign.FallbackFactory;
import org.springframework.stereotype.Component;

/**
 * @author xiaowu
 */
@Component
public class Service2FeignFactory implements FallbackFactory<Service2Client> {

    @Override
    public Service2Client create(Throwable cause) {
        Service2FeignFallBack service2FeignFallBack = new Service2FeignFallBack();
        service2FeignFallBack.setCause(cause);
        return service2FeignFallBack;
    }
}
