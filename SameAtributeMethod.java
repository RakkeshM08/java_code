public class SameAtributeMethod
{
    String a;
    String b;
    double c;
    SameAtributeMethod(String a,String b,double c)
    {
        this.a=a;//this instance store to same value to same variable
        this.b=b;// this is used to store value from main to variable b
        this.c=c;
    }
    void display()
    {
        System.out.println("Title :"+a);//it will regnoize a as local variable
        System.out.println("Author :"+b);
        System.out.println("Price :"+c);
    }
    public static void main(String args[])
    {
        String a="Java Programming";
        String b="xyz";
        double c=100.0;
        SameAtributeMethod obj=new SameAtributeMethod(a,b,c);
        obj.display();
    }
        
}

/*
 Title :Java Programming
Author :xyz
Price :100.0
*/