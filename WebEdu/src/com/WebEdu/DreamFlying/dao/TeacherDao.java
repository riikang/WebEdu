package com.WebEdu.DreamFlying.dao;
import java.util.List;

import com.WebEdu.DreamFlying.model.Teacher;
/**
 * @author  riikang
 */

public interface TeacherDao extends BaseDao<Teacher> {
	
	public List<Teacher> findAllTeachers();
	public List<Teacher> findTeacherByUserName(String teacher_username);
	public void update(Teacher teacher);

}
