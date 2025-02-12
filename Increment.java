class Increment
{
    public static void main (String s[])
    {
    int x=10;
    int v= --x + x++ + ++x + --x + x++;
    
    x=10;
    int z= x++ + ++x + ++x + x++ + ++x;
    
    x=10;
    int a = --x + --x + --x + --x;
    System.out.println("Increment of x in v :"+v);
    System.out.println("Increment of x in z :"+z);
    System.out.println("Increment of x in a :"+a);

    }
    
}

/*
Increment of x in v :49
Increment of x in z :63
Increment of x in a :30
*/
