import java.util.*;
public class BubbleSort
{
	public static void main(String[] args) {
	    Scanner sc =new Scanner(System.in);
	    System.out.print("Enter the number of the element : ");
	    int n=sc.nextInt();
	    int arr[]=new int[n];
	    System.out.println("Enter the element :");
	    for(int i=0;i<n;i++)
	    {
	        arr[i]=sc.nextInt();
	    }
	    System.out.println("Given element stored in array :");
	    for(int j=0;j<n;j++)
	    {
	    System.out.print(arr[j]+" ");
	    }
	    
	    //Selection Sort
	   // for(int i=0;i<n;i++)
	   // {
	   //     for(int j=i+1;j<n;j++)
	   //     {
	   //         if(arr[i]>arr[j])
	   //        {
	   //             int temp=arr[i];
	   //             arr[i]=arr[j];
	   //             arr[j]=temp;
	   //        }
	   //     }
	   // }
	   
	   //Bubble sort
	   for(int i=0;i<n-1;i++)
	   {
	       for(int j=0;j<n-i-1;j++)
	       {
	           int temp=0;
	           if(arr[j]>arr[j+1])
	           {
	               
	               temp=arr[j+1];
	               arr[j+1]=arr[j];
	               arr[j]=temp;
	           }
	       }
	   }
	   
	   
	  //  Arrays.sort(arr);
	    System.out.println();
	    System.out.print("Final Array using Bubble sort :");
	    System.out.println();
	    for(int j=0;j<n;j++)
	    {
	    System.out.print(arr[j]+" ");
	    }
	    
	    
	    
	    
	}
}

/*
Enter the number of the element : 4
Enter the element :
2
5
10
4
Given element stored in array :
2 5 10 4 
Final Array using Bubble sort :
2 4 5 10 
*/