package samep;
import java.lang.Exception;
import java.util.Scanner;
public class Desktop {
	  static int B,H;
	  static boolean flag=true;
	 public static void main(String args[])
	  {
		  Scanner sc=new Scanner(System.in);
		  B=sc.nextInt();
		  H=sc.nextInt();
		  if(B<=0||H<=0)
		  {
			  System.out.println("java.lang.Exception: Breadth and height must be positive");
			  flag=false;
		  }
		  else
		  {
			  int area=B*H;
			  System.out.println(area);
		  }
	  }
 // public static void main(String[] args) {
	  
//	  Scanner sc=new Scanner(System.in);
//	  B=sc.nextInt();
//	  H=sc.nextInt();
//	  if(B>0&&H>0)
//	  {
//		  int area=B*H;
//		  System.out.println(area);
//	  }
//	  else
//	  {
//		  try
//		  {
//			  throw new Exception(); 
//		  }
//		  catch(Exception e)
//		  {
//			  System.out.println(e.getMessage()+"Bredth and Height must be positive");
//		  }
	  
	
  //}
}
