/**************************************************************************
 * Copyright (c) 2015-2017 Zhejiang TaChao Network Technology Co.,Ltd.
 * All rights reserved.
 * 
 * 项目名称：浙江踏潮-汇道体育
 * 版权说明：本软件属浙江踏潮网络科技有限公司所有，在未获得浙江踏潮网络科技有限公司正式授权
 *           情况下，任何企业和个人，不能获取、阅读、安装、传播本软件涉及的任何受知
 *           识产权保护的内容。                            
 ***************************************************************************/
package com.zjtachao.test.spring.boot.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.zjtachao.test.spring.boot.Interceptor.UserAuthInterceptor;


 /**
 * Spring Boot启动类
 * @author <a href="mailto:dh@zjtachao.com">duhao</a>
 * @version $Id$   
 * @since 2.0
 */
@EnableAutoConfiguration
@SpringBootApplication
@ComponentScan("com.zjtachao")
public class TestApplication extends WebMvcConfigurerAdapter {
	
	/**
	 * 
	   * 主启动方法
	   * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(TestApplication.class, args);
	}
	
	/**
	 * 增加拦截器
	 * @param registry
	 * @see org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter#addInterceptors(org.springframework.web.servlet.config.annotation.InterceptorRegistry)
	 */
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new UserAuthInterceptor());
    }
	
	
}
