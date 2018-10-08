package com.thinking.gateway.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import lombok.extern.slf4j.Slf4j;

import javax.servlet.http.HttpServletRequest;

/**
 * @Author：caoj
 * @Description：
 * @Date：Created in 2018/9/27
 */
@Slf4j
public class AccessFilter extends ZuulFilter {


    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() {

        RequestContext context = RequestContext.getCurrentContext();
        HttpServletRequest request = context.getRequest();

        log.info("send {} request to {}.", request.getMethod(), request.getRequestURL().toString());
        String accessToken = request.getParameter("accessToken");
        if(accessToken == null){
            log.warn("access token is empty.");
            context.setSendZuulResponse(false);
            context.setResponseStatusCode(401);
            context.setResponseBody("access token is empty.");
            return null;
        }
        log.info("access token ok.");
        return null;
    }
}
