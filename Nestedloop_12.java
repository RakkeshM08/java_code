import java.util.Scanner;
public class Nestedloop_12
{
	public static void main(String[] args) {
	    int i, j, k,l;
	    Scanner scr = new Scanner(System.in);
	    System.out.println("Enter the n value :");
	    Integer n = scr.nextInt();
	    for(i=1;i<=n;i++)
	    {
	        for(j=n-i;j>=1;j--)
	        {
	            System.out.print(" ");
	        }
	        for(k=1;k<=i;k++)
	        {
	            System.out.print("* ");
	        }
	        System.out.println();
	    }
	    for(i=n-1;i>=1;i--)
	    {
	        for(j=1;j<=n-i;j++)
	        {
	            System.out.print(" ");
	        }
	        for(k=1;k<=i;k++)
	        {
	            System.out.print("* ");
	        }
	        System.out.println();
	    }
	    
	
	}
}
/*
Enter the n value :
5
    * 
   * * 
  * * * 
 * * * * 
* * * * * 
 * * * * 
  * * * 
   * * 
    * 

*/