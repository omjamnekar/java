// create triangle , circle , rectangle area with actract class
import java.util.*;
abstract class Shape{

	public abstract void area(double a,double b);

}



class triangle extends Shape{

	double ans;	
	public void area(double a,double b){
		ans =0.5*a*b;
		System.out.println("Area of triangle is"+ans);
		
	}


}

class rectangle extends Shape{

	double ans;	
	public void area(double a,double b){
		ans =a*b;
		System.out.println("Area of ractangle is"+ans);
		
	}


}

class circle extends Shape{

	double ans;	
	public void area(double a,double b){
		ans =3.14*b*b;
		System.out.println("Area of circle is"+ans);
		
	}

}


class practical2bi{
	public static void main(String args[]){

		double a,b;

		Scanner s =new Scanner(System.in);
		rectangle r =new rectangle();
		circle c =new circle();
		triangle t =new triangle();	
		
		System.out.println("Enter a length and breagth for rectangle:");
		a =s.nextDouble();
		b =s.nextDouble();
		r.area(a,b);

		System.out.println("Enter height and breagth for triangle:");
		a =s.nextDouble();
		b =s.nextDouble();
		t.area(a,b);
		
		System.out.println("Enter a radius for circle:");
		b =s.nextDouble();
		t.area(a,b);
		
	}
}

	