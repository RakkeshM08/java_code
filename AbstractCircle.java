import java.util.*;
abstract class AbstractCircle
{
    static double area,circum,r;
    static Scanner in= new Scanner(System.in);
    static void Cal_area()
    {
       
        System.out.print("Enter the radius:");
        r=in.nextDouble();
        area=3.14*r*r;
        System.out.println("Area of the Circle:"+area);
    }
    static void Cal_Circumference()
    {
        System.out.print("Enter the radius:");
        r=in.nextDouble();
        circum=2*3.14*r;
        System.out.println("Area of the Circle:"+circum);
    }
	public static void main(String[] args) {
	    Cal_area();
	    Cal_Circumference();
	    
	}
}
/*
Enter the radius:5
Area of the Circle:78.5
Enter the radius:5
Area of the Circle:31.400000000000002
*/