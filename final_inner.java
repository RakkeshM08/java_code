class A{
    final class B{
        static void display()
        {
            System.out.println("Example");
        }
        
    }
}
class final_inner {
    
        public static void main(String s[])
        {
            A obj =new A();
            A.B.display();
            //A.B objB=obj.new B();
            //objB.display();
        }
    
}
//Example
