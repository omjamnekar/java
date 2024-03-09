import java.util.*;
class add{

	public  add(int a,int b){
	
	int sum ;
	sum =a+b;

	System.out.println(sum);
	}

	
}

class practical1i{
	public static void main(String args[]){
	
	Scanner s =new Scanner(System.in); 
	System.out.println("Enter two number:");
	int a,b;
	a =s.nextInt();
	b =s.nextInt();

	 new  add(a,b);
	
	
	}
}