package com.WebEdu.DreamFlying.dao.impl;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Example;
import org.hibernate.criterion.Projections;
import org.hibernate.metadata.ClassMetadata;
import org.hibernate.type.Type;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateCallback;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import com.WebEdu.DreamFlying.dao.BaseDao;
import com.WebEdu.DreamFlying.service.dao.BaseServiceDao;
import com.WebEdu.DreamFlying.service.dao.StudentServiceDao;
import com.WebEdu.DreamFlying.service.dao.impl.BaseServiceDaoImpl;


/**
 * @author GuHong
 * 2016年5月29日 上午11:49:03
 */
public class BaseDaoImpl<T> extends HibernateDaoSupport implements BaseDao<T> {
	
	@Override
	public void add(T t) throws Exception {
		this.getHibernateTemplate().persist(t);
	}

	@Override
	public void update(T t) throws Exception {
		this.getHibernateTemplate().saveOrUpdate(t);
	}

	@Override
	public void delete(T t) throws Exception {
		this.getHibernateTemplate().delete(t);
	}

	@Override
	public void deleteById(Class<T> entityClass,int id) throws Exception {
		// 获取实体类型名
		String  entityName = this.getHibernateTemplate().getSessionFactory().getClassMetadata(entityClass).getEntityName();
		this.getHibernateTemplate().delete(entityName, this.findById(entityClass, id));
	}
	
	@Override
	public List<T> findAll(Class<T> entityClass) throws Exception {
		// 获取实体类型名
		String  entityName = this.getHibernateTemplate().getSessionFactory().getClassMetadata(entityClass).getEntityName();
		return (List<T>) this.getHibernateTemplate().find(
				"from" + " " + entityName);
		
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public T findById(Class<T> entityClass,int id) throws Exception {
		return (T)this.getHibernateTemplate().get(entityClass, id);
	}

	@Override
	public T findForObject(T entity) {
		return null;
	}
}
