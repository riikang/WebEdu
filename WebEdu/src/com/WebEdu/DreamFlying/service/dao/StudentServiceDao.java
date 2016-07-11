package com.WebEdu.DreamFlying.service.dao;

import java.util.List;

import com.WebEdu.DreamFlying.dao.BaseDao;
import com.WebEdu.DreamFlying.dao.StudentDao;
import com.WebEdu.DreamFlying.model.Student;

public interface StudentServiceDao extends BaseServiceDao<Student> {
	public List<Student> findByUserName(String student_username);
	public List<Student> findByName(String student_name);
	public List<Student> findAllStudents();
	public List<Student> findGoodStudents();
	public void update(Student student);
}
