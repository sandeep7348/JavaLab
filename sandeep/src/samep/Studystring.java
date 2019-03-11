package samep;
import java.lang.String;

public class Studystring {
   // string properties
	public static void main(String args[])
	{
        String s="abc";
      s.concat (" def ");
      s.intern();// intern() method is executed then it checks whether the String equals to this String Object is in the pool or not.
      System.out.println(s);
       System.out.println(s);// will get output as abc because we have created new string but we have not assigned refrence variable 
      s=s.concat("def");
       System.out.println(s);
       System.out.println(s.charAt(3));
        s=s.toLowerCase();// convert string to lowercase
		  System.out.println(s);
		  s=s.toUpperCase();// convert string to uppercase
		  System.out.println(s);
		  s=s.substring(2, 3);
		  System.out.println(s);
		  s=s.toString();// it basically return string
		  System.out.println(s);
         s=s.replace("a", "m");
		 System.out.println(s);
				 //String Builder properties string builder is faster than string buffer before its method are not synchronised
				 System.out.println(s.length());
				 StringBuilder x=new StringBuilder("mno");
				x.append("pqr");
				System.out.println(x);
				x.reverse();// use to reverse the string 
				System.out.println(x);
				x.insert(2, "----");//insert the given string from second character
				System.out.println(x);
			    x.delete(2, 4);//delete second and third element of given string
			    System.out.println(x);
   }
}

