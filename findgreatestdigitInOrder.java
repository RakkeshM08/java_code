public class findgreatestdigitInOrder {
    public static void main(String[] args) {
        int[] array = {5, 9, 7};
        
        System.out.println(findGreatestDigitInOrder(array));  
    }

    public static String findGreatestDigitInOrder(int[] array) {
        int n = array.length;
        int[] greatestDigits = new int[n];  

     
        for (int i = 0; i < n; i++) {
            int number = array[i];
            int maxDigit = -1;  
            
            while (number > 0) {
                int digit = number % 10;  
                if (digit > maxDigit) {
                    maxDigit = digit;  
                }
                number /= 10;  
            }

            greatestDigits[i] = maxDigit;  
        }

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (greatestDigits[i] < greatestDigits[j]) {
                   
                    int temp = greatestDigits[i];
                    greatestDigits[i] = greatestDigits[j];
                    greatestDigits[j] = temp;
                }
            }
        }
        String result = "";
        for (int digit : greatestDigits) {
            result += digit;  
        }

        return result;
    }
}
//975

