package com.test;

import java.util.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.WebEdu.DreamFlying.model.Comment;
import com.WebEdu.DreamFlying.model.Resources;
import com.WebEdu.DreamFlying.service.dao.CommentServiceDao;
import com.WebEdu.DreamFlying.service.dao.ResourceServiceDao;

public class all_test {
	private static ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
	private static CommentServiceDao commentService = (CommentServiceDao) ctx
			.getBean("CommentServiceDao");
	private static ResourceServiceDao resourceService = (ResourceServiceDao) ctx
			.getBean("ResourceServiceDao");
	public static void main(String[] args) {
		add();
	}
	
	public static void add(){
		Comment com=new Comment();
		Resources resource=new Resources();
		
		com.setAuthor("13131");
		com.setContent("哈哈哈哈");
		com.setDate(new Date());
		
		resource.setResource_name("大战");
		resource.setResource_type("视频");
		resource.setUrl("??????????????");
				
		try {
			commentService.save(com);
			resourceService.save(resource);
		} catch (Exception e) {
			e.printStackTrace();
		}
	
	}
	
}
