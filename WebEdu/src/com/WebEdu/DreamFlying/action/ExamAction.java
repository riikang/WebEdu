package com.WebEdu.DreamFlying.action;

import java.util.List;

import javax.annotation.Resource;

import com.WebEdu.DreamFlying.dao.ExamDao;
import com.WebEdu.DreamFlying.model.Course;
import com.WebEdu.DreamFlying.model.Exam;
import com.WebEdu.DreamFlying.model.Student;
import com.WebEdu.DreamFlying.model.Test;
import com.WebEdu.DreamFlying.service.dao.CourseServiceDao;
import com.WebEdu.DreamFlying.service.dao.ExamServiceDao;
import com.WebEdu.DreamFlying.service.dao.StudentServiceDao;
import com.WebEdu.DreamFlying.service.dao.TestServiceDao;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class ExamAction extends ActionSupport {
	@Resource private ExamServiceDao examServiceDao;
	@Resource private CourseServiceDao courseServiceDao;
	@Resource private StudentServiceDao stuServiceDao;
	@Resource private TestServiceDao testServiceDao;
	private List<Course> courses;
	private List<Student> stus;
	private Course course;
	private Test test;
	List<Exam> exams;
	List<Test> tests;
	Exam exam;
	
	
	public List<Test> getTests() {
		return tests;
	}
	public void setTests(List<Test> tests) {
		this.tests = tests;
	}
	public List<Student> getStus() {
		return stus;
	}
	public void setStus(List<Student> stus) {
		this.stus = stus;
	}
	public List<Exam> getExams() {
		return exams;
	}
	public void setExams(List<Exam> exams) {
		this.exams = exams;
	}
	public Exam getExam() {
		return exam;
	}
	public void setExam(Exam exam) {
		this.exam = exam;
	}
	public List<Course> getCourses() {
		return courses;
	}
	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}
	public Test getTest() {
		return test;
	}
	public void setTest(Test test) {
		this.test = test;
	}
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
	
	public String findExam() throws Exception {
		String ids=String.valueOf(ActionContext.getContext().getApplication().get("ccid"));
		int idt=Integer.valueOf(ids);
		course=courseServiceDao.findById(Course.class, idt);
		String sname=String.valueOf(ActionContext.getContext().getApplication().get("username"));
		stus=stuServiceDao.findByName(sname);
		tests=testServiceDao.CountExam(idt, stus.get(0).getSid());
		int ii=0;
		for(int i=0;i<tests.size();i++){
			if(tests.get(i).getScore()>=60){
				ii++;
			}
		}
		if(ii>=course.getCredit()){
			return "findExam_fail";
		}else{
			exams=examServiceDao.findByCoureseId(idt);
			return "findExam_success";	
		}
	}
	
	public String RecordTest() throws Exception{
		String uname=String.valueOf(ActionContext.getContext().getApplication().get("username"));
		String ids=String.valueOf(ActionContext.getContext().getApplication().get("ccid"));
		int idt=Integer.valueOf(ids);
		course=courseServiceDao.findById(Course.class, idt);
		stus=stuServiceDao.findByName(uname);
		test.setCourse(course);
		test.setStudent(stus.get(0));
		testServiceDao.save(test);
		if(test.getScore()>=60){
			int i=stus.get(0).getCredit()+1;
			stus.get(0).setCredit(i);
			stuServiceDao.update(stus.get(0));
		}
		return "RecordTest_success";
	}
	
	
}
