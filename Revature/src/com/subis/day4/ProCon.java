package com.subis.day4;
class Q{
	int n;
	boolean b=false;
	synchronized int get()
	{
		if(!b)
			try{
				wait();
			}
			catch(InterruptedException e){
				System.out.println("e");
			}
			
			
			System.out.println("get "+n);
			b=false;
			
			notify();
			return n;
						
			
		}
	synchronized void put(int n){
		if(b)
			try{
				wait();
			}
			catch(InterruptedException e){
				System.out.println("e");
			}
			this.n=n;
			b=true;
			System.out.println("put "+n);
			notify();
						
			
		
		
	}
	
}
class Proceducer implements Runnable{
	
	Q q;
	
	 Proceducer(Q q)
	{
		this.q=q;
		new Thread(this ,"Proceducer").start();
		
	}
	public void run(){
		int i=1;
		for(int index=1;index<=5;index++){
			q.put(i++);
			
		}
		
		
	}
}
class Consumer implements Runnable{
	
	Q q;
	
	Consumer(Q q)
	{
		this.q=q;
		new Thread(this ,"Consumer").start();
		
	}
	public void   run(){
		
		for(int index=1;index<=5;index++){
			q.get();
			
		}
		
		
	}
}


public class ProCon {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Q q = new Q();
		new Proceducer(q);
		new Consumer(q);
		System.out.println("Stop process");
		
		
	}

}
