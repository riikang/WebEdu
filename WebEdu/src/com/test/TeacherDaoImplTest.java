
package com.test;

import java.util.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.WebEdu.DreamFlying.model.Teacher;
import com.WebEdu.DreamFlying.service.dao.BaseServiceDao;
import com.WebEdu.DreamFlying.service.dao.StudentServiceDao;
import com.WebEdu.DreamFlying.service.dao.TeacherServiceDao;

public class TeacherDaoImplTest {
	private static ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
	private static TeacherServiceDao teacherService = (TeacherServiceDao) ctx
			.getBean("TeacherServiceDao");
	
	public static void setTeacherService(TeacherServiceDao teacherService) {
		TeacherDaoImplTest.teacherService = teacherService;
	}
	
	public static TeacherServiceDao getTeacherService() {
		return teacherService;
		
	}
	
	public static void main(String[] args) {
		add();
	}
	
	public static void add(){
		System.out.println("111111");
		Teacher teh = new Teacher();
		teh.setUsername("134011");
		teh.setPassword("0000");
		teh.setTname("嘿嘿嗯哼ie");
		teh.setAddress("hhh");
		teh.setBirthday(new Date());
		teh.setSex("boy");
		teh.setPhoneNum("18814117789");
		
		System.out.println("22222222");
		try {
			teacherService.save(teh);
			System.out.println("33333333");
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
