//Polymorphism code
package samep;

public class Playerpiece extends Gameshape implements Animtable 
{

	public void move()
	{
		
	}
	public static void main(String args[])
	{   
		Playerpiece player=new Playerpiece();//this code can invoke display shape method of gameshape
	    Gameshape game=player;//this code can invoke display shape method of gameshape
	   // Animtable an=player;// this cannot invoke display method
	    //Object o=player;//this method cannot invoke gameshape display method
	   
	}
	public void Animate() {
		System.out.println("hello");
		
	}

}
