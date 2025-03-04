import java.util.*;

class String_No_digit {
    public static void main(String args[]) 
    {
        String str = "t6hj7ui";
        String result = "";
        String temp = ""; 
        for (int i = 0; i < str.length(); i++) 
        {
            char a = str.charAt(i);
            //if (Character.isLetter(a))
            if((a>='A'&& a<='Z')||(a>='a' && a<='z'))
            {
                temp += a; 
               // System.out.println(temp);
            }
            //else if (Character.isDigit(a))
            else if(a>='0'&&a<='9')
            {
                int t = a - '0';
                for (int j = 0; j < t; j++)
                {
                    result += temp; 
                   // System.out.println(result);
                }
                temp = ""; 
                
            }
        }
        result += temp; 
        System.out.println(result);
    }
}
/*
tttttthjhjhjhjhjhjhjui
*/
