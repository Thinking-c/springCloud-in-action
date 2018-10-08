package com.thinking.trace;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Author：caoj
 * @Description：
 * @Date：Created in 2018/9/27
 */
@RestController
public class TraceController {

    private static final Logger log = LoggerFactory.getLogger(TraceController.class);
    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping(value = "/trace-1", method = RequestMethod.GET)
    public String trace() {
        log.info("===<call trace-1>===");
        return restTemplate.getForEntity("http://trace-2/trace-2", String.class).getBody();
    }

}
