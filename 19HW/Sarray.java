public class Sarray {
    String[] data = {"a", "b", "c", "d"};
    String   last;
    
    public Sarray() {
        // set up the initial instance variables

	last = "d";
    }
    public Sarray(String[] input) {
	data = java.util.Arrays.copyOfRange(input, 0, input.length);
	last = data[data.length - 1];
	    
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


    
}
