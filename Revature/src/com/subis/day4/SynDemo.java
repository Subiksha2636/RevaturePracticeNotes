package com.subis.day4;
class Demo1{
	//JVM wait
	void call(String msg){
		synchronized(this){
			System.out.print("{"+ msg);
			try{
				Thread.sleep(1000);
			}
			catch(InterruptedException e){
				System.out.println(e);
			}
			System.out.println("}");
		}
		System.out.println("Thank you");
		//notify JVM 
		
	}
	
	
}
class SynDemo1 implements Runnable {
	String msg;
	Demo1 d;
	Thread t;
	
	public void get(Demo1 d,String msg){
		this.d=d;
		this.msg= msg;
		t=new Thread(this);
		t.start();
		
	}
	public void run(){
		d.call(msg);
	}
}
	
public class SynDemo
{
	
	public static void main(String[] args)throws InterruptedException {
		// TODO Auto-generated method stub
		Demo1 d = new Demo1();
		SynDemo1 d1 = new SynDemo1();
		d1.get(d,"sub");
		SynDemo1 d2 = new SynDemo1();
		d2.get(d, "Welcome");
		
		
		
		

	}

}
