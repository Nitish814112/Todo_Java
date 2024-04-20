package com.todo.entities;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class helper {
	public static SessionFactory factory;
	
	public static SessionFactory getfactory() 
	{
		if(factory==null)
		{
			factory=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		}
		return factory;
	}
	public void closeFactory()
	{
		if(factory.isOpen())
		{
			factory.isClosed();
		}
	}

}
