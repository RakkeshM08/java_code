package sal;

class Animal1
{
	private void eat1()
	{
		System.out.println("Animal is Eating");
	}
	public void sleep()
	{
		System.out.println("Animal is Sleeping");
	}
	protected void bark()
	{
		System.out.println("Animal is Barking");
	}
	static void move()
	{
		System.out.println("Animal is Moving");
	}
	 void drink()
	{
		System.out.println("Animal is Drinking");
	}
}




public class Dog2 extends Animal1 {
	private void eat1()
	{
		System.out.println("Dog is Eating");
	}
	protected void bark()
	{
		System.out.println("Dog is Barking");
	}
//	public void bark()
//	{
//		System.out.println("Dog is Barking");
//	}
	
//	protected void drink()
//	{
//		System.out.println("dog is Drinking");
//	}
//	void drink()
//	{
//		System.out.println("Dog is Drinking");
//	}
	public void sleep()
	{
		System.out.println("Dog is Sleeping");
	}
	public void drink()
	{
		System.out.println("Dog is Drinking");
	}
	

	public static void main(String[] args) {
		Animal1 d2=new Dog2();
		d2.bark();
		d2.drink();
		d2.sleep();

		
		Dog2 d3=new Dog2();
		d3.eat1();
		
		

	}

}
/*
Dog is Barking
Dog is Drinking
Dog is Sleeping
Dog is Eating

 */

