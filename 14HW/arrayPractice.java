import java.util.Random;
public class arrayPractice
{
    private Random rnd;
    private int[] a;
    public final int final_example = 123;
    public arrayPractice()
    {
        this(100);
    }
    public arrayPractice (int n)
    {
	rnd = new Random();
	a = new int[n];
	for (int i=0;i<a.length;i++)
	    {
		a[i] = 75 + rnd.nextInt(75);
	    }
    }

    public String toString() 
    {
	String s = new String();
	for (int i=0;i<a.length;i++)
	    {
		s = s+ a[i]+ ", ";
	    }
	return s;
    }
    public int find(int value)
    {
	
	int i;
	for (i = 0;i<a.length;i++)
	    {
		if (a[i] == value)
		    {
			return i;
		    }
		else 
		    {
		    }
	    }

		return -1;
	  
    }
    public int maxValue()
    {
        int i;
	int value = 0;
	for (i = 0; i < a.length;i++)
	    {
		if (a[i] > value)
		    { 
			value = a[i];
		    }
	    }
	return value;
    }

	
    public static void main(String[] args) 
    {
	arrayPractice as = new arrayPractice();
	System.out.println(as);
	System.out.println(as.find(100));
	System.out.println(as.maxValue());
	
    }
    
 public int sum67(int[] nums) 
{
  int i;
  int output = 0;
  boolean count = true;
  for (i = 0 ; i < nums.length ; i++ )
  {
    if (nums[i] == 6)
    {
       count = false;
    }
    if (count)
    {
      output = output + nums[i];
    }
    if (nums[i] == 7)
    {
      
      count = true;
    }
  
  }
  return output;
       
}

public boolean more14(int[] nums) {
  int numOf1 = 0;
  int numOf4 = 0;
  for (int i = 0; i < nums.length; i++)
  {
    if (nums[i] == 1)
    {
    numOf1++;
    }
    if (nums[i] == 4)
    {
    numOf4++;
    }
  }
  return numOf1 > numOf4;
}

public int[] tenRun(int[] nums) 
{

    int c = 5;

  for (int i = 0; i < nums.length; i++)
  {

    if (nums[i] % 10 == 0)
    {
      c = nums[i];
    }
    if (c == 5)
    {}
    if (c % 10 == 0)
    {
      nums[i] = c;
    }
        
      
   
 }
  return nums;
}

public boolean tripleUp(int[] nums) {
  for (int i = 0; i + 2 < nums.length; i++)
  {
    if ( nums[i] + 1 == nums[i + 1] && nums[i] + 2 == nums[i + 2])
    { return true; }
  }
  return false;
}

public boolean canBalance(int[] nums) {
for (int i = 0; i < nums.length; i++)
{
 int sum1 = 0;
 int sum2 = 0;
 for (int j = 0; j < i; j++)
 {
   sum1 = nums[j] + sum1;
 }
 for (int k = i; k < nums.length; k++)
 {
  sum2 = nums[k] + sum2;
 }
 if (sum1 == sum2)
 {return true;}
 
}
return false;
}


public int[] seriesUp(int n) 
{
int[] output = new int[n * (n + 1)/2];
for (int numOfTerms = 0; numOfTerms < n; numOfTerms++)
{ 
    int x = numOfTerms * (numOfTerms + 1)/2;
for (int i = 0; i <= numOfTerms; i++)
{
 
  output[x] = i + 1;
  x++;
}
}
return output;
    
}
}
	
