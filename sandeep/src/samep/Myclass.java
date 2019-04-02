package samep;

public class Myclass implements A {

	@Override
	public void meth1() {
		System.out.println("Hello World");
		
	}

	@Override
	public void meth2() {
		System.out.println("Hello Java");
		
	}
	public static void main(String args[])
	{
		Myclass a=new Myclass();
		a.meth1();
		a.meth2();
		
	}

}
