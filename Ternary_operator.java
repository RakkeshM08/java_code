class Ternary_operator
{
    public static void main(String s[])
    {
        int a=10,b=23,c=38;
        int max;
        max=(a>b)?a:b;
        System.out.println("Max using Ternary operator :"+max);
        max=(a>b && a>c)?(a+b):(a+c);
        System.out.println("Max using Ternary operator :"+max);

    }
}
/*
Max using Ternary operator :23
Max using Ternary operator :48

*/