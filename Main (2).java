package sal;
import java.util.*;
class Shape
{
	protected double Area;
	public void Calculate_area()
	{
		System.out.println("Area of shape :");
	}
	
}
class Square extends Shape
{
	private int a;
	public void Calculate_area()
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the value of a :");
		a=in.nextInt();
		Area=a*a;
		System.out.println("Square:"+Area);
	}
}
class Circle extends Shape
{
	private double r;
	public void Calculate_area()
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the value of r :");
		r=in.nextDouble();
		Area=3.14*r*r;
		System.out.println("Square:"+Area);
	}
}


public class Main {

	public static void main(String[] args) {
		Shape s1=new Square();
		s1.Calculate_area();
		Shape s2=new Circle();
		s2.Calculate_area();
	

	}

}
/*

Enter the value of a :4
Square:16.0
Enter the value of r :5
Square:78.5

 */
