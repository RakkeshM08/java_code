import java.util.*;

public class StrongNumber
{
	public static void main(String[] args) {
	    Strong obj=new Strong();
	   obj.calculate(145);
	   obj.calculate(127);
	   
	}
}
class Strong
{
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
	    
	    System.out.println(sum);
	    if(sum==x)
	    {
	      System.out.println(x+" is a Strong number");
	    }
	    else
	    {
	      System.out.println(x+" is not a Strong number");
	    }
}
}
/*
145
145 is a Strong number
5043
127 is not a Strong number
*/