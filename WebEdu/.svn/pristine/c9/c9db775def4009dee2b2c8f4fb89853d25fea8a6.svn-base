package com.WebEdu.DreamFlying.dao.impl;

import java.util.List;

import com.WebEdu.DreamFlying.dao.TeacherDao;
import com.WebEdu.DreamFlying.model.Teacher;

/**
 * @author  riikang
 */

public class TeacherDaoImpl extends BaseDaoImpl<Teacher> implements TeacherDao{

	@Override
	public List<Teacher> findAllTeachers() {
		// TODO Auto-generated method stub
		return (List<Teacher>) getHibernateTemplate().find("from Teacher");
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Teacher> findTeacherByUserName(String teacher_username) {
		//System.out.println("into TeacherDaoImpl");
		//System.out.println(teacher_username);
		//List<Teacher> list=(List<Teacher>) getHibernateTemplate().find("from Teacher where username='"+teacher_username+ "'");
		//System.out.println("list : "+list);
		return (List<Teacher>) getHibernateTemplate().find("from Teacher where username='"+teacher_username+ "'");
	}
	
	public void update(Teacher teacher){
		getHibernateTemplate().update(teacher);
	}

}
