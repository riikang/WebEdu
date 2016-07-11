package com.test;

import java.util.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.WebEdu.DreamFlying.dao.BaseDao;
import com.WebEdu.DreamFlying.dao.impl.BaseDaoImpl;
import com.WebEdu.DreamFlying.model.Course;
import com.WebEdu.DreamFlying.model.Teacher;
import com.WebEdu.DreamFlying.service.dao.CourseServiceDao;
import com.WebEdu.DreamFlying.service.dao.TeacherServiceDao;

public class teach_class_test {
	
	private static ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
	private static TeacherServiceDao teacherService = (TeacherServiceDao) ctx
			.getBean("TeacherServiceDao");
	private static CourseServiceDao courseService = (CourseServiceDao) ctx
			.getBean("CourseServiceDao");
	
	
	public static void main(String[] args) {
		add();
	}
	
	
	public static void add(){
		Teacher teh = new Teacher();
		Course cou=new Course();
		//Course cou2=new Course();
		
		teh.setUsername("14016");
		teh.setPassword("000");
		teh.setTname("嘿嘿哼ie");
		teh.setAddress("hh");
		teh.setBirthday(new Date());
		teh.setSex("boy");
		teh.setPhoneNum("188117789");
		
		cou.setCname("gqweqwe");
		cou.setDiscription("swerwerf");
		
//		cou2.setCname("qweqwe");
//		cou2.setDiscription("sdgsdg");
		
		try {
			teh.getCourses().add(cou);
			//teh.getCourses().add(cou2);
			cou.getTeachers().add(teh);
			//cou2.getTeachers().add(teh);
			teacherService.save(teh);
			//courseService.save(cou);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
//	@Test
//	public void update(){
//		try {
//			Student stu =baseService.findById(Student.class,1);
//			stu.setSname("bbbbbb");
//			baseService.update(stu);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
//	@Test
//	public void delete(){
//		try {
//			studentService.deleteById(Student.class,2);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
//	@Test
//	public void findAll(){
//		List<Student> students;
//		try {
//			students = studentService.findAll(Student.class);
//	for (Student student : students) {
//		System.out.println("findAll:"+student);
//	}
//			
//		} catch (Exception e) {
//			e.printStackTrace();
//			Assert.assertTrue(false);
//		}
//		
//	}

}
