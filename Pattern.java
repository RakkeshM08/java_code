package sal;

public class Pattern {

	public static void main(String[] args) {
//		int n=12;
//		for(int i=1;i<=n;i++)
//		{	
//			if (i == 1) 
//			{
//              System.out.println("      *");
//             }
//			else if (i == 2 || i == 4 || i == 6) 
//			{
//				System.out.println("    * * *");
//	        } 
//			else if (i == 3 || i == 5 || i == 7) 
//			{
//                System.out.println("  * * * * *");
//	        } else if (i == 8)
//	        {
//                System.out.println("* * * * * * *");
//            }
//	        else
//	        {
//                System.out.println("    + + +");			    
//                }
//		}
		int n=4;
		for(int i=1;i<n;i++)
		{
			for(int j=n-i;j>=0;j--)
			{
				System.out.print("+");
			}
			for(int k=1;k<=(2*i-1);k++)
			{
				System.out.print("*");
			}
			System.out.println();
			
		}
		
		
		
		
	}
}



