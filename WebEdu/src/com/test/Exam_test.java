package com.test;

import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.WebEdu.DreamFlying.model.Course;
import com.WebEdu.DreamFlying.model.Exam;
import com.WebEdu.DreamFlying.model.Resources;
import com.WebEdu.DreamFlying.model.Student;
import com.WebEdu.DreamFlying.model.Take_class;
import com.WebEdu.DreamFlying.model.Teacher;
import com.WebEdu.DreamFlying.model.Test;
import com.WebEdu.DreamFlying.service.dao.CourseServiceDao;
import com.WebEdu.DreamFlying.service.dao.ExamServiceDao;
import com.WebEdu.DreamFlying.service.dao.ResourceServiceDao;
import com.WebEdu.DreamFlying.service.dao.StudentServiceDao;
import com.WebEdu.DreamFlying.service.dao.Take_classServiceDao;
import com.WebEdu.DreamFlying.service.dao.TeacherServiceDao;
import com.WebEdu.DreamFlying.service.dao.TestServiceDao;

public class Exam_test {
	private static ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
//	private static TestServiceDao testService = (TestServiceDao) ctx
//			.getBean("TestServiceDao");
//	private static ResourceServiceDao resourceService = (ResourceServiceDao) ctx
//			.getBean("ResourceServiceDao");
//	private static ExamServiceDao examService = (ExamServiceDao) ctx
//			.getBean("ExamServiceDao");
	private static CourseServiceDao courseService = (CourseServiceDao) ctx
			.getBean("CourseServiceDao");
	private static StudentServiceDao stuService = (StudentServiceDao) ctx
			.getBean("StudentServiceDao");
	private static Take_classServiceDao take_classService = (Take_classServiceDao) ctx
			.getBean("Take_classServiceDao");
//	private static TeacherServiceDao tehService = (TeacherServiceDao) ctx
//			.getBean("TeacherServiceDao");
	
	
	public static void main(String[] args) throws Exception {
		add();
	}
	
	public static void add() throws Exception{
		Course course=new Course();
		List<Course> courses;
		Student stu=new Student();
//		List<Student> stus;
//		List<Take_class> tc;
//		tc=take_classService.findTake_classBysid(3);
//		System.out.println(tc.get(0).getCourse_id().getCname());
		Take_class tc=new Take_class();
		course=courseService.findById(Course.class, 35);
		stu=stuService.findById(Student.class, 2);
		tc.setCourse_id(course);
		tc.setStudent_id(stu);
		take_classService.save(tc);
		
//		stus=stuService.findByName("王小二");
//		//stus.get(0).getCourses();
//		//Object[] objects=stus.get(0).getCourses().toArray();
//		Iterator<Course> coursess;
//		//coursess=stus.get(0).getCourses().iterator();
//		String ss[]=new String[objects.length];
//		String s="";
//		for(int i=0;i<objects.length;i++){
//			s=s.valueOf(objects[i]);
//			ss[i]=s.substring(s.indexOf("=")+1, s.indexOf(","));
//			System.out.println(ss[i]);
//		}
		
//		course.setCname("aaa");
//		course.setDiscription("asdasd");
		
//		course.setCname("什么鬼");
//		course.setDiscription("啊啊实打实");
//		course.setCredit(2);
//		course.setHeat(1);
//		course.setCimg("E:\\归档\\大三上\\企业级javaⅡ");
//		
		
//		resource.setResource_name("hahaha");
//		resource.setResource_type("???");
//		resource.setUrl("asdasda");
		
		
		
		/*exam.setAnswer("B");
		exam.setQuestion("哈哈哈哈哈");
		exam.setOptionA("AAAAA");
		exam.setOptionB("BBBBB");
		exam.setOptionC("CCCCC");
		exam.setOptionD("DDDDD");*/
		
		
		
		
		try {
			//stu=stuService.findById(Student.class, 2);
			//course=courseService.findById(Course.class, 39);
			//test.setCourse(course);
			//test.setStudent(stu);
			//testService.save(test);
			//test=testService.findById(Test.class, 1);
			//System.out.println(test);
			//stu.getCourses().add(course);
			//stu.getCourses().add(course2);
			//course.getStudents().add(stu);
			//course2.getStudents().add(stu);
			
			//courseService.save(course);
			
//			resource.setCourse(course);
//			resourceService.save(resource);
			
			/*teh.getCourses().add(course);
			teh.getCourses().add(course2);
			course.getTeachers().add(teh);
			course2.getTeachers().add(teh);*/
			
			//exam.setCourse(course);
			
			//stuService.save(stu);
			//tehService.save(teh);
			//courseService.save(course);
			//courseService.save(course2);
			//examService.save(exam);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	
	}
	
}
