import java.util.*;

public class String_Reverse_whitespace
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the String :");
	    String str=sc.nextLine();
		String revstr="";
		String[] word=str.trim().split("\\s+");
		for(int i=word.length-1;i>=0;i--)
		{
		    revstr+=word[i];
		    revstr+=" ";
		    
		}
		System.out.println(revstr);
	}
}
/*
Enter the String :
I Love Java      Programming
Programming Java Love I 
*/