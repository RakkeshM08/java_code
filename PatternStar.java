/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class PatternStar
{
	public static void main(String[] args) {
	    int n=5;
	    for(int i=1;i<=n;i++,System.out.println())
	    {
	        for(int j=1;j<=n;j++,System.out.print(" "))
	        {
	            System.out.print("*");
	        }
	    }
	    System.out.println("Increment Triangle");
	    
	    for(int i=1;i<=n;i++,System.out.println())
	    {
	        for(int j=1;j<=i;j++,System.out.print(" "))
	        {
	            System.out.print("*");
	        }
	    }
	    System.out.println("Decrement Triangle");
	    
	    for(int i=1;i<=n;i++,System.out.println())
	    {
	        for(int j=1;j<=(n-i+1);j++,System.out.print(" "))
	        {
	            System.out.print("*");
	        }
	    }
	    System.out.println();
	    for(int i=0;i<=n;i++,System.out.println())
	    {
	        for(int j=2;j<=(n-i+1);j++)
	        {
	            System.out.print("+");
	        }
	        for(int k=0;k<=i;k++)
	        {
	            System.out.print("*");
	        }
	    }
	    System.out.println("trian");
	    
	    System.out.println();
	    
	    
	    
	    for(int i=0;i<n;i++,System.out.println())
	    {
	         for(int j=2;j<=(n-i+1);j++)
	        {
	            System.out.print("_");
	        }
	        for(int k=0;k<=i;k++)
	        {
	            System.out.print("*");
	        }
	        
	        
	        for(int j=i;j>=1;j--)
	        {
	            System.out.print("*");
	        }
	        for(int k=0;k<=i;k++)
	        {
	            System.out.print("_");
	        }
	        
	        
	        
	        
	    }
	    for(int i=1;i<=n;i++,System.out.println())
	    {
	    for(int j=i;j<=n-i;j++)
	    {
	        System.out.print("+");
	    }
	    for(int j=1;j<=(n-i+1);j++)
	    {
	        System.out.print("*");
	    }
	   
	    
	    for(int j=2;j<=(n-i+1);j++)
	        {
	            System.out.print("*");
	        }
	   
	    }
	}
}
/*

* * * * * 
* * * * * 
* * * * * 
* * * * * 
* * * * * 
Increment Triangle
* 
* * 
* * * 
* * * * 
* * * * * 
Decrement Triangle
* * * * * 
* * * * 
* * * 
* * 
* 

+++++*
++++**
+++***
++****
+*****
******
trian

_____*_
____***__
___*****___
__*******____
_*********_____
++++*********
++*******
*****
***
*

*/