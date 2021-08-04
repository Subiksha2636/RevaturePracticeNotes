package com.subis.day4;
class x{
	
}

public class RunDemo extends x implements Runnable {
	synchronized public void run(){
		try{
		for(int i=1;i<6;i++){
			System.out.println("Runnable Mathod "+Thread.currentThread().getName());
			Thread.sleep(1000);
		}
		}
		catch(InterruptedException e){
			e.printStackTrace();
		}
	}

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		RunDemo r = new RunDemo();
		//r.start(); //not working
		Thread t = new Thread(r);
		t.start();
		
		
		Thread t1 = new Thread(r);
		t1.setName("Child");
		t1.start();
		System.out.println(t1.getId()+   "   "+t.getId());
		System.out.println(t1.isAlive());
		System.out.println(t1.activeCount());
		System.out.println(t1.getPriority()+"   "   + t.getPriority());
		System.out.println(t1.hashCode()+  "   "+ t.hashCode());
		System.out.println(t1.getId()+   "   "+t.getId());
		
	

	}

}
