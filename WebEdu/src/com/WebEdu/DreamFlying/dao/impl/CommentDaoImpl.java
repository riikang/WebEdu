package com.WebEdu.DreamFlying.dao.impl;

import java.util.List;

import com.WebEdu.DreamFlying.dao.CommentDao;
import com.WebEdu.DreamFlying.model.Comment;

public class CommentDaoImpl extends BaseDaoImpl<Comment> implements CommentDao {
	public List<Comment> findCommentByCourseid(int course_id){
		return  (List<Comment>) getHibernateTemplate().find("from Comment where course_id ='"+course_id+"'");
	}
}
