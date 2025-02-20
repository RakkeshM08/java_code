import java.util.*;
class Palindrome {
    public static void main(String[] args)
    {
      String s;
      Scanner in = new Scanner(System.in);
      System.out.print("Enter Number = ");
      s = in.nextLine();
      int n = s.length();
      String rev = "";
      for (int i = n - 1; i >= 0; i--) 
      {
        rev = rev + s.charAt(i);
      }
      System.out.println("Reverse Number = " + rev);
      if (s.equals(rev))
      {
        System.out.println("Palindrome = Yes");
       
      }
      else
      {
        System.out.println("Palindrome = No");
       
      }
           
    }
}