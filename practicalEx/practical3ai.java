import java.util.*;


class practical3ai{
	
	public static void main(String args[]){
		try{
			int a,b,c;	
			Scanner s =new Scanner(System.in);
			System.out.println("Enter numbers for division:");
			a =s.nextInt();
			b=s.nextInt();
			c= a/b;
			System.out.println(c);
		
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
	
}