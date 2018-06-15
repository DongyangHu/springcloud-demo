package com.hudongyang.springcloud.servicefeign.feigninterface;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "service-hi")
public interface HiInterface {
    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    String sayHiFromClientOne();
}