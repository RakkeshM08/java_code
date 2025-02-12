class Arithmetic_operator
{
	public static void main(String S[]) {
	    byte a,b,c;
	    a = 100;
	    b = 90;
		c = (byte)(a+b);
		System.out.println("Addition :" + c);
		c =(byte)(a-b);
		System.out.println("Subration :" + c);
		c =(byte)(a*b);
		System.out.println("Multiplication :" + c);
		c =(byte)(a/b);
		System.out.println("Quotient :" + c);
		c =(byte)(a%b);
		System.out.println("Remainder :" + c);
	}
}
/*
Addition :-66
Subration :10
Multiplication :40
Quotient :1
Remainder :10
*/
