package org.spring.springboot.mutilDataSource.web;

import com.alibaba.druid.support.http.WebStatFilter;

import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;

/**
 * @author chenssy
 * @date 2017/6/4
 * @since v1.0.0
 */
@WebFilter(filterName = "druidStatFilter",      //过滤器名称
        urlPatterns = "/",                      //需要拦截的url
        initParams = {                          //filter初始化信息
                //需要忽略的资源
                @WebInitParam(name = "exclusions", value = "*.js,*.gif,*.jpg," +
                        "*.bmp,*.png,*.css,*.ico,/druid/*"),
                @WebInitParam(name = "sessionStatEnable", value = "true"),
                @WebInitParam(name = "profileEnable", value = "true")})
public class DruidStatFilter extends WebStatFilter{
}
