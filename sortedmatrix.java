import java.util.*;

class sortedmatrix {
    public static void main(String[] args) {
        int a[][] = new int[3][3];
        int b[] = new int[9];
        int temp;
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Enter the matrix element at position (" + i + ", " + j + "): ");
                a[i][j] = in.nextInt();
            }
        }
        System.out.println("The Matrix:-");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("The array:-");
        int k=0;
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                b[k]=a[i][j];
                System.out.print(b[k]);
                k=k+1;
            }
        }
        for (int i = 0; i < b.length; i++) 
        {
            for (int j = i + 1; j < b.length; j++) 
            {
                if (b[i] > b[j]) 
                {
                    temp = b[i];
                    b[i] = b[j];
                    b[j] = temp;
                }
            }
        }
        int d = 0;
        for (int i = 0; i < 3; i++) 
        {
            for (int j = 0; j < 3; j++) 
            {
                a[i][j]=b[d++];
            }
        }
        System.out.println();
        System.out.println("Sorted Matrix:");
        int index = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        
    }
}
/*
Enter the matrix element at position (0, 0): 
8
Enter the matrix element at position (0, 1): 
9
Enter the matrix element at position (0, 2): 
6
Enter the matrix element at position (1, 0): 
5
Enter the matrix element at position (1, 1): 
7
Enter the matrix element at position (1, 2): 
4
Enter the matrix element at position (2, 0): 
2
Enter the matrix element at position (2, 1): 
3
Enter the matrix element at position (2, 2): 

1
The Matrix:-
8 9 6 
5 7 4 
2 3 1 
The array:-
896574231
Sorted Matrix:
1 2 3 
4 5 6 
7 8 9 

*/
