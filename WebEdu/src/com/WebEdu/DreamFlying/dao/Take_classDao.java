package com.WebEdu.DreamFlying.dao;

import java.util.List;

import com.WebEdu.DreamFlying.model.Comment;
import com.WebEdu.DreamFlying.model.Student;
import com.WebEdu.DreamFlying.model.Take_class;

public interface Take_classDao extends BaseDao<Take_class> {
	public List<Take_class> findTake_classBysid(int sid);
}
