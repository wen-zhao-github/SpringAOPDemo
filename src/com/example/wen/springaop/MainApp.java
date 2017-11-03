package com.example.wen.springaop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.wen.springaop.dao.AccountDAO;

public class MainApp {

	public static void main(String[] args) {
		//read spring config class
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);
		//get the bean from spring container
		AccountDAO accountDao = context.getBean(AccountDAO.class);
		//call the business method
		accountDao.addAccount();
		
		//close the context
		context.close();

	}

}
