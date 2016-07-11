package com.WebEdu.DreamFlying.model;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

//学生类
public class Student {
	private int sid;// 学生id
	private String username;// 用户名
	private String password;// 密码
	private String sname;// 学生姓名
	private String sex;// 性别
	private Date birthday;// 出生日期
	private String address;// 联系地址
	private String phoneNum;// 联系电话
	private int credit;// 已获得学分
	//private Set<Course> courses=new HashSet<Course>();

	public Student() {

	}

	public Student(int sid, String username, String password, String sname,
			String sex, Date birthday, String address, String phoneNum,
			int credit) {
		this.sid = sid;
		this.username = username;
		this.password = password;
		this.sname = sname;
		this.sex = sex;
		this.birthday = birthday;
		this.address = address;
		this.phoneNum = phoneNum;
		this.credit = credit;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
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

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
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

	public int getCredit() {
		return credit;
	}

	public void setCredit(int credit) {
		this.credit = credit;
	}
	

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", username=" + username + ", password="
				+ password + ", sname=" + sname + ", sex=" + sex
				+ ", birthday=" + birthday + ", address=" + address
				+ ", phoneNum=" + phoneNum + ", credit=" + credit + "]";
	}

}
