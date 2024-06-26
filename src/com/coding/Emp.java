package com.coding;
	 public class Emp {
	    private int id;
	    private String name;
	    private int salary;
	    private static String cname = "Nagroo";

	    public Emp(int id, String name, int salary) {
	    	
	        this.id = id;
	        this.name = name;
	        this.salary = salary;
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

	    public int getSalary() {
	        return salary;
	    }

	    public void setSalary(int salary) {
	        this.salary = salary;
	    }

	    public static String getCname() {
	        return cname;
	    }

	    public static void setCname(String cname) {
	        Emp.cname = cname;
	    }
	}
