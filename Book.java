class Book{
    String title;
    double price;
    Book()
    {
        title="Java Pragramming";
        price=100.0;
    }
    void display()
    {
        System.out.println("Book Title :"+title);
        System.out.println("Book Price :"+price);
    }

public static void main (String a[])
{
    Book b= new Book();
    b.display();
}
}
/*
Book Title :Java Pragramming
Book Price :100.0

/*