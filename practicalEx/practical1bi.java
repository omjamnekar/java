class idle{

	
	public void  area(double r){
		double a = 3.14*r*r;
		System.out.println("Area of circle:"+a);
	}		

	public void  area(int l,int b ){
		System.out.println(l*b);
	}		
}

class practical1bi{

	public static void main(String args[]){
		
		idle  f= new idle();
		f.area(4);
f.area(3,5); 	
	}
}