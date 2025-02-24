abstract class Car
{
    final static int a=get_a();
    static int get_a()
    {
        return 20;
    }
  
    public static void display()
    {
        
        System.out.println(a);
    }
}
class Final_static{
    

	public static void main(String[] args) {
	   
	    Car.display(); 
	}
}

//20