
interface Area{

	public void area_compute(float a,float b);

}

class Circle implements Area{
	
	public void area_compute(float a , float b){

	double res = 3.14*b*b;
	System.out.println(res);
	
	}
	
}

class Rect implements Area{
	public void area_compute(float a ,float b){


		double res = a*b;
		System.out.println(res);
	}

}


class interfaceManager {


	public static void main(String args[]){


		Rect r =new Rect();
		Circle c =new Circle();
		r.area_compute(3,4);
		c.area_compute(7,7);
	}
}