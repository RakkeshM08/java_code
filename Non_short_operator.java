class Non_short_operator
{
    static public void main(String s[])
    {
        int a,b,c;
        a=70;
        b=50;
        c=40;
        
        System.out.println("A is Greatest :" + (a>b & a>c)+" "+ a);
    
        System.out.println("B is Greater :"+(b>c|b>a)+ " "+b);
    
        System.out.println("C is Smaller :"+(c<a & c<b)+" "+ c);
            
    }
}