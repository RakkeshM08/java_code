package sal;

class Super1
{
	int x;
	public Super1()
	{
		x=10;
	}
	void display()
	{
		System.out.println(" Inside sub class :"+x);
	}
}
class Sub1 extends Super1
{
	int x;
	public Sub1()
	{
		super();
		x=100;
	}
	void display()
	{
		System.out.println(" Inside sub class :"+x);
		System.out.println(" Inside Super class :"+super.x);
		super.display();
		
	}

}
public class Main5 {

	public static void main(String[] args) {
		Sub1 sobj=new Sub1();
		sobj.display();
		
	}

}
/*
Inside sub class :100
Inside Super class :10
Inside sub class :10
*/
