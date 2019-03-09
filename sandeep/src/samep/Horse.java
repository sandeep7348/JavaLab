package samep;

public class Horse extends Animal {
	void eat()
	{
		System.out.println("They eat special food");
	}
	public static void main(String args[])
	{
		Animal obj=new Animal();
		Animal ob=new Horse();
		obj.eat();
		ob.eat();
	}

}
