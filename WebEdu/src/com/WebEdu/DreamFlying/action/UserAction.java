package com.WebEdu.DreamFlying.action;

import java.io.File;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.List;
import javax.annotation.Resource;
import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;
import com.WebEdu.DreamFlying.model.Student;
import com.WebEdu.DreamFlying.service.dao.StudentServiceDao;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;


public class UserAction extends ActionSupport {
	@Resource private StudentServiceDao stuService;
	private List<Student> stus;
	private Student stu;
	public String inputPath;
	public String filename;
	public String downloadFileName;
	public InputStream inputStream;
	private String inputCode;
	private String createCode;
	
	
	public String getInputCode() {
		return inputCode;
	}
	public void setInputCode(String inputCode) {
		this.inputCode = inputCode;
	}
	public String getCreateCode() {
		return createCode;
	}
	public void setCreateCode(String createCode) {
		this.createCode = createCode;
	}
	public String getInputPath() {
		return inputPath;
	}
	public void setInputPath(String inputPath) {
		this.inputPath = inputPath;
	}
	public String getFilename() {
		return filename;
	}
	public void setFilename(String filename) {
		this.filename = filename;
	}
	public List<Student> getStus() {
		return stus;
	}
	public void setStus(List<Student> stus) {
		this.stus = stus;
	}
	public Student getStu() {
		return stu;
	}
	public void setStu(Student stu) {
		this.stu = stu;
	}
	
	public String loginCheck() {
		System.out.println(createCode);
		System.out.println(inputCode);
		stus=stuService.findByUserName(stu.getUsername());
		if(stus.isEmpty()){
			addFieldError("stu.username", "用户名不存在");
			return "notin";
		}
		if(!stu.getPassword().equals(stus.get(0).getPassword())){
			addFieldError("stu.password", "密码输入不正确");
			return "notin";
		}
		if(!createCode.equals(inputCode)){
			addFieldError("inputCode", "验证码输入错误");
			return "notin";
		}
		ActionContext.getContext().getApplication().put("username", stus.get(0).getSname());
		return SUCCESS;
	}
	
	public String logOut(){
		ActionContext.getContext().getApplication().remove("username");
		return "logout";
	}
	
	@Override
	public String execute() throws Exception {
	
		return SUCCESS;
	}
	
	public InputStream getInputStream()throws Exception{ 
      String path=ServletActionContext.getServletContext().getRealPath("/resource/");
      String filepath=path+filename;
      System.out.println(filepath);
      File file=new File(filepath);
      return FileUtils.openInputStream(file);
      
  }  
	
	public String  getDownloadFileName() {
		downloadFileName="";
		try {
			downloadFileName=URLEncoder.encode(filename,"UTF-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		return downloadFileName;
	} 
	
}
