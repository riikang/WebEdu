package com.WebEdu.DreamFlying.dao.impl;

import java.util.List;

import com.WebEdu.DreamFlying.dao.ExamDao;
import com.WebEdu.DreamFlying.model.Exam;
import com.WebEdu.DreamFlying.model.Student;

public class ExamDaoImpl extends BaseDaoImpl<Exam> implements ExamDao {
	@Override
	public List<Exam> findExamByCoureseId(int cid) {
		return (List<Exam>) getHibernateTemplate().find("from Exam where course ='"+cid+"'");
	}
}
