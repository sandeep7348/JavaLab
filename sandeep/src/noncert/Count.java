package noncert;

public class Count implements Runnable
{
	
	    int n=1;
	    public synchronized void run()
	    {
	        System.out.println(n++);
	    }

	    void showOutput()
	    {
	        System.out.println(n++);
	    }


}