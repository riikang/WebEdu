package com.WebEdu.DreamFlying.model;

import java.util.Date;

public class Comment {
	private int comid;
	private String content;
	private Date date;
	private String author;
	private Course course_id;
	
	
	public Course getCourse_id() {
		return course_id;
	}
	public void setCourse_id(Course course_id) {
		this.course_id = course_id;
	}
	public int getComid() {
		return comid;
	}
	public void setComid(int comid) {
		this.comid = comid;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
	
}
