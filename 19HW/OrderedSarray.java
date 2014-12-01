public class OrderedSarray extends Sarray
{
    
    public OrderedSarray (String[] inputData)
    {
	super(inputData);
	if (this.ordered() == false)
	    {
		// this.sort();
	    }
		

    }
    public boolean ordered ()
    {
	for (int i = 0; i < data.length - 1; i++)
	    {
		if (data[i].compareTo(data[i + 1]) < 0)
		    {
			return false;
		    }
	    }
	return true;
    }
    public void sort ()
    {
	String temp;
	int j = 0;
	int k = 1;
	while (j < data.length - 1)
	    {
		k = j + 1;
		while (k < data.length)
		    {
		if (data[j].compareTo(data[k]) > 0)
		    {
			temp = data[j];
			data[j] = data[k];
			data[k] = temp;
			k++;
		    }
		else
		    {
			k++;
		    }
		    }
		j++;
	    }
    }
    public static void main(String[] args)
    {

	String[] input = {"c", "b", "a"};
	OrderedSarray os = new OrderedSarray(input);
	System.out.println(os);
	os.sort();
	System.out.println(os);
    }
			    
    
}
