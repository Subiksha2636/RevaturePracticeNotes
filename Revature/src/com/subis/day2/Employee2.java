package com.subis.day2;

public class Employee2 {
	double  Bouns(Employee e){
		return 10*e.getSalary();
	}
	int Apprisal(Employee e){
		if(e.getSalary()>5000)
			return 3000;
		else
			return 5000;
	}
}
