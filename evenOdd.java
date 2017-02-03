public static void main(String[] args)
{
  public int[] evenOdd(int[] nums)
  {
    int n = 0;
    while(n < nums.length && nums[n] % 2 == 0)
        n++;
    for(int j = n + 1; j < nums.length; j++)
    {
        if(nums[j] % 2 == 0)
        {
          int temp = nums[n];
          nums[n] = nums[j];
          nums[j] = temp;
          n++;
        }
    }
    return nums;
  }
}
