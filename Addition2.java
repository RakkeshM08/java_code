import java.util.*;

public class Addition2
{
    public int a, b, c;
     public void display()
     {
        
        System.out.println("Addtion of a + b :"+c);

     }
	public static void main(String[] args)
	{
	    Addition2 obj=new Addition2();
	    Scanner in = new Scanner(System.in);
        System.out.print("Enter value of a :");
        obj.a=in.nextInt();
        System.out.print("Enter  value of b :");

        obj.b=in.nextInt();
        obj.c=obj.a+obj.b;
	    
	    obj.display();
	}
}