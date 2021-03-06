package com.WebEdu.DreamFlying.service.dao.impl;


import java.util.List;

import com.WebEdu.DreamFlying.dao.TestDao;
import com.WebEdu.DreamFlying.model.Test;
import com.WebEdu.DreamFlying.service.dao.TestServiceDao;

public class TestServiceDaoImpl extends BaseServiceDaoImpl<Test> implements TestServiceDao {
	private TestDao testDao;
	public TestDao getTestDao() {
		return testDao;
	}
	public void setTestDao(TestDao testDao) {
		this.testDao = testDao;
	}
	
	public List<Test> CountExam(int cid,int sid){
		return testDao.CountExam(cid, sid);
	}
	public List<Test> FindExam(int cid,int sid){
		return testDao.FindExam(cid, sid);
	}
}
