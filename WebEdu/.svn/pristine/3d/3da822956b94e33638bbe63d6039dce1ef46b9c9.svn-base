package com.WebEdu.DreamFlying.action;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import com.WebEdu.DreamFlying.model.Comment;
import com.WebEdu.DreamFlying.model.Course;
import com.WebEdu.DreamFlying.service.dao.CommentServiceDao;
import com.WebEdu.DreamFlying.service.dao.CourseServiceDao;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class CommentAction extends ActionSupport {
	@Resource private CommentServiceDao commentService;
	@Resource private CourseServiceDao courseService;
	private List<Comment> comments;
	private Comment comment;
	private Course course;
	
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
	public List<Comment> getComments() {
		return comments;
	}
	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}
	public Comment getComment() {
		return comment;
	}
	public void setComment(Comment comment) {
		this.comment = comment;
	}
	
	public String saveComment() throws Exception{
		String ids=String.valueOf(ActionContext.getContext().getApplication().get("ccid"));
	 	int id=Integer.valueOf(ids);
		course=courseService.findById(Course.class, id);
		String name=String.valueOf(ActionContext.getContext().getApplication().get("username"));
		comment.setAuthor(name);
		comment.setDate(new Date());
		comment.setCourse_id(course);
		commentService.save(comment);
		return "saveComment_success";
	}
	
}
