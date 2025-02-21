class Sum{
    private int a=50,b=100;
    public int get_a()
    {
        return a;
    }
    public int get_b()
    {
        return b;
    }
}
class Sub extends Sum
{
	public static void main(String[] args) {
	    int c;
	    Sum g=new Sum();
	    c=g.get_a()+g.get_b();
	    System.out.println("Sum "+c);
	    
	    
	}
}