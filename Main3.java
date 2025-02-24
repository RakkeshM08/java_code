package sal;


class Super
{
	static void displ()
	{
		System.out.println("In Super Class");
	}
}
class Sub extends Super
{
	static void disp()
	{
		System.out.println("In Sub class");
	}
}
public class Main3 {

	public static void main(String[] args) {
		Sub obj=new Sub();
		obj.disp();
		obj.displ();
	
	}

}


/*
In Sub class
In Super Class
 */
