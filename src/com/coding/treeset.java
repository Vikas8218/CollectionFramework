package com.coding;

import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.TreeSet;

class employe implements Comparable<employe>{
	 private int id;
	 private String name;
	 private String salary;
	 private String cname;
	public employe(int id, String name, String salary, String cname) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.cname = cname;
	}
	public int compareTo(employe em) {
		if(id>em.getId())
			return 1;
		else
			if(id<em.getId())
				return -1;
			else
				return 0;
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

public class treeset {
	public static void main(String[] args) {
		TreeSet<employe> al =new TreeSet<>();
employe emp1 =new employe(51,"vikas saini","20000","Google");
employe emp2 =new employe(52,"Akash Saini","50000","Nagroo");
employe emp3 =new employe(53,"Deepak saini","23000","HCL");
employe emp4 =new employe(54,"Pardeep saini","45000","Wipro");
  al.add(emp1);
  al.add(emp2);
  al.add(emp3);
  al.add(emp4);
  Iterator<employe> it =al.iterator();
    Enumeration<employe> en =Collections.enumeration(al);
    System.out.println("Using Iterator:---\n");
    while(it.hasNext()) {
    	employe emp =it.next();
    	System.out.println("Employee Id.= "+emp.getId());
    	System.out.println("Employee Name.= "+emp.getName());
    	System.out.println("Employee Salary.= "+emp.getSalary());
    	System.out.println("Employee Company.= "+emp.getCname()+"\n");
    	System.out.println("+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");

    }
    System.out.println("Using Enumeration :- ✅✅  \n");
    while(en.hasMoreElements()) {
    	employe emp = en.nextElement();
    	System.out.println("Employee Id.= "+emp.getId());
    	System.out.println("Employee Name.= "+emp.getName());
    	System.out.println("Employee Salary.= "+emp.getSalary());
    	System.out.println("Employee Company.= "+emp.getCname()+"\n");
    	System.out.println("➖➖➖➖➖➖➖➖➖➖➖➖➖\n");

	}

}}
