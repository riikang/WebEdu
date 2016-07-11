package com.test;

import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.WebEdu.DreamFlying.model.Course;
import com.WebEdu.DreamFlying.model.Student;
import com.WebEdu.DreamFlying.service.dao.CourseServiceDao;
import com.WebEdu.DreamFlying.service.dao.StudentServiceDao;

public class take_class_test {
	private static ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
	private static StudentServiceDao studentService = (StudentServiceDao) ctx
			.getBean("StudentServiceDao");
	private static CourseServiceDao courseService = (CourseServiceDao) ctx
			.getBean("CourseServiceDao");
	
	public static void main(String[] args) {
		add();
	}
	
	public static void add(){
//		Student stu= new Student();
//		Course cou=new Course();
//		Course cou2=new Course();
//		
//		stu.setUsername("15011");
//		stu.setPassword("0020");
//		stu.setSname("嘿嘿11哼ie");
//		stu.setAddress("hggh");
//		stu.setBirthday(new Date());
//		stu.setSex("boy");
//		stu.setPhoneNum("18811755789");
//		stu.setCredit(30);
//		
//		cou.setCname("绘");
//		cou.setDiscription("好学");
//		
//		cou2.setCname("aaa");
//		cou2.setDiscription("asdasd");
//		
//		try {
//			stu.getCourses().add(cou);
//			stu.getCourses().add(cou2);
//			cou.getStudents().add(stu);
//			cou2.getStudents().add(stu);
//			studentService.save(stu);
//			//courseService.save(cou);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		
		try {
			List<Student> students =(List<Student>) studentService.findByUserName("15011");
	for (Student student : students) {
		System.out.println("findAll:"+student);
	}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		

	
	}
}
