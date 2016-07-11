package com.test;

import java.util.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.WebEdu.DreamFlying.model.Manager;
import com.WebEdu.DreamFlying.service.dao.BaseServiceDao;
import com.WebEdu.DreamFlying.service.dao.ManagerServiceDao;

public class ManagerDaoImplTest {
	
	private static ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
	private static ManagerServiceDao managerService = (ManagerServiceDao) ctx.getBean("ManagerServiceDao");
	private static BaseServiceDao<Manager> baseService = (BaseServiceDao<Manager>) ctx.getBean("BaseServiceDao");
	public static ManagerServiceDao getManagerService(){
		return managerService;		
	}

	public static void main(String[] args) {
		/*Manager manager=new Manager();
		manager.setUsername("1340112234");
		manager.setPassword("123456");
		manager.setMname("messi");
		manager.setSex("男");
		manager.setBirthday(new Date(1994,07,20));
		manager.setPhoneNum("10086");
		manager.setAddress("广东河源");
		try {
			managerService.save(manager);
		} catch (Exception e) {
			e.printStackTrace();
		}*/
		try {
			Manager manager =baseService.findById(Manager.class,1);
			manager.setMname("Messi");
			baseService.update(manager);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
