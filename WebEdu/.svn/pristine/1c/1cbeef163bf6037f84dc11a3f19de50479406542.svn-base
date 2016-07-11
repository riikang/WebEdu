package com.WebEdu.DreamFlying.service.dao.impl;

import java.util.List;

import com.WebEdu.DreamFlying.dao.ExamDao;
import com.WebEdu.DreamFlying.model.Exam;
import com.WebEdu.DreamFlying.service.dao.ExamServiceDao;

public class ExamServiceDaoImpl extends BaseServiceDaoImpl<Exam> implements
			ExamServiceDao {
	private ExamDao ExamDao;

	public ExamDao getExamDao() {
		return ExamDao;
	}

	public void setExamDao(ExamDao ExamDao) {
		this.ExamDao = ExamDao;
	}

	@Override
	public List<Exam> findByCoureseId(int cid) {
		return ExamDao.findExamByCoureseId(cid);
	}
}
