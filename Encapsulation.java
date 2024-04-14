
//   Now we only 3 variable in this program 

class Demo{
	
		int id;
	   String name;
	   int salary;
	   static String cname ="TCS";
	   void store(int id,String name,int salary){
		   this.id =id;
		  this.name =name;
		   this.salary=salary;
	   }
	   void Display(){
		  System.out.println("ID :"+id);
		  System.out.println("NAME :"+name);
		  System.out.println("SALARY :"+salary);
		  System.out.println("CNAME :"+cname);
	   }
	   public static void main(String args[]){
		   Demo emp1 =new Demo();
		   emp1.store(201,"akash kumar",12600);
		   emp1.Display();
		    Demo emp2 =new Demo();
		   emp2.store(202,"manish",15600);
		   emp2.Display();
		    Demo emp3 =new Demo();
		   emp3.store(203,"sohit",18600);
		   emp3.Display();
}}