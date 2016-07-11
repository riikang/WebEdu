package com.WebEdu.DreamFlying.action;

import java.util.List;

import javax.annotation.Resource;

import com.WebEdu.DreamFlying.model.Course;
import com.WebEdu.DreamFlying.model.Student;
import com.WebEdu.DreamFlying.service.dao.CourseServiceDao;
import com.WebEdu.DreamFlying.service.dao.StudentServiceDao;
import com.opensymphony.xwork2.ActionSupport;

public class WelcomeAction extends ActionSupport  {
	private Course course;
	private List<Course> courses;
	private List<Course> popular_courses;
	private List<Course> new_courses;
	private List<Course> good_courses;
	private List<Student> good_student;
	@Resource private CourseServiceDao courseService;
	@Resource private StudentServiceDao studentService;
	
	
	public List<Student> getGood_student() {
		return good_student;
	}
	public void setGood_student(List<Student> good_student) {
		this.good_student = good_student;
	}
	public List<Course> getPopular_courses() {
		return popular_courses;
	}
	public void setPopular_courses(List<Course> popular_courses) {
		this.popular_courses = popular_courses;
	}
	public List<Course> getNew_courses() {
		return new_courses;
	}
	public void setNew_courses(List<Course> new_courses) {
		this.new_courses = new_courses;
	}
	public List<Course> getGood_courses() {
		return good_courses;
	}
	public void setGood_courses(List<Course> good_courses) {
		this.good_courses = good_courses;
	}
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
	public List<Course> getCourses() {
		return courses;
	}
	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}
	
	public String updateIndex(){
		popular_courses=courseService.findPopular();
		new_courses=courseService.findNewCourse();
		good_courses=courseService.findGoodCourse();
		good_student=studentService.findGoodStudents();
		return "update_success";
	}
	
}
