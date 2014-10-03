public class Driver
{
    public static void main(String[] args)
    {
	Triangle t;
	String s = new String();
	t = new Triangle();
	s = t.tri3(5);
	String d = new String();
	// d = t.diamond(5);
	d = t.diamond(5);
	System.out.println(s);
	System.out.println(d);
	
    }
}
