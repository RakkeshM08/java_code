interface Interface1
{
    
    static void display1()
    {
        System.out.println("Static Method Interface1");
    }
    default void display2()
    {
        System.out.println("Default Method Interface1");
    }
    void display3();
}


interface Interface2 extends Interface1
{
    static void display1()
    {
        System.out.println("Static Method Interface2");
    }
    default void display4()
    {
        System.out.println("Default Method Interface2");
    
}    void display3();


}

class Interface implements Interface2
{
    public void display3()
    {
        System.out.println("Abstract Method");
    }
    public static void main (String Args[])
    {
    Interface obj = new Interface();
    
    Interface1.display1();
    Interface2.display1();
    
    obj.display2();
    obj.display4();
    
    obj.display3();
    }
}
/*
Static Method Interface1
Static Method Interface2
Default Method Interface1
Default Method Interface2
Abstract Method

*/