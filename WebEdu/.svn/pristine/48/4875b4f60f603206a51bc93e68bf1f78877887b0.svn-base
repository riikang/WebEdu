package com.WebEdu.DreamFlying.service.dao.impl;

import java.io.Serializable;
import java.util.List;

import org.hibernate.metadata.ClassMetadata;

import java.lang.reflect.ParameterizedType;

import org.hibernate.type.Type;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import com.WebEdu.DreamFlying.dao.BaseDao;
import com.WebEdu.DreamFlying.dao.impl.BaseDaoImpl;
import com.WebEdu.DreamFlying.service.dao.BaseServiceDao;
@Transactional(readOnly = false)
public class BaseServiceDaoImpl<T> implements BaseServiceDao<T>{
//	private Class clazz;
//	 
//    public BaseServiceDaoImpl(){
//        //利用泛型的反射在实例化时拿到实体类的字节码
//        Type t =  (Type) this.getClass().getGenericSuperclass();
//        ParameterizedType pt =  (ParameterizedType)t;
//        Type actualType = (Type) pt.getActualTypeArguments()[0];
//        clazz = actualType.getClass();
//        System.out.println(clazz);
//    }

	private BaseDao baseDao;

	public BaseDao getBaseDao() {
		return baseDao;
	}


	public void setBaseDao(BaseDao baseDao) {
		this.baseDao = baseDao;
	}


	@Override
	public void save(T t) throws Exception {
		baseDao.add(t);	
	}

	
	@Override
	public void update(T t) throws Exception {
		baseDao.update(t);
		
	}

	@Override
	public void delete(T t) throws Exception {
		baseDao.delete(t);		
	}

	@Override
	public void deleteById(Class<T> entityClass,int id) throws Exception {
		baseDao.deleteById(entityClass,id);	
	}

	@Override
	public List findAll(Class<T> entityClass) throws Exception {
		return baseDao.findAll(entityClass);
	}

	@Override
	public T findById(Class<T> entityClass,int id) throws Exception {
		return (T) baseDao.findById(entityClass,id);
		
	}

	@Override
	public T findForObject(T entity) {
		return null;
	}
	
}
