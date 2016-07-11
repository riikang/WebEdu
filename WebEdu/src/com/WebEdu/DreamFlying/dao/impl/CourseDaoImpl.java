package com.WebEdu.DreamFlying.dao.impl;

import java.util.List;

import com.WebEdu.DreamFlying.dao.CourseDao;
import com.WebEdu.DreamFlying.model.Course;

public class CourseDaoImpl extends BaseDaoImpl<Course> implements CourseDao {
	public List<Course> findByCourseName(String courseName){
		return (List<Course>)getHibernateTemplate().find("from Course where cname ='"+courseName+"'");
	}
	public List<Course> findPopular(){
		return (List<Course>)getHibernateTemplate().find("from Course order by heat desc").subList(0, 3);
	}
	public List<Course> findNewCourse(){
		return (List<Course>)getHibernateTemplate().find("from Course order by cid desc").subList(0, 4);
	}
	public List<Course> findGoodCourse(){
		return (List<Course>)getHibernateTemplate().find("from Course order by cid").subList(0, 3);
	}
	public void updateCourse(Course course){
		getHibernateTemplate().update(course);
	}
	public List<Course> findMyCourse(int sid){
		String hql="from Course c join Take_class tc on c.cid=tc.course_id join Student s on tc.student_id='"+sid+"'";
		//String hql="from take_class where sid=3";
		//String hql="select c.cname from Course c,Student s,take_class tc where c.cid=tc.cid and s.sid=tc.sid";
		return (List<Course>)getHibernateTemplate().find(hql);
	}
}
