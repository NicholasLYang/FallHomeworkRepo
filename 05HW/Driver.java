public class Driver 
{
    public String nonStart(String a, String b) 
    {
	return a.substring(1) + b.substring(1);
    }
    public int diff21(int n) 
    {
	if (n > 21) 
	    {
		return 2 * Math.abs(21 - n);
	    }
	else
	    {
		return Math.abs(21 - n);
	    }
    }
    public String makeAbba(String a, String b) 
    {
	return a + b + b + a;
    }

}
