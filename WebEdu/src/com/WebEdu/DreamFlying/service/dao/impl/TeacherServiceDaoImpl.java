package com.WebEdu.DreamFlying.service.dao.impl;

import java.util.List;

import com.WebEdu.DreamFlying.dao.StudentDao;
import com.WebEdu.DreamFlying.dao.TeacherDao;
import com.WebEdu.DreamFlying.model.Teacher;
import com.WebEdu.DreamFlying.service.dao.TeacherServiceDao;

public class TeacherServiceDaoImpl extends BaseServiceDaoImpl<Teacher> 
			implements TeacherServiceDao
{
	private TeacherDao teacherDao;
	
	public TeacherDao getTeacherDao() {
		return teacherDao;
	}

	public void setTeacherDao(TeacherDao teacherDao) {
		this.teacherDao = teacherDao;
	}

	@Override
	public List<Teacher> findAllTeachers() {
		List<Teacher> teachersList=teacherDao.findAllTeachers();
		return teachersList;
	}

	@Override
	public List<Teacher> findTeacherByUserName(String teacher_username) {
		return teacherDao.findTeacherByUserName(teacher_username);
	}
	
	public void update(Teacher teacher){
		teacherDao.update(teacher);
	}
	
}
