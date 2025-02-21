import java.util.*;
class Calculator
{
    public int a,b,c;
    Scanner in = new Scanner(System.in);

    public void Add()//no argument and no return type
    {
        System.out.print("Enter the value of a :");
        a=in.nextInt();
        System.out.print("Enter the value of b :");
        b=in.nextInt();
        c=a+b;
        System.out.println("Addition of a and b :"+c);
    }
    public int Diff()//no argumentand return type
    {
        System.out.print("Enter the value of a :");
        a=in.nextInt();
        System.out.print("Enter the value of b :");
        b=in.nextInt();
        c=a-b;
        return c;
    }
    public void product(int a,int b)//argument and no return type
    {
       
        c=a*b;
        System.out.println("Addition of a and b :"+c);
        
    }
    public int Div(int a, int b)//argument and return type
    {
        c=a/b;
        return c;
    }
}
public class Calculator1
{
	public static void main(String[] args) {
	    
	    Calculator obj=new Calculator();
	    obj.Add();
	    
	  
	    System.out.println("Difference :"+obj.Diff());
	    
	    
	    Scanner in=new Scanner(System.in);
	    System.out.print("Enter the value of a :");
	    int a=in.nextInt();
	    System.out.print("Enter the value of b :");
	    int b=in.nextInt();
	    obj.product(a,b);
	    
	    
	    System.out.print("Enter the value of c :");
	    int c=in.nextInt();
	    System.out.print("Enter the value of d :");
	    int d=in.nextInt();
	    System.out.println("Division :"+obj.Div(c,d));
	}
}
/*
Enter the value of a :45
Enter the value of b :45
Addition of a and b :90
Enter the value of a :50
Enter the value of b :45
Difference :5
Enter the value of a :4
Enter the value of b :5
Addition of a and b :20
Enter the value of c :50
Enter the value of d :25
Division :2

*/