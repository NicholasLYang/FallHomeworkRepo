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
    public String triangle2 (int h) {
	String s = new String();
	int height = 0;
	while (height<h) {
	    int x = 0
	    while (h - x >1) {
		s = s + " ";
		x++;
	    }
	    
	    
}
