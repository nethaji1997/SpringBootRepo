package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component()
@Scope(value="singleton")
public class People 
{
	@Autowired
	@Qualifier("lap1")
	private Laptop laptop;

	public Laptop getLaptop() 
	{
		return laptop;
	}

	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}

	private int pid;
	private String pname;
	
	public People() 
	{
		System.out.println("constructor invoked");
	}
	
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}

	public void disp()
	{
		System.out.println("Its displayed");
		laptop.compile();
	}
}
