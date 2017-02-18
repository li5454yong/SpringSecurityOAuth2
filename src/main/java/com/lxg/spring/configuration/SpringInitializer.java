package com.lxg.spring.configuration;

import javax.servlet.Filter;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
/**
 * 配置DispatcherServlet、初始化Spring MVC容器和Spring容器
 * 
 * @author lxg
 *
 * 2017年2月17日下午2:02:39
 */
public class SpringInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
 
    @Override
    protected Class<?>[] getRootConfigClasses() {//获取Spring应用容器的配置文件
        return new Class[] { SpringConfiguration.class };
    }
  
    @Override
    protected Class<?>[] getServletConfigClasses() {//获取Spring MVC应用容器
        return null;
    }
  
    @Override
    protected String[] getServletMappings() {//指定需要由DispatcherServlet映射的路径，这里给定的是"/"，意思是由DispatcherServlet处理所有向该应用发起的请求。
        return new String[] { "/" };
    }
    
    @Override
    protected Filter[] getServletFilters() {//添加拦截器
    	Filter [] singleton = { new CORSFilter()};
    	return singleton;
    }
 
}