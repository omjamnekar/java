class thread extends Thread{

public void run(){

		System.out.println("Thread is Running ");
	}
}


class practical4aii{

	
	public static void main(String args[]){
		thread t1 =new thread();
		thread t2 =new thread();	
		
		System.out.println(t1.getState());
		System.out.println(t2.getState()); 

		t1.start();
		
		System.out.println(t1.getState());
		System.out.println(t2.getState()); 
		
		t2.start();
	
		System.out.println(t1.getState());
		System.out.println(t2.getState()); 
		
		t1.interrupt();

		System.out.println(t1.getState());
		System.out.println(t2.getState()); 
		
		t2.interrupt();

		System.out.println(t1.getState());
		System.out.println(t2.getState()); 
		

	}
}