

public class Nestedloop_10
{
	public static void main(String[] args) {
	    int n=5, i, j, k,l;
	    
		for(i=1;i<n;i++)
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
		 
	}
}
/*
   1
  121
 12321
1234321
*/