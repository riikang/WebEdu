package com.WebEdu.DreamFlying.service.dao;

import java.util.List;

import com.WebEdu.DreamFlying.model.Comment;

public interface CommentServiceDao extends BaseServiceDao<Comment> {
	public List<Comment> findCommentByCourseid(int course_id);
}
