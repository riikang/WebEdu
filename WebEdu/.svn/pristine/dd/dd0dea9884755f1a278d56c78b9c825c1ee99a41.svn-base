package com.WebEdu.DreamFlying.dao.impl;

import java.util.List;
import com.WebEdu.DreamFlying.dao.ResourceDao;
import com.WebEdu.DreamFlying.model.Resources;

public class ResourceDaoImpl extends BaseDaoImpl<Resources> implements ResourceDao {
	public List<Resources> findResourcesByType(int id,String type){
		return (List<Resources>)getHibernateTemplate().find("from Resources where course ='"+id+"' and resource_type='"+type+"'");
	}

	@Override
	public void update(Resources resources) {
		getHibernateTemplate().update(resources);
		
	}
}
