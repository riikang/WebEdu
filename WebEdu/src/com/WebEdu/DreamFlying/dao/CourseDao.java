package com.WebEdu.DreamFlying.dao;

import java.util.List;
import com.WebEdu.DreamFlying.model.Course;

public interface CourseDao extends BaseDao<Course> {
	public List<Course> findByCourseName(String courseName);
	public List<Course> findPopular();
	public List<Course> findNewCourse();
	public List<Course> findGoodCourse();
	public List<Course> findMyCourse(int sid);
	public void updateCourse(Course course);
}
