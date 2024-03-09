class thread1 extends Thread{

	public void run(){
		
		for(int i =0 ;i<10; i++){
			System.out.println(i+"thread1");
		}
	}

	
}


class thread2 extends Thread{

	public void run(){
		
		for(int i =0 ;i<10; i++){
			System.out.println(i+"thread2");
		}
	}

	
}

class practical4ai{

	public static void main(String args[]){
		
		thread1 t1 =new thread1();
		thread2 t2 =new thread2();
		
		t1.start();
		t2.start();		
	}

	
}