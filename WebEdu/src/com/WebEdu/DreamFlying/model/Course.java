package com.WebEdu.DreamFlying.model;

import java.util.HashSet;
import java.util.Set;

//课程类
public class Course {
	private int cid;//课程id
	private String cname;//课程名
	private String discription;//课程描述
	private String cimg;//课程封面
	private int credit;//学分
	private int heat;//课程热度
	private String type;
	private Set<Teacher> teachers=new HashSet<Teacher>();
	//private Set<Student> students=new HashSet<Student>();
	
	
	public Course() {
	}
	public Course(int cid, String cname, String discription,int credit,int heat) {
		//super();
		this.cid = cid;
		this.cname = cname;
		this.discription = discription;
		this.credit=credit;
		this.heat=heat;
	}
	
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getCimg() {
		return cimg;
	}
	public void setCimg(String cimg) {
		this.cimg = cimg;
	}
	public int getCredit() {
		return credit;
	}
	public void setCredit(int credit) {
		this.credit = credit;
	}
	public int getHeat() {
		return heat;
	}
	public void setHeat(int heat) {
		this.heat = heat;
	}
	public Set<Teacher> getTeachers() {
		return teachers;
	}
	public void setTeachers(Set<Teacher> teachers) {
		this.teachers = teachers;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getDiscription() {
		return discription;
	}
	public void setDiscription(String discription) {
		this.discription = discription;
	}
	@Override
	public String toString() {
		return "Course [cid=" + cid + ", cname=" + cname + ", discription="
				+ discription + "]";
	}
}
