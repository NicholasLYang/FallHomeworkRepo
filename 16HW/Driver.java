import java.util.*;
import java.io.*;
public class Driver 
{
   
    public static void main(String[] args)
    {
	Random r = new Random();
	ArrayList<Integer> a = new ArrayList<Integer>();
	for (int i = 0; i < 20; i++)
	    {
		a.add(r.nextInt(10));
	    }
	System.out.println(a);
	int j = 0;
       
        while (j + 1 < a.size() )
	    {
		if (a.indexOf(a.get(j)) == a.lastIndexOf(a.get(j)))
		{
			j++;
		}
		else
		{
		    a.remove(a.lastIndexOf(a.get(j)));
		}
	    }
		      
	System.out.println(a);
    }



}
