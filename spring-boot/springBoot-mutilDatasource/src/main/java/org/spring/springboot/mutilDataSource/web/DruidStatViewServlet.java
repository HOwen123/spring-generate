package org.spring.springboot.mutilDataSource.web;

import com.alibaba.druid.support.http.StatViewServlet;

import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;

/**
 * @author chenssy
 * @date 2017/6/4
 * @since v1.0.0
 */
@WebServlet(urlPatterns = "/druid/*",//通过哪个url访问
        initParams = {
                @WebInitParam(name = "loginUsername", value = "chenssy"),//用户名
                @WebInitParam(name = "loginPassword", value = "123456"), //密码
                @WebInitParam(name = "resetEnable", value = "true"),//是否可以重置
        })
public class DruidStatViewServlet extends StatViewServlet {
}
