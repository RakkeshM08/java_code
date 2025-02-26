abstract class act{
    abstract void display1();
    public static void display2()
    {
        System.out.println("Outer Class");
    }
    abstract class actor{
        abstract void display1();
        
        public void display2()
        {
        System.out.println("Inner Abstract class");
        }
    }
    
}

class Main extends act
{
    void display1() { 
        System.out.println("Display1 in MainClass");
    }
    class ConcreteActor extends actor {
        @Override
        void display1() { 
            System.out.println("Display1 in ConcreteActor");
        }
    }
     public static void main(String a[]) {
        Main obj = new Main();
        obj.display1();
        obj.display2();
        Main.ConcreteActor innerObj = obj.new ConcreteActor();
        innerObj.display1(); 
        innerObj.display2(); 
    }
    
}












// abstract class Act {
//     abstract void display1(); // Fixed: Added return type (void)

//     public static void display2() {
//         System.out.println("Outer Class");
//     }

//     abstract class Actor { // Inner abstract class
//         abstract void display1(); // Fixed: Added return type (void)

//         public void display2() {
//             System.out.println("Inner Abstract Class");
//         }
//     }
// }

// // Concrete class extending Act
// class MainClass extends Act {
//     @Override
//     void display1() { // Implementing abstract method
//         System.out.println("Display1 in MainClass");
//     }

//     // Concrete subclass for Actor
//     class ConcreteActor extends Actor {
//         @Override
//         void display1() { // Implementing abstract method
//             System.out.println("Display1 in ConcreteActor");
//         }
//     }

//     public static void main(String a[]) {
//         MainClass obj = new MainClass();
//         obj.display1(); // Calls overridden method from MainClass

//         Act.display2(); // Calling static method of outer class

//         MainClass.ConcreteActor innerObj = obj.new ConcreteActor();
//         innerObj.display1(); // Calls overridden method from ConcreteActor
//         innerObj.display2(); // Calls non-abstract method from inner class
//     }
// }

