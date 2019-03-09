package samep;

public class Test {
   public static void main(String args[])
   {
	   player obj=new player();
	   Tilepiece ob=new Tilepiece();
	   doShapes(obj);
	   doShapes(ob);
	   
   }
   static void doShapes(Gameshape shape)
   {
	   shape.displayshape();
   }
}
