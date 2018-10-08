package com.thinking.trace;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.servlet.http.HttpServletRequest;

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

    @RequestMapping(value = "/trace-2", method = RequestMethod.GET)
    public String trace(HttpServletRequest request) {
        log.info("===<call trace-2, TraceId={}, SpanId={}>===",
                request.getHeader("X-B3-TraceId"), request.getHeader("X-B3-SpanId"));
        return "Trace";
    }

}
