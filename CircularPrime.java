import java.util.*;
class Main
{
    
    public boolean checkPrime(int x)
    {
        int count=0;
        for(int i=1;i<=x;i++)
        {
            if(x%i==0)
            {
                count++;
            }
        }
        if (count==2)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public void circularprime()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n=in.nextInt();
        System.out.println();
        int n1=n;
        int digit=1;
        int rem=0;
        int q=0;
        int m=1;
        int n2=n;
        int count=0;
        if(n<10)
        {
            digit=1;
        }
        else
        {
            do {
               digit++;
               n1=n1/10;
            } while (n1/10 > 0);
            //System.out.println(digit);
        }
        if(checkPrime(n))
        {
           System.out.println(n+" is a prime number");
           System.out.println();
           for(int i=1;i<digit;i++)
           {
               m=m*10;
              
           }
            //System.out.println(m);
           for(int i=1;i<digit;i++)
           {
               rem=n2%m;
               q=n2/m;
               n2=rem*10+q;
               
               if(checkPrime(n2))
               {
                   System.out.println(n2+" is a prime number");
                   count++;
               }
            }
            System.out.println();
            if(count>=1)
            {
                System.out.println(n+" is a circular prime number");
            }
            else
            {
                System.out.println(n+" is not a circular prime number");
            }
        }
        else{
            System.out.println("the number is not a prime number");
        }
        
    }
    
}
public class CircularPrime
{
	public static void main(String[] args) {
	    Main o= new Main();
	    o.circularprime();
	}
}
/*
Enter the number : 131

131 is a prime number

311 is a prime number
113 is a prime number

131 is a circular prime number
*/