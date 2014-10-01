public String frontTimes(String str, int n) {
    String s = new String();
	while (n > 0) 
	    {
                if (str.length() < 3)
                {
                   s = s + str.substring(0);
                   n--;
                }
                else
                {
		s = s + str.substring(0,3);
		n--;
                }
	    }
return s;
}



public String stringBits(String str) 
{

  String s = new String();

  while (str.length() > 1)
  {
      s = s + str.substring(0,1);
      str = str.substring(2);
  }
  s = s + str.substring(0);
  return s;
}


public String stringYak(String str) 
{
    String s = new String();
    s = str;
    while (s.indexOf("yak") > -1)
    {
    if (s.indexOf("yak") == 0)
     {
       s = s.substring(s.indexOf("yak") + 3);
     }
    else 
     {
     s = s.substring(0, s.indexOf("yak")) + s.substring(s.indexOf("yak") + 3);
     }
    }
    return s;
}      

public int stringMatch(String a, String b) 
{
    if (a.length() == 0 || b.length() == 0) 
	{
	    return 0;
	}
    else
	{
	    int s = 0;
	    int output = 0;
	    while (s + 1 != a.length() && s + 1 != b.length())
		{
		    if (a.substring(s, s + 2).equals(b.substring(s, s + 2)))
			{
			    output++;
			    s++;
			}
		    else
			{
			    s++;
			}
		}
	    return output;
	}
}
/*

5 minutes for fronttimes
4 minutes for stringbits

7 minutes for stringyak 
6 minutes for stringmatch
*/
