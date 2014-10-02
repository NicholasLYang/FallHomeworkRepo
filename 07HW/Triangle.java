public class Triangle
{
    public String rightTriangle(int h) 
    {
	String s = new String();
	int height = 0;
	    while (height < h)
		{
		    int row = height + 1;
		    while (row > 0)
			{
			    s = s + "*";
			}
		    s = s + "\n";
		}
	    return s;
    }
    public String triangle2 (int h) 
    {
	int height = h + 1;
	String s = new String();
	int numOfAsterisks = 1;
	int numOfSpaces;
	int numOfA2;
	while (numOfAsterisks < height) 
	    {
		numOfSpaces = height - numOfAsterisks;
		while (numOfSpaces > 0) 
		    {
			s = s + " ";
			numOfSpaces--;
		    }
		numOfA2 = numOfAsterisks;
		while (numOfA2 > 0)
		{
		    s = s + "*";
		    numOfA2--;
		}
		numOfAsterisks++;
		s = s + "\n";
		
	    }
	return s;

    }

}
