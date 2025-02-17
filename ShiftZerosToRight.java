public class ShiftZerosToRight {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 5, 0, 6, 7, 9, 0, 5, 0, 3};
        
        int left = 0; 
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[left] = arr[i];  
                if (left != i) {
                    arr[i] = 0;
                }
                left++; 
            }
        }

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
/*
1 3 4 5 6 7 9 5 3 0 0 0 
*/
