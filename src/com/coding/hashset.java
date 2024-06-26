package com.coding;

import java.util.Collections;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;

class employee{
	 private int id;
	 private String name;
	 private String salary;
	 private String cname;
	public employee(int id, String name, String salary, String cname) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.cname = cname;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	
 }

public class hashset {
	public static void main(String[] args) {
		HashSet<employee> al =new HashSet<>();
employee emp1 =new employee(51,"vikas saini","20000","Google");
employee emp2 =new employee(52,"Akash Saini","50000","Nagroo");
employee emp3 =new employee(53,"Deepak saini","23000","HCL");
employee emp4 =new employee(54,"Pardeep saini","45000","Wipro");
  al.add(emp1);
  al.add(emp2);
  al.add(emp3);
  al.add(emp4);
  Iterator<employee> it =al.iterator();
    Enumeration<employee> en =Collections.enumeration(al);
    System.out.println("Using Iterator:---\n");
    while(it.hasNext()) {
    	employee emp =it.next();
    	System.out.println("Employee Id.= "+emp.getId());
    	System.out.println("Employee Name.= "+emp.getName());
    	System.out.println("Employee Salary.= "+emp.getSalary());
    	System.out.println("Employee Company.= "+emp.getCname()+"\n");
    	System.out.println("+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");

    }
    System.out.println("Using Enumeration :- ✅✅  \n");
    while(en.hasMoreElements()) {
    	employee emp = en.nextElement();
    	System.out.println("Employee Id.= "+emp.getId());
    	System.out.println("Employee Name.= "+emp.getName());
    	System.out.println("Employee Salary.= "+emp.getSalary());
    	System.out.println("Employee Company.= "+emp.getCname()+"\n");
    	System.out.println("➖➖➖➖➖➖➖➖➖➖➖➖➖\n");

	}

}}
