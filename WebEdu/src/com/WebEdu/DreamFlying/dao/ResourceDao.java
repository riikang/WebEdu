package com.WebEdu.DreamFlying.dao;

import java.util.List;
import com.WebEdu.DreamFlying.model.Resources;

public interface ResourceDao extends BaseDao<Resources> {
	public List<Resources> findResourcesByType(int id,String type);
	public void update(Resources resources);
}
