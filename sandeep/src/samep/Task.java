package samep;

public class Task extends Thread {
	static void I()
	{
		System.out.println("Something");
	}
	public static void main(String args[])
	{
		Task c=new Task();
		Thread d=new Thread()
				{
			     public void run()
			     {
			    	 I();
			     }
			
				};
				d.start();
	}

}
