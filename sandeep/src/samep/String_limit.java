package samep;

public class String_limit {
  public static void main(String args[])
  {
	  String s="abcd";
	  for(int i=0;i<s.length();i++)
	  {
		  if(i==0)
		  {
			  System.out.println(s.substring(i,i+1));
		  }
		  if(i==s.length()-1)
		  {
			  System.out.println(s.substring(i));
		  }
		  
	  }

  }
}
