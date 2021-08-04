package com.subis.day4;

class T1 extends Thread{
	synchronized public void run(){
		try{
			
			for(int i=1;i<=5;i++){
				System.out.println("Start is call the "+Thread.currentThread().getName());;
				Thread.sleep(1000);
			}
			
		}
		
		
		catch(InterruptedException e){
			e.printStackTrace();
		}
	}
	
}

public class Threadclass
{

	public static void main(String[] args) throws InterruptedException
	{
		try{
			for(int i=0;i<=5;i++)
			{
			System.out.println("Main method  "+Thread.currentThread().hashCode());
			}
		}
		finally{
			
		}
		
		// TODO Auto-generated method stub
		T1 t = new T1();
		t.setName("child");
		t.start();
		//t.join();
		System.out.println(t.isAlive());
		//System.out.println(t1.isInterrupted());
		System.out.println(t.isInterrupted());
		
		//t.yield();
		
		//t.join();
		
		T1 t1= new T1();
		t1.setName("Subi");
		t1.start();
		//t1.yield();
		//t1.setDemon(true);
		//t1.isDemon();
		System.out.println(t1.isInterrupted());
		//System.out.println(t.isInterrupted());
		//t1.suspend();
		//t1.resume();
		//t1.destroy();
		
		System.out.println(t.isAlive());
		
		//activecount
		System.out.println(Thread.activeCount());
		//t1.join();
		
		try{
			for(int i=0;i<=5;i++)
			{
				System.out.println("Main method "+i);
				Thread.sleep(1000);
			}
			
	}
		finally{
		}
		//join
		t.join();
		t1.join();
		//isAlive
		System.out.println(t.isAlive());
		System.out.println(t1.isAlive());
		
		System.out.println(Thread.activeCount());
		
		
		
		
	}

}
