public class Searching
{
    public Comparable[] a;
    public Searching(int num)
    {
	a = new Comparable[num];
    }
    public Searching()
    {
	a = new Comparable[0];
    }
    public void addItem(Comparable x)
    {
	Comparable[] temp = a;
	a = new Comparable[temp.length + 1];
	System.arraycopy(temp, 0, a, 0, temp.length);
	a[a.length-1] = x;
	
    }
    public String toString()
    {
	String out = new String();
	for (int i = 0; i < a.length; i++)
	    {
		out = out + a[i] + " ";
	    }
	return out;
    }
    public Comparable Isearch (Comparable x)
    {
	for (int i = 0; i < a.length; i++)
	    {
		if (a[i].compareTo(x) == 0)
		    {
			return a[i];
		    }
	    }
	return null;
    }
    public Comparable Bsearch (Comparable x)
    {
	int high = a.length;
	int low = 0;
	int mid = a.length / 2;
	while (a[mid].compareTo(x) != 0)
	    {
		if (a[mid].compareTo(x) > 0)
		    {
			high = mid + 1;
			mid = (high - low)/2;
		    }
		if (a[mid].compareTo(x) < 0)
		    {
			low = mid - 1;
			mid = (high - low)/2;
		    }
	    }
	return a[mid];
    }
    public static void main(String[] args)
    {
	Searching s = new Searching();
	String alphabet = "abcdefghijklmnopqrstuvwxyz";
	for (int i = 0; i < 10; i++)
	    {
		s.addItem(alphabet.charAt(i));
	    }
	System.out.println(s);
    }
	    

}
    