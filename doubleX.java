public static void main(String[] args)
{
  boolean doubleX(String str)
  {
    for(int i=0; i< str.length()-1; i++)
  {
    if(str.substring(i, i+1).equals("x"))
    {
      if(str.substring(i+1,i+2).equals("x"))
      {
        return true;
      }//end if
      else
      {
        return false;
      }//end else
    }//end first if
  }//end loop
  return false;
  }
}
