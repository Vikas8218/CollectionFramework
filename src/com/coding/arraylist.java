package com.coding;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
public class arraylist {
    public static void main(String[] args) {
        ArrayList<Emp> tr = new ArrayList<>();
        Emp emp1 = new Emp(301, "vikas saini", 20000);
        Emp emp2 = new Emp(302, "Akash kumar", 30000);
        Emp emp3 = new Emp(303, "Manish kedwal", 25000);
        Emp emp4 = new Emp(304, "sohit Engineer", 19000);
          tr.add(emp1);
          tr.add(emp2);
          tr.add(emp3); 
          tr.add(emp4);
      Enumeration employee =Collections.enumeration(tr);
        while (employee.hasMoreElements()) {
            Emp emp = (Emp)employee.nextElement();
                System.out.println("ID :" + emp.getId());
                System.out.println("NAME :" + emp.getName());
                System.out.println("Salary :" + emp.getSalary());
                System.out.println("CNAME :" + Emp.getCname());
                System.out.println("==========================");

        }
    }

}