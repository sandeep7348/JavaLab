package testlab;

public class Testq1 {
	
  public boolean inorderEqual(int a,int b,int c, boolean equalok)
  {  if(b>a && c>b) 
    {
	  return true;
     }
	  else if(equalok&& (a<=b && b<=c))
	  {
		    return true;
	  }
	  else if((a<=b && b<=c) &&!equalok) {
		  return true;
	  }
		  else
		    return false;
		    
    
  
	  }
  public static void main(String[] args) {
     boolean e;
	  Testq1 a=new Testq1();
       e=a.inorderEqual(5, 5, 7, false);
       System.out.println(e);
     
}
}
