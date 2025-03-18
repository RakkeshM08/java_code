import java.util.Scanner;

public class WordFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine().toLowerCase(); 
        

        String words[] = str.split("\\s+"); 

        boolean counted[] = new boolean[words.length];

        System.out.println("\nWord Frequency:");
        
        for (int i = 0; i < words.length; i++) {
            if (!counted[i]) { 
                int count = 1;
                for (int j = i + 1; j < words.length; j++) {
                    if (words[i].equals(words[j])) {
                        count++;
                        counted[j] = true; // Mark the word as counted
                    }
                }
                System.out.println(words[i] + " : " + count);
            }
        }
    }
}
/*
Enter a string: 
hii hello hii hello sir

Word Frequency:
hii : 2
hello : 2
sir : 1

*/
