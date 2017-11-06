package com.example.wen.springaop.dao;

import org.springframework.stereotype.Component;

@Component
public class MembershipDAO {
	public String addMembership(){
		System.out.println("MembershipDAO >>> " + getClass() + " >>> db operation......");
		return "added";
	}

}
