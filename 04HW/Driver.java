public class Driver 
{

    public String makeOutWord(String out, String word) 
    {

	return out.substring(0, 2) + word + out.substring(2, 4);
    }
    public Boolean mixStart(String str) 
    {
	if (str.length() < 3)
	    {
		return false;
	    }
	return "ix".equals(str.substring(1, 3));
    }
    public String firstHalf(String str) 
    {
	return str.substring(0, str.length()/2);
    }


}
