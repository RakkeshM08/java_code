public class Counter{
    public static int count=0;
    Counter()
    {
        count=count+1;
        System.out.println("Objected Created! Current count = "+count);
    }
    public static void main(String A[])
    {
        Counter a=new Counter();
        Counter b=new Counter();
        Counter c=new Counter();

        
    }
}

/*
Objected Created! Current count = 1
Objected Created! Current count = 2
Objected Created! Current count = 3
*/