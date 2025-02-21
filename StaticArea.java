class Calculator
{
    static class Area{
        static void area(int a)
        {
            System.out.println("Area of the square: "+(a*a));
        }
        static void area(double a)
        {
            System.out.println("Area of the Circle :"+(3.14*a));
        }
        static void area(int a,int b)
        {
            System.out.println("Area of the Rectangle :"+(a*b));
        }
        
    }
}
public class StaticArea
{
	public static void main(String[] args) {
	    Calculator.Area obj=new Calculator.Area();
	    obj.area(4);
		obj.area(9.08);
		obj.area(5,6);
	}
}
/*
Area of the square: 16
Area of the Circle :28.511200000000002
Area of the Rectangle :30

*/