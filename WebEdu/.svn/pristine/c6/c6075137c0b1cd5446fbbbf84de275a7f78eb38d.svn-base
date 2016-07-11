package com.WebEdu.DreamFlying.dao;

import java.util.List;
import java.io.Serializable;

/**   
 *    
 * 项目名称：WebEdu   
 * 类名称：BaseDao   
 * 类描述：   
 * 创建人：古宏 
 * 创建时间：2016年5月28日 下午8:29:10   
 * 修改人：acer-   
 * 修改时间：2016年5月28日 下午8:29:10   
 * 修改备注：   
 * @version 1.0.0   
 *    
 */
public interface BaseDao<T> {
	/**
	 * 添加
	 * @author GuHong
	 * @param t
	 * @throws Exception
	 */
	public void add(T t) throws Exception;
	/**
	 * 修改
	 * @author GuHong
	 * @param t
	 * @throws Exception
	 */
	public void update(T t) throws Exception;
	/**
	 * 按照对象删除
	 * @author GuHong
	 * @param t
	 * @throws Exception
	 */
	public void delete(T t) throws Exception;
	/**
	 * 按照id删除
	 * @author GuHong
	 * @param id
	 * @throws Exception
	 */
	public void deleteById(Class<T> entityClass,int id) throws Exception;
	/**
	 * 查询所有
	 * @author GuHong
	 * @throws Exception
	 */
	public List<T> findAll(Class<T> entityClass) throws Exception;

	/**
	 * 按照id查询
	 * @author GuHong
	 * @param id
	 * @throws Exception
	 */
	public T findById(Class<T> entityClass,int id) throws Exception;
	/**
	 * 以对象作为查询条件进行查询
	 * @author GuHong
	 * @param entity 作为条件的对象
	 * @return
	 */
	public T findForObject(final T entity);	
	
}
