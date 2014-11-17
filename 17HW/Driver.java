
import java.io.*;
import java.util.*;

public class Driver{
    public static void main(String[] args){
	//-------------------- With ArrayList -------------------\\ 
	ArrayList<Integer> al = new ArrayList<Integer>();
	ArrayList<Integer> alRandom = new ArrayList<Integer>();
	Random r = new Random();
	for (int i = 0; i < 6; i++) {
	    al.add(i);
	}
	for (int i = 0; i < 6; i++) {
	    int randomIndex = r.nextInt(al.size());
	    alRandom.add(al.get(randomIndex));
	    al.remove(randomIndex);
	}
	System.out.println(alRandom);

	//-------------------- With Array -----------------------\\
	int[] a = {0, 1, 2, 3, 4, 5, 6};
        // Start by adding one to 
	int[] out = new int[a.length];
	for (int i = 0; i < out.length; i++)
	    {
		out[i] = -1;
	    }
	int j = 0;
	while (j < a.length)
	    {
		int k = r.nextInt(out.length);
		if (out[k] == -1)
		    {
			out[k] = a[j];
			j++;
		    }
	    }
	String output = new String();
	for (int i = 0; i < out.length; i++)
	    {
		output = output + out[i] + " ";
	    }
	System.out.println(output);

	
    }
}
