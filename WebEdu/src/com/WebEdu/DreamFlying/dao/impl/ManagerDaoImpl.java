package com.WebEdu.DreamFlying.dao.impl;

import java.util.List;

import com.WebEdu.DreamFlying.model.Manager;
import com.WebEdu.DreamFlying.model.Teacher;
import com.WebEdu.DreamFlying.dao.ManagerDao;

public class ManagerDaoImpl extends BaseDaoImpl<Manager> implements ManagerDao{

	@SuppressWarnings("unchecked")
	@Override
	public List<Manager> findManagerByUserName(String manager_username) {
		System.out.println("into ManagerDaoImpl");
		System.out.println(manager_username);
		System.out.println((List<Manager>) getHibernateTemplate().find("from Manager where username='"+manager_username+"'"));
		return (List<Manager>) getHibernateTemplate().find("from Manager where username='"+manager_username+"'");
	}
	
	public void update(Manager manager){
		System.out.println(manager.getMid());
		getHibernateTemplate().update(manager);;
	}
	
}
