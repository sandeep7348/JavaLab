package noncert;

public class Threadexp2 implements Runnable {
	public void run()
	   { 
		   for(int i=1;i<100;i=i+2) {
			   
			   System.out.println("The printer 2 "+i);
		   }
		   
	   }
}
