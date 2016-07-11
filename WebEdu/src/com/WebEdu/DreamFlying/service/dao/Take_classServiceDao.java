package com.WebEdu.DreamFlying.service.dao;

import java.util.List;

import com.WebEdu.DreamFlying.model.Take_class;

public interface Take_classServiceDao extends BaseServiceDao<Take_class> {
	public List<Take_class> findTake_classBysid(int sid);
}
