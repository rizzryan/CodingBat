public static void main(String[] args)
{
  public boolean xyBalance(String str)
  {
    boolean yLetter = false;
    for(int i = str.length() - 1; i >= 0; i--)
    {
      if(str.charAt(i) == 'y')
      {
        yLetter = true;
      }
      if(str.charAt(i) == 'x' && !yLetter)
      {
        return false;
      }
    }
      return true;
  }

}
