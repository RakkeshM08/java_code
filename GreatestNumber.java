/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class GreatestNumber
{
	public static void main(String[] args) {
	int arr[]={1,2,3,4,5};
	int max=arr[0];
	int max2=arr[0];
	int max3=arr[0];

	for(int i=1;i<arr.length;i++)
	{
	    if(arr[i]>max)
            max=arr[i];
	}
	
	System.out.println(max);
	for(int i=1;i<arr.length;i++)
	{
	    if(arr[i]>max2 & arr[i]!=max)
	    {
	        max2=arr[i];
	    }
	}
	System.out.println(max2);
	for(int i = 1; i<arr.length;i++)
	{
	     if(arr[i]>max3 & arr[i]!=max & arr[i]!=max2)
	     {
	         max3=arr[i];
	     }
	}
	System.out.println(max3);
	
	
	}
}
/*
5
4
3
*/