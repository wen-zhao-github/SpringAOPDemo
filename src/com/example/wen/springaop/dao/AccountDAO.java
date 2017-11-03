package com.example.wen.springaop.dao;

import org.springframework.stereotype.Component;

@Component
public class AccountDAO {
	
	public void addAccount(){
		System.out.println("AccountDAO >>> " + getClass() + " >>> db operation......");
		
	}

}