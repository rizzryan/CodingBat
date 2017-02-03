public static void main(String[] args)
{
  public String stringBits(String str)
  {
    String st = ""; //Initializes an empty string
    int len = str.length(); //Len is initialized to the length of the string
    for(int i = 0; i<len; i+=2)
    {
      st = st+ str.substring(i, i+1);
    } //End for loop
    return st; //St is returned
  } //End stringBits method
} //End main method
