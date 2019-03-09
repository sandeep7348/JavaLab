package samep;

public class Subclass extends Supper {
	 public void sample()
	 {
		 System.out.println("Another Thing");
	 }
	 public static void main(String args[])
	 {
		 Subclass obj=new Subclass();
		 obj.sample();
	 }

}
