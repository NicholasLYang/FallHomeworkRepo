public class Triangle 
{
    public String tri3(int h)
    {
	String s = new String();
	int height = h;
	int nOfSpaces;
	int nOfAsterisks = 1;
	while (height > 0)
	    {
		nOfSpaces = h - (nOfAsterisks + 1) / 2;
		while (nOfSpaces > 0)
		    {
			s = s + " ";
			nOfSpaces--;
		    }
		int nOfA2 = nOfAsterisks;
		while(nOfA2 > 0)
		    {
			s = s + "*";
			nOfA2--;
		    }
		nOfAsterisks = nOfAsterisks + 2;
		height--;
		s = s + "\n";
	    }
	return s;
    }
    
    public String diamond(int h)
    {
	String s = new String();
	int height = (h + 1)/ 2;
	int numOfAsterisks = 1;
	int numOfA2;
	int numOfSpaces;
	while (height > 0)
	    {
		numOfSpaces = (h - numOfAsterisks) / 2;
		while (numOfSpaces > 0)
		    {
			s = s + " ";
			numOfSpaces--;
		    }
		numOfA2 = numOfAsterisks;
		while(numOfA2 > 0)
		    {
			s = s + "*";
			numOfA2--;
		    }
		numOfAsterisks = numOfAsterisks + 2;
		height--;
		s = s + "\n";
	    }

	height = (h - 1)/ 2;
	numOfSpaces = 1;
	numOfAsterisks = numOfAsterisks - 4;
	    while (height > 0)
		{
		    numOfA2 = numOfAsterisks;
		     for (int i2 = numOfSpaces; i2 > 0; i2--)
			{
			    s = s + " ";
			}
		    for (int i = numOfAsterisks; i > 0; i--)
			{
			    s = s + "*";
			    
			}
		    
		    numOfAsterisks = numOfAsterisks - 2;
		    height--;
		    s = s + "\n";
		    numOfSpaces++;
		}
	return s;
    }
    public String tri4(int h)
    {
	String s = new String();
	int height = h;
	int numOfA;
	while (height > 0)
	    {
		numOfA = height;
		while (numOfA > 0)
		    { 
			s = s + "*";
			    numOfA--;
		    }
		height--;
		s = s + "\n";
	    }
	return s;
    }
}
