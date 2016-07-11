package com.WebEdu.DreamFlying.service.dao;
import java.util.List;

import com.WebEdu.DreamFlying.model.Teacher;

public interface TeacherServiceDao extends BaseServiceDao<Teacher> {
	public List<Teacher> findAllTeachers();
	public List<Teacher> findTeacherByUserName(String teacher_username);
	public void update(Teacher teacher);
}
