package samep;

public class Camel extends Anim {
	  public void eat()
	  {
		System.out.println("hello killer");  
	  }
	  public static void main(String args[])
	  {
		  Anim obj=new Anim();
		 Anim ob=new Camel();
		  ob.eat();
		  obj.eat();
	  }

}
