/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Consecutive
{
	public static void main(String[] args) {
		
		int arr[]={1,1,0,1,1,0,1,1,1,0,0,1};
		int count=0;
		int prev=0;
		int prev1=0;
		int count1=0;
		for(int i =0;i< arr.length;i++)
		{
		    if( arr[i]==1)
		       {
		           count++;
		       }
		    else
		        {
		            if(count>prev)
		            {
		                prev= count;
		                count=0;
		            }
		        }
		 if(count>prev)
		{
		    prev=count;
		    count=0;
		}
		}
	
	System.out.println("Maximum Consecutive number of 1 :"+prev);

		   
	    for(int i=0; i< arr.length;i++)
		{
		        if(arr[i]==0)
		        {
		            count1++;
		        }
		        else{
		            if(count1>prev1)
		                prev1=count1;
		          count1=0;
		        }
		    }
		    
		        System.out.println("Maximum Consecutive number of 0 :"+prev1);
		    
		  
	}
}

/*
Maximum Consecutive number of 1 :3
Maximum Consecutive number of 0 :2
*/