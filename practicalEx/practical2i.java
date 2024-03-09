
import java.util.*;
class enter{
double a,b;
	public void input(){
		Scanner s =new Scanner(System.in);
		System.out.println("Enter height:");
		 a = s.nextInt();
		
		System.out.println("Enter weight:"); 
		 b =s.nextInt();
			
	}
}


class cal extends enter{

	public void  cal(){ 
		
		double base =0.5*a*b;
		System.out.println(base);
		
		
	}
	
}


class practical2i{

	public static void main(String args[]){
		
	enter  e =new enter();
	e.input();
cal  f= new cal(); 
	
	f.cal();
		
	}
}