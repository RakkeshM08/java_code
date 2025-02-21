class Outer{
    static class Inner{
        
        static void Display()
        {
           int n=5;
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<=i;j++)
                {
                    if(j%2==0)
                    {
                System.out.print("* ");
                    }
                    else{
                        System.out.print("# ");
                    }
                }
            System.out.println();

            }
        }
    }
    
}


public class HashStar
{
	public static void main(String[] args) {
	    Outer.Inner.Display();
	}
}
/*
* 
* # 
* # * 
* # * # 
* # * # * 
*/