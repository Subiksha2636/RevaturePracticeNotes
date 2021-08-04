package com.subis.revature;
//3.	Create a class for a Product with productno (int), productname (String), price (float) 
//and quantity (int) as attributes. Create a method to initialize variables (attributes)
//and another method to invoke values of attributes. Finally print the output in console in 
//following format.
public class OopsQues3 {
	public int Pno= 1;
	String PName = "Choclate";
	double price = 20.00;
	static int Quty =1;
	double Total;
	void Dis(){
	System.out.println("Productno   ProductName   price    Quantity    TotalAmount  ");
	}
	public void TotalAmount(){
		  Total = Quty * price;
	}
	 void Product(int Pno,String PName,double price)
	 {
		 Total = Quty*price;
		 this.Pno=Pno;
		 this.PName=PName;
		 this.price=price;
		 this.Total=Total;
		 //System.out.println("Productno "+ Pno + " ProductName "+ PName +" Price "+ price + " Quty " + Quty+ "  TotalAmount  "+ Total);
		 System.out.println( Pno  +"\t"+  PName+ "\t" + price+ "\t" + Quty +"\t" + Total);
	}
	void Display(){
		//System.out.println("Productno   ProductName   price    Quantity    TotalAmount  ");
		System.out.println( Pno  +"\t"+  PName+ "\t" + price+ "\t" + Quty +"\t" + Total);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OopsQues3 n = new OopsQues3();
		n.Pno=2;
		n.PName="Cake";
		n.price=50.00;
		n.Dis();
		n.TotalAmount();
		n.Display();
		n.Product(3,"ice",80.00);
		n.Product(4,"icecake", 100.00);
		n.Product(5,"lilpop",200.00);
		n.Product(6, "chips", 300.00);
		//n.Display();
		
		
		

	}

}
