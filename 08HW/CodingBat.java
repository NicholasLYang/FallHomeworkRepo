public class CodingBat
{
    public String stringSplosion(String str) 
    {
	String s = new String();
	for (int i = 1;i <= str.length();i++)
	    {
		s = s + str.substring(0, i);
	    }
	return s;
    }

   public String stringX(String str) 
    {

	int i = 1;
	String s = new String();
	if (str.length() < 2)
	    {
		return str;
	    }

	else
	    {
		s = s + str.substring(0,1);
		while (i < str.length() - 1)
		    {
			if ("x".equals(str.substring(i, i+1)))
			    {
				i++;
			    }
			else
			    {
				s = s + str.substring(i,i+1);
				i++;
			    }
		    }
		s = s + str.substring(str.length()-1, str.length());
		return s;
	    }
    }
}
