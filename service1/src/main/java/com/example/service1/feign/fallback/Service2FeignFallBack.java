package com.example.service1.feign.fallback;

import com.example.service1.feign.Service2Client;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * @author xiaowu
 */
@Slf4j
@Component
public class Service2FeignFallBack implements Service2Client {

    @Setter
    Throwable cause;

    @Override
    public String test(String name) {
        System.out.println(cause.getMessage());
        return "走fallback逻辑,返回错误";
    }
}
