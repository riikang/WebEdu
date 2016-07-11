package com.WebEdu.DreamFlying.service.dao.impl;

import java.util.List;

import com.WebEdu.DreamFlying.dao.ResourceDao;
import com.WebEdu.DreamFlying.model.Course;
import com.WebEdu.DreamFlying.model.Resources;
import com.WebEdu.DreamFlying.service.dao.ResourceServiceDao;

public class ResourceServiceDaoImpl extends BaseServiceDaoImpl<Resources> implements ResourceServiceDao {
	private ResourceDao resourceDao;

	public ResourceDao getResourceDao() {
		return resourceDao;
	}

	public void setResourceDao(ResourceDao resourceDao) {
		this.resourceDao = resourceDao;
	}

	
	public List<Resources> findResourcesByType(int id,String type){
		return resourceDao.findResourcesByType(id, type);
	}
	
	public void update(Resources resources){
		resourceDao.update(resources);
	}
}
