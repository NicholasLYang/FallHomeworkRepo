public class Frame 
{
    public String frame(int l, int h)
    {
	String s = new String();
	s = s + construct(l, "*") + "\n";
	for (int i = h - 2; i > 0 ; i--)
	    {
		s = s + "*" + construct(l-2, " ") + "*" + "\n" ;
	    }
	s = s + construct(l, "*");
	return s;
    }
    public String construct(int n, String s)
    {
	String d = new String();
	while (n > 0)
	    {
		d = d + s;
		n--;
	    }
	
	return d;
    }

}
