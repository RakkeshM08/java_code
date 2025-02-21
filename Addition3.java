import java.util.*;
class Add
{
    private int a,b,c;
    
    private void get()
    {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the value of a:");
        a=in.nextInt();
        System.out.print("Enter the value of b:");
        b=in.nextInt();
    }
    public void display()
    {
        get();
        c=a+b;
        System.out.println("Sum :"+c);
    }
}
public class Addition3
{
	public static void main(String[] args) {
	    Add obj=new Add();//cannot get()has private access in Add so we call public scope display
	    obj.display();
	}
	
}
/*
Enter the value of a:45
Enter the value of b:45
Sum :90

*/