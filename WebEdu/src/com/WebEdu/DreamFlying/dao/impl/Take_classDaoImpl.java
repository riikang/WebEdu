package com.WebEdu.DreamFlying.dao.impl;

import java.util.List;

import com.WebEdu.DreamFlying.dao.Take_classDao;
import com.WebEdu.DreamFlying.model.Take_class;

public class Take_classDaoImpl extends BaseDaoImpl<Take_class> implements Take_classDao {
	public List<Take_class> findTake_classBysid(int sid){
		return (List<Take_class>)getHibernateTemplate().find("from Take_class where student_id='"+sid+"'");
	}
}
