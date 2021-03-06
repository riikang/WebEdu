package com.WebEdu.DreamFlying.model;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

//教师类
public class Teacher {
	private int tid;// 学号
	private String username;// 工号
	private String password;// 密码
	private String tname;// 教师姓名
	private String sex;// 性别
	private Date birthday;// 出生日期
	private String address;// 联系地址
	private String phoneNum;// 联系电话
	private Set<Course> courses=new HashSet<Course>();
	
	public Teacher() {

	}
	
	public Teacher(int tid, String username, String password, String tname,
			String sex, Date birthday, String address, String phoneNum) {
		this.tid = tid;
		this.username = username;
		this.password = password;
		this.tname = tname;
		this.sex = sex;
		this.birthday = birthday;
		this.address = address;
		this.phoneNum = phoneNum;
	}
	
	public Set<Course> getCourses() {
		return courses;
	}

	public void setCourses(Set<Course> courses) {
		this.courses = courses;
	}

	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhoneNum() {
		return phoneNum;
	}
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
	
	
	
}
