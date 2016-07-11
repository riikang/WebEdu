package com.WebEdu.DreamFlying.service.dao.impl;
import java.util.List;

import com.WebEdu.DreamFlying.dao.StudentDao;
import com.WebEdu.DreamFlying.model.Student;
import com.WebEdu.DreamFlying.service.dao.StudentServiceDao;



public class StudentServiceDaoImpl extends BaseServiceDaoImpl<Student> implements
		StudentServiceDao {
	private StudentDao studentDao;

	public StudentDao getStudentDao() {
		return studentDao;
	}

	public void setStudentDao(StudentDao studentDao) {
		this.studentDao = studentDao;
	}

	@Override
	public List<Student> findByUserName(String student_username) {
		return studentDao.findStudentByUserName(student_username);
	}

	@Override
	public List<Student> findAllStudents() {
		List<Student> studentsList=studentDao.findAllStudents();
		return studentsList;
	}

	public List<Student> findByName(String student_name){
		return studentDao.findStudentByName(student_name);
	}
	
	public List<Student> findGoodStudents(){
		return studentDao.findGoodStudents();
	}
	
	public void update(Student student){
		studentDao.update(student);
	}
	
}
