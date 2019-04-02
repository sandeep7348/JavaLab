package samep;

public class String_pin {
 public static void main(String args[]) {
	 StringBuffer c=new StringBuffer("new");
	 for(int i=0;i<c.length();i++)
	 {
		 char d=c.charAt(i);
		 c.setCharAt(i,Character.toUpperCase(d));
		
	 }
	 System.out.println(c);
	 
 }
}
