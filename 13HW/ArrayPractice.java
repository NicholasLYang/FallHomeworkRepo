public int[] frontPiece(int[] nums) {
  if (nums.length < 2)
  { return nums;}
  int[] output = {nums[0], nums[1]};
  return output;
}
public int sum13(int[] nums) {
int output = 0;
int i = 0;
   while (i < nums.length)
   {
     if (nums[i] == 13)
     {i = i + 2;}
     else
     {
     output = nums[i] + output;
     i++;
     }
   }
     
  return output;
}
