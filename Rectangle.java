public class Rectangle 
{
     double length;
     double width;
    public Rectangle(double length, double width)
    {
        this.length = length;
        this.width = width;
    }
    public Rectangle(Rectangle r) 
    {
        this.length = r.length;
        this.width = r.width;
    }
    public void display() {
        System.out.println("Length: " + length + ", Width: " + width);
    }
    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle(10.0, 5.0);
        rect1.display();
        Rectangle rect2 = new Rectangle(rect1);
        rect2.display();
    }
}
/*
Length: 10.0, Width: 5.0
Length: 10.0, Width: 5.0

*/
