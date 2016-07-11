package com.WebEdu.DreamFlying.dao.impl;

import java.util.List;
import com.WebEdu.DreamFlying.dao.TestDao;
import com.WebEdu.DreamFlying.model.Test;

public class TestDaoImpl extends BaseDaoImpl<Test> implements TestDao {
	public List<Test> CountExam(int cid,int sid){
		return  (List<Test>)getHibernateTemplate().find("from Test where course='"+cid+"' and student='"+sid+"'");
	}
	public List<Test> FindExam(int cid,int sid){
		return (List<Test>) getHibernateTemplate().find("from Test where course='"+cid+"' and student='"+sid+"'");
	}
}
