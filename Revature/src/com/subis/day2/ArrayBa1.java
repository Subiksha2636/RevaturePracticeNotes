package com.subis.day2;
class Course{
	int i;
	String name;
	Course(int i,String name){
		this.i=i;
		this.name=name;
	}
	@Override
	public String toString() {
		return "Course [i=" + i + ", name=" + name + "]";
	}
	
	
	
	
}
public class ArrayBa1 {
	public void print(String[] str){
		
		for(String i:str){
			System.out.println(i);
			
		}
	}
	public void upper(String[] str){
		for(String i:str){
			System.out.println(i.toUpperCase());
		}
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] arr = {3,6,3,6,4,};
		//constract using tostring method
		Course c = new Course(101,"java");
		System.out.println(c);
		
		
		//object is create the funcation
		Course[] c1 = new Course[5];
		c1[0]=new Course(102,"c");
		c1[1]=new Course(103,"python");
		c1[2]=new Course(104,"jsp");
		c1[3]=new Course(105,"javascrpt");
		
		for(Course c2 : c1){
			System.out.println(c2);
		}
		
		//String created array 
		String[] str = new String[5];
		str[0]="Ram";
		str[1]="subi";
		str[2]="pavan";
		str[3]="vigi";
		str[4]="sara";
		ArrayBa1 n = new ArrayBa1();
		n.print(str);
		n.upper(str);
		for(String s :str ){
			System.out.println(s.length());
		}
		
		
		

		

	}

}
