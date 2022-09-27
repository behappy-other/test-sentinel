package com.example.service1.feign;

import com.example.service1.feign.factory.Service2FeignFactory;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "service2",fallbackFactory = Service2FeignFactory.class)
public interface Service2Client {

    @GetMapping("/{name}")
    String test(@PathVariable("name") String name);
}