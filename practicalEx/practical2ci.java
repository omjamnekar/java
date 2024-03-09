import java.util.*;
interface area{

	void area_comp(double a,double b);
}

class triangle implements area{
	
	public void area_comp(double a, double b){
		
		 double res = 0.5*a*b;
		System.out.println(res);
	}
}


class rectanlge implements area{
	
	public void area_comp(double a, double b){
		
		 double res = a*b;
		System.out.println(res);
	}
}

class circle implements area{
	
	public void area_comp(double a, double b){
		
		 double res = 3.14*b*b;
		System.out.println(res);
	}
}



class practical2ci{

	public static void main(String args[]){
		circle c =new circle();
		triangle t =new triangle();
		rectanlge r =new rectanlge();
		
		c.area_comp(3,4);
		t.area_comp(3,4); 
		r.area_comp(3,4);
	}
}