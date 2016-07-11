package com.WebEdu.DreamFlying.service.dao;

import java.util.List;

import com.WebEdu.DreamFlying.model.Exam;

public interface ExamServiceDao extends BaseServiceDao<Exam> {
	public List<Exam> findByCoureseId(int cid);
}
