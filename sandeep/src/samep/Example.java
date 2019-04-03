package samep;

public class Example {
public static void main(String[] args) {
	try
	{
	 System.out.println(3/0);
	 System.out.println("hello");
	}
	catch(ArithmeticException e)
	{
		System.out.println("Exception "+e.getMessage());
	}
	System.out.println("Hello");
}
}
