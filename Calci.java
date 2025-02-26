import java.util.*;
public class Calci
{
    
    static void Calculate(int x)
    {
        int total=1;
        for(int i=1;i<=x;i++)
        {
            total*=i;
        }
        System.out.println("Factorial of "+x+" is :"+total);
    }
    static void Calculate1(int n)
    {
        int prev=0;
        int cur=1;
        int sum=0;
        System.out.print(prev);
        System.out.print(cur);
        
        
        for(int i=0;i<n-2;i++)
        {

            sum=prev+cur;
            System.out.print(sum);
            prev=cur;
            cur=sum;
        }
    }
    
    public void Calculate(int x,int y)
    {
        
        for(int i=x;i<=y;i++)
        {
            if(checkPrime(i))
            {
                System.out.print(i+" ");
            }
            else
                continue;
        }
    }
    
    
    boolean checkPrime(int e)
    {
        int count=0;
        for(int i=1;i<=e;i++)
        {
        if(e%i==0)
        {
              count++;
        }
        else
            continue;
        
        }
        if(count==2||count==1)
        {
            return true;
        }
        else
            return false;
        
    
    }
	public static void main(String[] args) {
		Calculate(5);
		Calculate1(5);
		Calci obj=new Calci();
		System.out.println();
		obj.Calculate(1,11);
	}
}