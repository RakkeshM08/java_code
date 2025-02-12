class Primeno {
    public static void main(String args[]) {
        int x =11; 
        int count = 0;
        
        for (int i = 2; i <= x / 2; i++) {
            if (x % i == 0) {
                count++; 
                break;  
            }
        }
        
       
        if (count == 0 && x > 1) {
            System.out.println(x +" is Prime Number");
        } else {
            System.out.println(x + " is Not a Prime Number");
        }
      
        
    }
    
}