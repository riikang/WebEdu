package com.WebEdu.DreamFlying.action;

import java.io.File;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.swing.JOptionPane;

import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;

import com.WebEdu.DreamFlying.model.Course;
import com.WebEdu.DreamFlying.model.Resources;
import com.WebEdu.DreamFlying.model.Teacher;
import com.WebEdu.DreamFlying.service.dao.CourseServiceDao;
import com.WebEdu.DreamFlying.service.dao.ResourceServiceDao;
import com.WebEdu.DreamFlying.service.dao.TeacherServiceDao;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class TeacherAction extends ActionSupport {

	@Resource private TeacherServiceDao teacherServiceDao;
	@Resource private CourseServiceDao courseServiceDao;
	@Resource private ResourceServiceDao resourceServiceDao;
	private List<Course> courses;
	private Course course;
	private List<Resources> resources;
	private Resources resource;
	private List<Teacher> teachers;
	private Teacher teacher;
	private File upload;

	private String uploadContentType;

	private String uploadFileName;

	private String result;
	private HttpServletRequest request;
	String string;
	public List<Teacher> getTeachers() {
		return teachers;
	}
	public void setTeachers(List<Teacher> teachers) {
		this.teachers = teachers;
	}
	public Teacher getTeacher() {
		return teacher;
	}
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	public List<Course> getCourses() {
		return courses;
	}
	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
	public List<Resources> getResources() {
		return resources;
	}
	public void setResources(List<Resources> resources) {
		this.resources = resources;
	}
	public Resources getResource() {
		return resource;
	}
	public void setResource(Resources resource) {
		this.resource = resource;
	}
	public File getUpload() {
		return upload;
	}

	public void setUpload(File upload) {
		this.upload = upload;
	}

	public String getUploadContentType() {
		return uploadContentType;
	}

	public void setUploadContentType(String uploadContentType) {
		this.uploadContentType = uploadContentType;
	}

	public String getUploadFileName() {
		return uploadFileName;
	}

	public void setUploadFileName(String uploadFileName) {
		this.uploadFileName = uploadFileName;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}
	
	public String loginCheck(){
		teachers=teacherServiceDao.findTeacherByUserName(teacher.getUsername());
		if (teachers.isEmpty()) {
			//addFieldError("teacher.username", "用户名不存在");
			JOptionPane.showMessageDialog(null, "用户名不存在");
			return "teacher_login_fail";
		}
		if(!teacher.getPassword().equals(teachers.get(0).getPassword())){
			//addFieldError("teacher.password", "密码输入不正确");
			JOptionPane.showMessageDialog(null, "密码输入不正确");
			return "teacher_login_fail";
		}
		ActionContext.getContext().getSession().put("uesername", "你好,"+teacher.getTname());
		return "teacher_login_success";
	}
	
	public String  addAllResources() throws Exception {
		courses=courseServiceDao.findAll(Course.class);
		return "addAllResources";
	}
	public String  addResource() throws Exception {
		String path = ServletActionContext.getServletContext().getRealPath("/resource");
		File file = new File(path);
		if (!file.exists()) {
			file.mkdir();
		}
		resource.setResource_name(uploadFileName);
		String resourcePath="resource/"+uploadFileName;
		resource.setUrl(resourcePath);
		course=courseServiceDao.findById(Course.class,course.getCid());
		resource.setCourse(course);
		resourceServiceDao.save(resource);
		FileUtils.copyFile(upload, new File(file, uploadFileName));
		result = "上传成功!";
		return SUCCESS;
	}
	
	public String findAllResources(){
		try {
			System.out.println("into findAllResources");
			resources=resourceServiceDao.findAll(Resources.class);
			//System.out.println("resources : "+resources);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "teacherFindResources_success";
	}
	
	public String findResourceById(){
		try {
			//System.out.println("into findResourceById");
			courses=courseServiceDao.findAll(Course.class);
			//System.out.println("rid : "+resource.getRid());
			resource=resourceServiceDao.findById(Resources.class, resource.getRid());
			ActionContext.getContext().getApplication().put("cname", resource.getCourse().getCname());
		//	System.out.println(resource.getCourse().getCname());
		//	System.out.println("url : "+resource.getUrl());
			//request.setAttribute("url", resource.getUrl());
			//string=(String) request.getAttribute("url");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "findResourceById_success";
	}
	
	public String modifyResource(){
		try {
		//	System.out.println("into modifyResource");
		//	System.out.println(resource.getCourse().getCname()+"	 "+resource.getResource_name()+"	 "+resource.getResource_type());
		//	System.out.println(name[0]);
			String name[]=(resource.getCourse().getCname()).split(", ");
			courses=courseServiceDao.findByCourseName(name[0]);
			resource.setCourse(courses.get(0));
			
		//	System.out.println("url : "+resource.getUrl());
			if ((uploadFileName ==null) || (uploadFileName.equals(""))) {
				resourceServiceDao.update(resource);
			}else {
				//resource.setUrl(resource.getUrl());
				resourceServiceDao.update(resource);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "modifyResource_success";
	}
	
	public String deleteResource(){
		try {
			System.out.println("into deleteResource");
			System.out.println("rid : "+resource.getRid());
			resourceServiceDao.deleteById(Resources.class, resource.getRid());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "deleteResource_success";
	}

}
