import java.util.Random;
import java.util.Arrays;
public class Sarray {
    String[] data = {"a", "b", "c", "d"};
    String   last;
    String first;
    
    public Sarray() {
        // set up the initial instance variables

	last = "d";
	first = "a";
    }
    public Sarray(String[] input) {
	data = java.util.Arrays.copyOfRange(input, 0, input.length);
	last = data[data.length - 1];
	first = data[1];
	    
    }
    public String toString()
    {
	String s = " ";
	for (int i = 0; i < data.length; i++)
	    {
		s = s + data[i] + " ";
	    }
	return s;
    }
	
    public boolean add(String i){
        // adds an item to the end of the list, grow if needed
        // returns true
	String[] oldData = data;
	data = new String[oldData.length + 1];
	System.arraycopy(oldData, 0, data, 0, oldData.length);
	data[data.length-1] = i;
	return true;
	
    }
    


    public int size() {
        // returns the number of items in the list (not the array size)
	return data.length;
    }

    public String get(int i) {
        // returns the item at location index of the list
	return data[i];
    }



    public String remove(int i){
        // removes the item at index i
        // returns the old value
	String[] oldData = data;
	data = new String[oldData.length];
	System.arraycopy(oldData, 0, data, 0, i);
	System.arraycopy(oldData, i, data, i, oldData.length - i);
	return oldData[i];
	    
	
    }
    public void selectSort()
    {
	//  {"d", "c", "b", "a", "z"}
	String min = new String();
       	int index = 0;
	for (int i = 0; i < data.length; i++)
	    {
		min = data[i];
		index = i;
		for (int j = i; j < data.length; j++)
		    {
		     
			
			if (min.compareTo(data[j]) > 0)
			    {
				
				min = data[j];
				index = j;

			    }
		    }
		data[index] = data[i];
		data[i] = min;
	
	      
		
	    }
    }
    public boolean sorted()
    {
	for (int i = 0; i + 1 < data.length; i++)
	    {
		if (data[i].compareTo(data[i+1]) > 0)
		    {
			return false;
		    }
	    }
	return true;
    }
    public void bubbleSort()
    {
	while (this.sorted() == false)
	    {

		for (int i = 0; i + 1 < data.length; i++)
		    {
			String temp = new String();
			if (data[i].compareTo(data[i+1]) > 0)
			    {
				temp = data[i];
				data[i] = data[i+1];
				data[i+1] = temp;
			    }
		    }
	    }
    }
    public void builtIn()
    {
	Arrays.sort(data);
    }
			    

    public static void main(String[] args)
    {

	System.out.println("Adding elements to s");
	Sarray s = new Sarray();
	for (int i = 0; i < 2000; i++)
	    {
		Random r = new Random();
		String st = new String();
		st = ""+ r.nextInt(200000);
		s.add(st);
	    }
	System.out.println("Here's s");
	System.out.println(s);
	System.out.println("Now here's the built in sort");
	s.builtIn();
	System.out.println(s);
	System.out.println("Now here's the bubble sort");
	s.bubbleSort();
	System.out.println(s);

    }
	
			

    
}
