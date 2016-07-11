package com.WebEdu.DreamFlying.action;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.swing.JOptionPane;

import com.WebEdu.DreamFlying.model.Manager;
import com.WebEdu.DreamFlying.model.Resources;
import com.WebEdu.DreamFlying.model.Student;
import com.WebEdu.DreamFlying.model.Teacher;
import com.WebEdu.DreamFlying.service.dao.ManagerServiceDao;
import com.WebEdu.DreamFlying.service.dao.ResourceServiceDao;
import com.WebEdu.DreamFlying.service.dao.StudentServiceDao;
import com.WebEdu.DreamFlying.service.dao.TeacherServiceDao;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class ManagerAction extends ActionSupport{
	@Resource ManagerServiceDao managerService;
	@Resource TeacherServiceDao teacherService;
	@Resource StudentServiceDao studentService;
	@Resource ResourceServiceDao resourceService;
	private Manager manager;
	private Teacher teacher;
	private Student student;
	private List<Manager> managers;
	private List<Teacher> teachers;
	private List<Student> students;
	private Resources resource;
	private List<Resources> resources;
	private String password1;
	private String password2;
	private HttpServletRequest request;
	public Manager getManager() {
		return manager;
	}
	public void setManager(Manager manager) {
		this.manager = manager;
	}
	public ManagerServiceDao getManagerService() {
		return managerService;
	}
	public void setManagerService(ManagerServiceDao managerService) {
		this.managerService = managerService;
	}
	public TeacherServiceDao getTeacherService() {
		return teacherService;
	}
	public void setTeacherServiceDao(TeacherServiceDao teacherService) {
		this.teacherService = teacherService;
	}
	public Teacher getTeacher() {
		return teacher;
	}
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public List<Manager> getManagers() {
		return managers;
	}
	public void setManagers(List<Manager> managers) {
		this.managers = managers;
	}
	public List<Teacher> getTeachers() {
		return teachers;
	}
	public void setTeachers(List<Teacher> teachers) {
		this.teachers = teachers;
	}
	
	public StudentServiceDao getStudentService() {
		return studentService;
	}
	public void setStudentService(StudentServiceDao studentService) {
		this.studentService = studentService;
	}
	public List<Student> getStudents() {
		return students;
	}
	public void setStudents(List<Student> students) {
		this.students = students;
	}
	public void setTeacherService(TeacherServiceDao teacherService) {
		this.teacherService = teacherService;
	}
	public Resources getResource() {
		return resource;
	}
	public void setResource(Resources resource) {
		this.resource = resource;
	}
	public List<Resources> getResources() {
		return resources;
	}
	public void setResources(List<Resources> resources) {
		this.resources = resources;
	}	
	public String getPassword1() {
		return password1;
	}
	public void setPassword1(String password1) {
		this.password1 = password1;
	}
	public String getPassword2() {
		return password2;
	}
	public void setPassword2(String password2) {
		this.password2 = password2;
	}
	public HttpServletRequest getRequest() {
		return request;
	}
	public void setRequest(HttpServletRequest request) {
		this.request = request;
	}
	
	public String loginCheck(){
		System.out.println("into logincheck");
		System.out.println("username : "+manager.getUsername());
		managers=managerService.findManagerByUserName(manager.getUsername());
		if (managers.isEmpty()) {
			JOptionPane.showMessageDialog(null, "用户名不存在");
			return "admin_login_fail";
		}
		if (!manager.getPassword().equals(managers.get(0).getPassword())) {
			JOptionPane.showMessageDialog(null, "密码输入不正确");
			return "admin_login_fail";
		}
		ActionContext.getContext().getApplication().put("username", managers.get(0).getUsername());
		return "admin_login_success";
	}
	
	public String resetPassword(){
		System.out.println("into resetPassword");
		String username=(String) ActionContext.getContext().getApplication().get("username");
		System.out.println("username : "+username);
		managers=managerService.findManagerByUserName(username);
		System.out.println("size : "+managers.size());
		if (!manager.getPassword().equals(managers.get(0).getPassword())) {
			JOptionPane.showMessageDialog(null, "原密码不正确");
			return "resetPassword_fail";
		}
		System.out.println("password1 : "+password1+" "+"password2 : "+password2);
		if (!password1.equals(password2)) {
			//JOptionPane.showMessageDialog(null, "再次输入的新密码与上面输入的不相同");
			return "resetPassword_fail";
		}
		
		try {
			manager=managerService.findById(Manager.class, managers.get(0).getMid());
			System.out.println("mid : "+manager.getMid());
			manager.setPassword(password1);
			managerService.update(manager);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		JOptionPane.showMessageDialog(null, "修改成功");
		return "resetPassword_success";
	}
	
	public String findAllTeachers(){
		System.out.println("OK");
		teachers=teacherService.findAllTeachers();
		System.out.println("teachersList : "+teachers);
		return "findAllTeachers";
	}
	public String addCourseFindAllTeachers(){
		System.out.println("OK");
		teachers=teacherService.findAllTeachers();
		System.out.println("teachersList : "+teachers);
		return "addCourse_FindAllTeachers";
	}
	
	public String findAllStudents(){
		//System.out.println("OK");
		students=studentService.findAllStudents();
		//System.out.println("studentList : "+students);
		return "findAllStudents";
	}
	
	public String findAllResources(){
		try {
			System.out.println("OK");
			resources=resourceService.findAll(Resources.class);
			System.out.println("resources : "+resources);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "managerFindResources_success";
	}
	
	public String findStudentById(){
		System.out.println("into findStudentById");
		System.out.println(student.getSid());
		try {
			student=studentService.findById(Student.class, student.getSid());
			System.out.println(student);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "findStudentById_success";
	}
	
	public String modifyStudent(){
		System.out.println("into modifyStudent");
		try {
			//student=studentService.findById(Student.class, student.getSid());
			System.out.println(student.getSid());
			System.out.println(student.getUsername());
			System.out.println(student.getSex());
			System.out.println(student.getBirthday());
			System.out.println(student.getPhoneNum());
			if (student.getPhoneNum().substring(0, 1).equals("0")) {
				JOptionPane.showMessageDialog(null, "联系电话的第一个数字不能为0");
				return "modifyStudent_fail";
			}
			if (student.getPhoneNum().length()!=11) {
				JOptionPane.showMessageDialog(null, "联系电话的长度必须为11位");
				return "modifyStudent_fail";
			}
			studentService.update(student);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "modifyStudent_success";
	}
	
	public String findTeacherById(){
		try {
			System.out.println("???????????????????");
			System.out.println(teacher.getTid());
			teacher=teacherService.findById(Teacher.class, teacher.getTid());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "findTeacherById_success";
	}
	
	public String deleteStudent(){
		try {
			studentService.deleteById(Student.class, student.getSid());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "deleteStudent_success";
	}
	
	public String modifyTeacher(){
		System.out.println("into modifyTeacher");
		System.out.println(teacher.getPhoneNum());
		System.out.println(teacher.getPhoneNum().substring(0, 1));
		if (teacher.getPhoneNum().substring(0, 1).equals("0")) {
			JOptionPane.showMessageDialog(null, "联系电话的第一个数字不能为0");
			return "modifyTeacher_fail";
		}
		if (teacher.getPhoneNum().length()!=11) {
			JOptionPane.showMessageDialog(null, "联系电话的长度必须为11位");
			return "modifyTeacher_fail";
		}
		teacherService.update(teacher);
		return "modifyTeacher_success";
	}
	
	public String deleteTeacher(){
		try {
			teacherService.deleteById(Teacher.class, teacher.getTid());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "deleteTeacher_success";
	}
}
