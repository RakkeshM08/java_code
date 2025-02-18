/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Countthesamedigit
{
	public static void main(String[] args) {
	    int A[]={1,1,1,0,1,0,0,1,1};
	    int B[]={1,1,1,0,0,1,0,1,1,1};
	    findSameDigit(A,B);
	}  
	public static void findSameDigit(int[] A,int[] B)
	{
	    if(B.length<A.length)
	    {
	    int n=B.length;
	    int count=0;
	    for(int i=0;i<n;i++)
	    {
	        if(A[i]==B[i])
	            count++;
         if(count==n)
          System.out.println("YES");
    
	    }
	    System.out.println(count);
	    }
	    
	    
	    else if(A.length<B.length)
	    {
	    int n=A.length;
	    int count=0;
	    for(int i=0;i<n;i++)
	    {
	        if(A[i]==B[i])
	            count++;
         if(count==n)
          System.out.println("YES");
    
	    }
	    System.out.println(count);
	    }
	    
	}
}
// 7