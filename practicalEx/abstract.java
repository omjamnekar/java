import java.util.*;
abstract class shape
{
public abstract void area(double a, double b);

}
class triangle extends shape
{
double ans;
public void area(double a, double b)
{
ans=0.5*a*b;
System.out.println("The area of triangle is"+ans);

}

}
class circle extends shape
{
double ans;
public void area(double a,double b)
{
ans=a*b*b;
System.out.println("The area of circle is"+ans);

}
}
class rectangle extends shape
{
double ans;
public void area(double a,double b)
{
ans=a*b;
System.out.println("The area of rectangle is"+ans);
}
}
class abstractManager
{
public static void main(String[] args)
{
double pi=3.14,r,l,b,b1,h;
Scanner s=new Scanner(System.in);
System.out.println("Enter the length and breadth");
b1=s.nextDouble();
h=s.nextDouble();
triangle ti=new triangle();
ti.area(b1,h);
System.out.println("Enter the radius");
r=s.nextDouble();
circle ci=new circle();
ci.area(pi,r);
System.out.println("Enter the length and breadth");
l=s.nextDouble();
b=s.nextDouble();
rectangle re=new rectangle();
re.area(l,b1);

}
}