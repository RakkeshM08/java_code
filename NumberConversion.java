import java.util.*;
public class NumberConversion
{
    public static void main(String A[])
    {
        Scanner in =new Scanner(System.in);
        String oct="";
        String hexa="";
        String bin="";
        int rem;
        System.out.println("Enter the decimal Number :");
        int n = in.nextInt();
        while(n>0)
        {
           rem=n%8;
           oct=rem+oct;
        
           n=n/8;
    
        }
        System.out.println("Decimal to Octal :"+oct);
        System.out.println("Enter the decimal Number :");
        n= in.nextInt();
        while(n>0)
        {
           rem=n%2;
           bin=rem+bin;
           n=n/2;
    
        }
        System.out.println("Decimal to Binary :"+bin);
        System.out.println("Enter the decimal Number :");
        n = in.nextInt();
        while(n>0)
        {
            rem=n%16;
            hexa=rem+hexa;
            n=n/16;
        }
        System.out.println("Decimal to HexaDecimal :"+hexa);
        
    }
}

