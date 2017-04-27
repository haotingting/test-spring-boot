/**************************************************************************
 * Copyright (c) 2015-2017 Zhejiang TaChao Network Technology Co.,Ltd.
 * All rights reserved.
 * 
 * 项目名称：浙江踏潮-汇道体育
 * 版权说明：本软件属浙江踏潮网络科技有限公司所有，在未获得浙江踏潮网络科技有限公司正式授权
 *           情况下，任何企业和个人，不能获取、阅读、安装、传播本软件涉及的任何受知
 *           识产权保护的内容。                            
 ***************************************************************************/
package com.zjtachao.test.spring.boot.controller.user;

import javax.annotation.Resource;

import org.springframework.data.redis.core.SetOperations;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.zjtachao.test.spring.boot.controller.base.BaseController;
import com.zjtachao.test.spring.boot.pojo.bean.user.UserInfoBean;


 /**
 * 用户基本信息
 * @author <a href="mailto:dh@zjtachao.com">duhao</a>
 * @version $Id$   
 * @since 2.0
 */
@RestController
@RequestMapping("/user")
public class UserInfoController extends BaseController{
	
	/** redis **/
	@Resource(name="stringRedisTemplate")  
    private ValueOperations<String,String> valOps; 
	
	/** redis **/
	@Resource(name="stringRedisTemplate")  
	private SetOperations<String, String> setOps;

	/**
	 * 
	   * 查询 GET方式 （链接参数传递）
	   * @param id
	   * @return
	 */
	@RequestMapping(value = "/query/{id}" , method = RequestMethod.GET)
	@ResponseBody
    public UserInfoBean view(@PathVariable("id") Long id) {  
		UserInfoBean user = new UserInfoBean();  
        user.setId(id);  
        user.setName("zhang");
        logger.info("对象:{}",user);
        return user;  
	}
	
	/**
	 * 
	   * 设置数据 （请求json 返回json）
	   * @param key
	   * @param value
	   * @return
	 */
	@RequestMapping(value = "/set" , method = { RequestMethod.POST})
	@ResponseBody
	public UserInfoBean setKeyAndValue(@RequestBody UserInfoBean loginBean){
		//valOps.set(key, value);
		setOps.add(loginBean.getCode(), loginBean.getName());
		return loginBean;
	}
	
	/**
	 * 
	   * 获得数据
	   * @param key
	   * @return
	 */
	@RequestMapping("/get")
	public String getKeyAndValue(String key){
		return valOps.get(key);
	}
	
}
