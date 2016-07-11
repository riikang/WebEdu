package com.WebEdu.DreamFlying.dao;

import java.util.List;

import com.WebEdu.DreamFlying.model.Comment;

public interface CommentDao extends BaseDao<Comment> {
	public List<Comment> findCommentByCourseid(int course_id);
}
