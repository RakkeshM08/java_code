import java.util.Scanner;

public class AutomorphicNo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int n = in.nextInt();
        int sqr = n * n;
        int temp = n;  


        while (temp > 0) {
            if (temp % 10 != sqr % 10) {
                System.out.println(n + " is NOT an Automorphic Number.");
                return; 
            }
            temp /= 10;
            sqr /= 10;
        }

        System.out.println(n + " is an Automorphic Number.");
    }
}
/*
Enter the Number: 25
25 is an Automorphic Number.

*/