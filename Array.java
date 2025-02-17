/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Array
{
	public static void main(String[] args) {
	int arr []={1,2,3,4,5,6,7,8};
	for(int i=0;i<arr.length;i++)
	{
		System.out.println(arr[i]);
	}
	 
	 System.out.println();
	 
	 for(int i=arr.length-1;i>=0;i--)
	 {
	     System.out.println(arr[i]);
	 }
	 
	 System.out.println();
	 
	 for(int i:arr)
	 {
	     i++;
	     System.out.println(i);
	 }
	 
	 System.out.println();
	 for(int i=0;i<arr.length;i++)
	 {
	     System.out.println(i);
	 }
	 System.out.println();
	 for(int i=0;i<arr.length;i++)
	 {
	     arr[i]++;
	     System.out.println(arr[i]);
	 }
	 System.out.println();
	 for(int i=0;i< arr.length;i++)
	 {
	     System.out.println(arr[i]);
	 }
	    
	}
}
/*
1
2
3
4
5
6
7
8

8
7
6
5
4
3
2
1

2
3
4
5
6
7
8
9

0
1
2
3
4
5
6
7

2
3
4
5
6
7
8
9

2
3
4
5
6
7
8
9
*/