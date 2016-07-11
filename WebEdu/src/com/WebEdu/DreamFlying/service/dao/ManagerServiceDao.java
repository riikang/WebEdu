package com.WebEdu.DreamFlying.service.dao;

import java.util.List;

import com.WebEdu.DreamFlying.model.Manager;
import com.WebEdu.DreamFlying.model.Teacher;

public interface ManagerServiceDao extends BaseServiceDao<Manager> {
	public List<Manager> findManagerByUserName(String manager_username);
	public void update(Manager manager);
}