package com.WebEdu.DreamFlying.service.dao.impl;

import java.util.List;

import com.WebEdu.DreamFlying.dao.CourseDao;
import com.WebEdu.DreamFlying.model.Course;
import com.WebEdu.DreamFlying.service.dao.CourseServiceDao;

public class CourseServiceDaoImpl extends BaseServiceDaoImpl<Course> implements
		CourseServiceDao {

	private CourseDao courseDao;

	public CourseDao getCourseDao() {
		return courseDao;
	}

	public void setCourseDao(CourseDao courseDao) {
		this.courseDao = courseDao;
	}
	
	public List<Course> findByCourseName(String courseName){
		return courseDao.findByCourseName(courseName);
	}
	public List<Course> findPopular(){
		return courseDao.findPopular();
	}
	public List<Course> findNewCourse(){
		return courseDao.findNewCourse();
	}
	public List<Course> findGoodCourse(){
		return courseDao.findGoodCourse();
	}
	
	public void update(Course course){
		courseDao.updateCourse(course);
	}
	public List<Course> findMyCourse(int sid){
		return courseDao.findMyCourse(sid);
	}
	
}