public class StaticClass
{
    static int a=90;
	public static void main(String[] args) {
		
		System.out.println("Inside Main Block");
		System.out.println(a);
		display();
		Counter obj1=new Counter();
// 		obj1.display();
		Counter obj2=new Counter();
// 		obj2.display();
		Counter obj3=new Counter();
// 		obj3.display();
	}
	static 
{
    System.out.println("Inside static block");
}
    static void display()
    {
        System.out.println("Inside display");
    }
}


class Counter
{
    public static int count=0;
    // static void display()
    // {
    Counter()
    {
        count=count+1;
        System.out.println("Number of Count :"+count);
    }
    // }
}
/*
Inside static block
Inside Main Block
90
Inside display
Number of Count :1
Number of Count :2
Number of Count :3

*/








