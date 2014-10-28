import java.util.Random;
public class arrayPractice
{
    private Random rnd;
    private int[] a;
    public final int final_example = 123;
    public arrayPractice()
    {
        this(100);
    }
    public arrayPractice (int n)
    {
	rnd = new Random();
	a = new int[n];
	for (int i=0;i<a.length;i++)
	    {
		a[i] = 75 + rnd.nextInt(75);
	    }
    }

    public String toString() 
    {
	String s = new String();
	for (int i=0;i<a.length;i++)
	    {
		s = s+ a[i]+ ", ";
	    }
	return s;
    }
    public int find(int value)
    {
	
	int i;
	for (i = 0;i<a.length;i++)
	    {
		if (a[i] == value)
		    {
			return i;
		    }
		else 
		    {
		    }
	    }

		return -1;
	  
    }
    public int maxValue()
    {
        int i;
	int value = 0;
	for (i = 0; i < a.length;i++)
	    {
		if (a[i] > value)
		    { 
			value = a[i];
		    }
	    }
	return value;
    }

	
    public static void main(String[] args) 
    {
	arrayPractice as = new arrayPractice();
	System.out.println(as);
	System.out.println(as.find(100));
	System.out.println(as.maxValue());
	
    }
    public int[] randomIntArray () 
    {
	Random r = new Random();
	int i;
	int[] nums = new int[100];
	for (i = 0;i < 100; i++)
	    {
		nums[i] = r.nextInt(75) + 75;
	    }
	return nums;
    }
}
	
