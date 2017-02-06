public static void main(String[] args)
{
  public int centeredAverage(int[] nums)
  {
    int max = nums[0];
    int min = nums[0];
    int total = nums[0];
    for(int i=1; i<nums.length; i++)
    {
      total += nums[i];
      if(nums[i] > max)
      {
        max = nums[i];
      }else if(nums[i] < min)
      {
        min = nums[i];
      }
    }
    return (total-max-min)/(nums.length-2);
  }
}
