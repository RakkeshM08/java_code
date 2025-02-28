import java.util.Scanner;

public class AutomorhicRange {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the range (start and end): ");
        int start = in.nextInt();
        int end = in.nextInt();

        System.out.println("Automorphic Numbers in the range:");
        
        for (int i = start; i <= end; i++) {
            int n = i, sqr = n * n, temp = n;

            while (temp > 0) {
                if (temp % 10 != sqr % 10) {
                    break;
                }
                temp /= 10;
                sqr /= 10;
            }

            if (temp == 0) {
                System.out.println(i + "is a Automorphic Number ");
            }
        }


    }
}

/*

Enter the range (start and end): 1
100
Automorphic Numbers in the range:
1is a Automorphic Number 
5is a Automorphic Number 
6is a Automorphic Number 
25is a Automorphic Number 
76is a Automorphic Number
*/
