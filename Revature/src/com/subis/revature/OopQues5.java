package com.subis.revature;
//5.	Create a class Student with the attributes rollNo – int , 
//name - String, mark1-int,mark2-int,mark3-int,total – int and methods
//setStudDetails() which set the values to these attributes except 
//total, findTotal() which is used to find the total marks and 
//dispStudDetails() which displays rollNo, name and total. Create a 
//class Main2 which contains main() method to test the functionality 
//of Student class.
class Student{
	int rollno;
	String name;
	int mark1;
	int mark2;
	int mark3;
	int total;
	public void print(){
		System.out.println("rollno" + "  " +  "name"  + "  "  + "total" );
	}
	public void SetDetails(int rollno,String name,int mark1,int mark2,int mark3){
		this.rollno=rollno;
		this.name=name;
		this.mark1=mark1;
		this.mark2=mark2;
		this.mark3=mark3;
		
	}
	public void findTotal(){
		this.total=mark1+mark2+mark3;
		
		
	}
	public void Display(){
		System.out.println(rollno + "      "+ name+ "      "+total);
	}
	
}

public class OopQues5 {
	
	
	 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student();
		s.print();
		s.SetDetails(1, "subi", 10, 20, 30);
		s.findTotal();
		s.Display();
		
		Student s1 = new Student();
		//s.print();
		s1.SetDetails(2, "vigi", 30, 40, 50);
		s1.findTotal();
		s1.Display();
		

	}

}
