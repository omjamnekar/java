import java.util.*;


class eligible  extends Exception{


	public eligible(String s){
	super(s);	
}
}


class practical3bi{

	public static void main(String arg[]){

	int a ;
	Scanner s =new Scanner(System.in);	
	System.out.println("Enter your age:");
	a =s.nextInt();
	
try{


		if(a<18){
			throw new eligible("Age is lower ");
		}else{
			System.out.println("Your age is eligible ");
		}
	}catch(eligible e){
		System.out.println(e);
	}
}
}