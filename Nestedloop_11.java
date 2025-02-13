import java.util.Scanner;
public class Nestedloop_11
{
	public static void main(String[] args) {
	    int i, j, k,l;
	    Scanner scr = new Scanner(System.in);
	    System.out.println("Enter the n value :");
	    Integer n = scr.nextInt();
	    
		for(i=1;i<=n-1;i++)
		{
		    for(j=n-i;j>1;j--)
		    {
		        System.out.print(" ");
		    }
		    for( k=1;k<=i;k++)
		    {
		        System.out.print(k);
		    }
		    for(l=i-1;l>=1;l--)
		    {
		        System.out.print(l);
		    }
		    System.out.println();
		}
		for(i=n-2;i>=1;i--)
		{
		    for(j=1;j<n-i;j++)
		    {
		        System.out.print(" ");
		    }
		    for(k=1;k<=i;k++)
		    {
		        System.out.print(k);
		    }
		    for(l=i-1;l>=1;l--)
		    {
		        System.out.print(l);
		    }
		    System.out.println();
		}
		 
	}
}
/*
   Enter the n value :
6
    1
   121
  12321
 1234321
123454321
 1234321
  12321
   121
    1
*/