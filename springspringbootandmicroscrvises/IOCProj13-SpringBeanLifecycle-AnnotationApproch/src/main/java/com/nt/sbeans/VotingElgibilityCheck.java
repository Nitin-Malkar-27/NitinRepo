package com.nt.sbeans;

import java.util.Date;

public class VotingElgibilityCheck {
	//spring beans properties
	private String name;
	private int age;
	private Date verifiedOn;
	
	public VotingElgibilityCheck() {
		System.out.println("VotingElgibilityCheck :: 0-param constractor");
	}
    public void setName(String name) {
		System.out.println("VotingElgilibityCheck.setName()");
		this.name = name;
	}

	public void setAge(int age) {
		System.out.println("VotingElgilibityCheck.setAge()");
		this.age = age;
	}
	
	public void setVerifiedOn(Date verifiedOn) {
		System.out.println("VotingElgibilityCheck.setVerifiedOn()");
		this.verifiedOn=verifiedOn;
	}
	
	public String checkVotingElgibility() {
		System.out.println("VotingElgibilityCheck.checkVotingElgibility()(Business Method)");
		if(age<18)
			return  "Mr/Mrs?Miss. "+name+" u r elgible not for voting on date "+verifiedOn;
		else
		    return  "Mr/Mrs?Miss. "+name+" u r elgible for voting on date "+verifiedOn;
	}
	
	public void myInit() {
		System.out.println("VotingElgibilityCheck.myInit()");
		//initialize the left over properties
		verifiedOn=new Date();
		//check whether important properties are afg with current values or not
		if(name==null || name.trim().length()==0 || age<=0) 
			throw new IllegalArgumentException("invalid values are injected for spring bean peroperties(name,age)");
	}
		
	public void myDestroy() {
		System.out.println("VotingElgibilityCheck.myDestroy()");
		//nullify the spring bean properties
	    name=null;
	    age=0;
	}
		
}
