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

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.zjtachao.test.spring.boot.pojo.bean.user.UserInfoBean;


 /**
 * 用户基本信息
 * @author <a href="mailto:dh@zjtachao.com">duhao</a>
 * @version $Id$   
 * @since 2.0
 */
@EnableAutoConfiguration
@RestController
@RequestMapping("/user")
public class UserInfoController {

	@RequestMapping("/{id}")
	@ResponseBody
    public UserInfoBean view(@PathVariable("id") Long id) {  
		UserInfoBean user = new UserInfoBean();  
        user.setId(id);  
        user.setName("zhang");  
        return user;  
	}
	
}
