package noncert;

public class Threadexp1 implements Runnable{
   public void run()
   { 
	   for(int i=0;i<100;i=i+2) {
		   
		   System.out.println("The printer 1 "+i);
	   }
	   
   }
}
 