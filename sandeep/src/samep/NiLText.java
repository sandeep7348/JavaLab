package samep;

public class NiLText extends Mytask implements Runnable {
	public static void main(String args[])
	{  final Mytask e=new Mytask();
		Thread d=new Thread(new Mytask())
				{ public void run()
			      { e.i();;
					
			     }
			   
				};
				d.start();
				
		
	}

}
