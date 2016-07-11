package com.WebEdu.DreamFlying.service.dao.impl;

import java.util.List;

import com.WebEdu.DreamFlying.dao.CommentDao;
import com.WebEdu.DreamFlying.model.Comment;
import com.WebEdu.DreamFlying.service.dao.CommentServiceDao;

public class CommentServiceDaoImpl extends BaseServiceDaoImpl<Comment> implements CommentServiceDao {
	private CommentDao commentDao;

	public CommentDao getCommentDao() {
		return commentDao;
	}

	public void setCommentDao(CommentDao commentDao) {
		this.commentDao = commentDao;
	}
	
	public List<Comment> findCommentByCourseid(int course_id){
		return commentDao.findCommentByCourseid(course_id);
	}
	
}
