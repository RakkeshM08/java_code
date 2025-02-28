import java.util.*;

public class StrongNumberRange
{
	public static void main(String[] args) {
	    Strong obj=new Strong();
	   obj.calculate1(1,2000);
	   
	}
}
class Strong
{
    public static void calculate1(int start,int end)
    {
         
        for (int k = start; k <= end; k++) {
            calculate(k);
        }
    
    }
public static void calculate(int x)
{
	    int n=x;
	    int r;
	    int sum=0;

	    while(n>0)
	    {
	    int total =1;
	    r=n%10;
	    for(int i=1;i<=r;i++)
	    {
	        total*=i;

	    }
	    sum=sum+total;
	    n/=10;
	    
	    }
	   // System.out.println(sum);
	    if(sum==x)
	    {
	      System.out.println(x+" is a Strong number");
	    }
	   
}
}
/*
1 is a Strong number
2 is a Strong number
145 is a Strong number

*/