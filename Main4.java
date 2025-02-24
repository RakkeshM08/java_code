package sal;


class Father
{
	private int age=67;
	
	public void Display()
	{
		System.out.println("Father Age :"+age);
	}
}
class Son extends Father
{
	protected int age=56;
	protected void Display2()
	{
		System.out.println("Son Age :"+age);		
	}
}
public class Main4 extends Son {

	public static void main(String[] args) {
		int age=25;
//		Father fobj=new Father();
//		fobj.Display();
		
//		Son sobj=new Son();
//		sobj.Display2();
//		sobj.Display();
		
		Main4 Mobj=new Main4();
		Mobj.Display();
		Mobj.Display2();
		
		System.out.print("Daughter Age:"+age);
	}

}
/*
Father Age :67
Son Age :56
Daughter Age:25
*/
