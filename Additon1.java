import java.util.*;
class Additon1{
    private int a,b,c;
    public void get()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter value of a :");
        a=in.nextInt();
        System.out.print("Enter  value of b :");

        b=in.nextInt();
        c=a+b;
    }
    public void display()
    {
        System.out.println("Addtion of a + b :"+c);
    }
    

	public static void main(String[] args) {
	    Additon1 obj=new Additon1();
	    obj.get();
	    obj.display();
	}
}
/*
Enter value of a :5
Enter  value of b :6
Addtion of a + b :11

*/