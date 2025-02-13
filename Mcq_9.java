/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Mcq_9
{
	public static void main(String[] args) {
	   int n=5;
    for(int i=1;i<n;i++)
    {
        for(int j=n-i;j>1;j--)
        {
            System.out.print(" ");
        }
        for(int k=1;k<i;k++)
        {
            System.out.print("1");
        }
        for(int j=1;j<=i;j++)
        {
            System.out.print("1");
        }
        System.out.println();
    }
    
	}
}
/*
   1
  111
 11111
1111111
*/