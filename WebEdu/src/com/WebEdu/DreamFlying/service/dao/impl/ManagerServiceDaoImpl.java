package com.WebEdu.DreamFlying.service.dao.impl;

import java.util.List;

import com.WebEdu.DreamFlying.dao.ManagerDao;
import com.WebEdu.DreamFlying.model.Manager;
import com.WebEdu.DreamFlying.model.Teacher;
import com.WebEdu.DreamFlying.service.dao.ManagerServiceDao;

public class ManagerServiceDaoImpl extends BaseServiceDaoImpl<Manager> implements ManagerServiceDao{
	private ManagerDao managerDao;

	public ManagerDao getManagerDao() {
		return managerDao;
	}

	public void setManagerDao(ManagerDao managerDao) {
		this.managerDao = managerDao;
	}

	@Override
	public List<Manager> findManagerByUserName(String manager_username) {
		System.out.println("into ManagerServiceDaoImpl");
		System.out.println(manager_username);
		List<Manager> list=managerDao.findManagerByUserName(manager_username);
		System.out.println("list : "+list);
		return list;
	}
	
	public void update(Manager manager){
		managerDao.update(manager);
	}
	
}