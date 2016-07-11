package com.WebEdu.DreamFlying.dao;

import java.util.List;

import com.WebEdu.DreamFlying.model.Manager;
import com.WebEdu.DreamFlying.model.Teacher;

public interface ManagerDao extends BaseDao<Manager> {
	public List<Manager> findManagerByUserName(String manager_username);
	public void update(Manager manager);
}
