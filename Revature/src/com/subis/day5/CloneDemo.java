package com.subis.day5;

public class CloneDemo implements Cloneable {
	int id;
	String name;
	Double salary;
	
	
	

	@Override
	public String toString() {
		return "CloneDemo [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}




	public CloneDemo(int id, String name, Double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
	




	public static void main(String[] args)throws CloneNotSupportedException {
		CloneDemo d =new CloneDemo(1,"subi",1000.00);
		System.out.println("Main ="+ d);
		CloneDemo d2 = (CloneDemo)d.clone();
		System.out.println("Clone = "+ d2);
		
		

	}

}
