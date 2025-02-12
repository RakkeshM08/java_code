class Short_circuit_operator
{
    public static void main (String S[])
    {
        
        int a,b,c;
        a=70;
        b=50;
        c=40;
        
        System.out.println("A is Greatest :" + (a>b && a>c)+" "+ a);
    
        System.out.println("B is Second Greater :"+(b>c||b>a)+ " "+b);
    
        System.out.println("C is Third greater :"+(c>a && c>b)+" "+ c);
    }
}

/*
A is Greatest :true 70
B is Second Greater :true 50
C is Third greater :false 40

*/