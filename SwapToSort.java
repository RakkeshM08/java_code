public class SwapToSort {
    public static void main(String[] args) {
        int[] arr = {1, 1, 0, 1, 1, 0, 1, 1, 0};
        
        int left = 0, right = arr.length - 1;
        while (left < right) {
            if (arr[left] == 0 && arr[right] == 1) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
            }
            if (arr[left] == 1) left++;
            if (arr[right] == 0) right--;
        }
        
        for (int auto : arr) {
            System.out.print(auto+"\t");
        }
    }
}
/*
1       1       1       1       1       1       0       0       0
*/