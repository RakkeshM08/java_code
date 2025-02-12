
class Bitwise_operator
{
    public static void main (String s[])
    {
        int a = 492;//111101100
        int b = 333;//101001101
        int c=a&b;
        int d= a|b;
        int e=a^b;
        System.out.println("And operator :"+c+" Binary number :"+Integer.toBinaryString(c));
        System.out.println("OR operator :"+d+" Binary number :"+Integer.toBinaryString(d));
        System.out.println("Ex-OR operator :"+e+" Binary number :"+Integer.toBinaryString(e));
        
    }
}
/*
And operator :332 Binary number :101001100
OR operator :493 Binary number :111101101
Ex-OR operator :161 Binary number :10100001
*/