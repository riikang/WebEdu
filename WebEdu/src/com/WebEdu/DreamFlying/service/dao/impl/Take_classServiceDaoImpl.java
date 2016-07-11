package com.WebEdu.DreamFlying.service.dao.impl;

import java.util.List;

import com.WebEdu.DreamFlying.dao.CommentDao;
import com.WebEdu.DreamFlying.dao.Take_classDao;
import com.WebEdu.DreamFlying.model.Comment;
import com.WebEdu.DreamFlying.model.Take_class;
import com.WebEdu.DreamFlying.service.dao.Take_classServiceDao;

public class Take_classServiceDaoImpl extends BaseServiceDaoImpl<Take_class> implements Take_classServiceDao {
	private Take_classDao take_classDao;

	public Take_classDao getTake_classDao() {
		return take_classDao;
	}

	public void setTake_classDao(Take_classDao take_classDao) {
		this.take_classDao = take_classDao;
	}

	@Override
	public List<Take_class> findTake_classBysid(int sid) {
		return take_classDao.findTake_classBysid(sid);
	}
	
	
	
	
}
