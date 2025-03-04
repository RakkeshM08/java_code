import java.util.Scanner;
public class Palindrome_Check {
    public static void CheckPalidromeUsingStringBuffer(String str)
    {
        StringBuffer sb=new StringBuffer(str);
        if(sb.toString().equals(sb.reverse().toString()))
        {
            System.out.println(str+" is a Palindrome  (StringBuffer)");
        }
        else
        {
            System.out.println(str+" is not a Palidrome  (StringBuffer)");
        }
    }
    
    public static void CheckPalidromeUsingStringBuider(String str)
    {
        StringBuilder sb=new StringBuilder(str);
        if(sb.toString().equals(sb.reverse().toString()))
        {
            System.out.println(str+" is a Palindrome  (StringBuilder)");
        }
        else
        {
            System.out.println(str+" is not a Palidrome  (StringBuilder)");
        }
}

public static void CheckPalidromeUsingString(String str)
{
        String revstr = "";
        int len = str.length();

        
        for (int i = len - 1; i >= 0; i--) {
            revstr += str.charAt(i);
        }

        
        boolean isPalindrome = true;
        for (int i = 0; i < len; i++) {
            if (str.charAt(i) != revstr.charAt(i)) {
                isPalindrome = false;
                break;
            }
        }

        
        if (isPalindrome) {
            System.out.println(str + " is a Palindrome  (String)");
        } else 
        {
            System.out.println(str + " is not a Palindrome  (String)");
        }
    
}
    public static void CheckPalidromeWithoutUsingString(String str)
    {
        
        String revstr = "";
        int len = str.length();

        
        for (int i = len - 1; i >= 0; i--) {
            revstr += str.charAt(i);
        }

        
        boolean isPalindrome = true;
        for (int i = 0; i < len; i++) {
            if (str.charAt(i) != revstr.charAt(i)) {
                isPalindrome = false;
                break;
            }
        }

        
        if (isPalindrome) {
            System.out.println(str + " is a Palindrome (WIthout String Methods)");
        } else 
        {
            System.out.println(str + " is not a Palindrome (WIthout String Methods)");
        }
}

    

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = in.nextLine();
        in.close();
        CheckPalidromeUsingStringBuffer(str);
        CheckPalidromeUsingStringBuider(str);
        CheckPalidromeUsingString(str);
        CheckPalidromeWithoutUsingString(str);
    }
}
/*
Enter a string: 7887
7887 is a Palindrome  (StringBuffer)
7887 is a Palindrome  (StringBuilder)
7887 is a Palindrome  (String)
7887 is a Palindrome (WIthout String Methods)
*/
