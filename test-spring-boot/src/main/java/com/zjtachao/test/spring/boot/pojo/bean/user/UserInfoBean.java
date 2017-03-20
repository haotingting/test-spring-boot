/**************************************************************************
 * Copyright (c) 2015-2017 Zhejiang TaChao Network Technology Co.,Ltd.
 * All rights reserved.
 * 
 * 项目名称：浙江踏潮-汇道体育
 * 版权说明：本软件属浙江踏潮网络科技有限公司所有，在未获得浙江踏潮网络科技有限公司正式授权
 *           情况下，任何企业和个人，不能获取、阅读、安装、传播本软件涉及的任何受知
 *           识产权保护的内容。                            
 ***************************************************************************/
package com.zjtachao.test.spring.boot.pojo.bean.user;

import java.io.Serializable;


 /**
 * 用户基本信息
 * @author <a href="mailto:dh@zjtachao.com">duhao</a>
 * @version $Id$   
 * @since 2.0
 */

public class UserInfoBean implements Serializable {

	
	 /**  序列化  */
	private static final long serialVersionUID = -8762568905402871618L;
	
	/** 用户基本信息 **/
	private Long id;
	
	/** 用户名称 **/
	private String name;

	/**  
	 *@return  the id
	 */
	
	public Long getId() {
		return id;
	}

	/** 
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**  
	 *@return  the name
	 */
	
	public String getName() {
		return name;
	}

	/** 
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

}
