import java.util.*;
abstract class Circle{
    protected double area;
    abstract void calc_area();
}

class Area extends Circle
{
    private double r;
    public Area()
    {
        Scanner in =new Scanner(System.in);
        System.out.println("Enter the radius:");
        r=in.nextDouble();
    }
    void calc_area()
    {
        area=3.14*r*r;
        System.out.println("Area ="+area);
    }
}

public class Abstraction
{
	public static void main(String[] args) {
	    Area obj=new Area();
	    obj.calc_area();
	}
}


/*
Enter the radius:
5.56
Area =97.068704

*/