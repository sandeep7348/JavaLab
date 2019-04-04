package samep;

import java.util.Scanner;

public class Epart2 implements Exp1_4 {
	int a,b;
	
	public static void main(String args[])
	{
		
	
    
     
     Epart2 c=new Epart2();
     c.division();
     c.modulus();
       
	}

	public void division() {
		Scanner sc=new Scanner(System.in);
				System.out.println("Enter the first no :");
		a=sc.nextInt();
		System.out.println("Enter the Second no :");
	    b=sc.nextInt();
		
		if(b==0)
		{
			try
			{
				System.out.println(a/b);
			}
			catch(ArithmeticException e)
			{
				System.out.println("Exception : "+e.getMessage());
			}
			
		}
		else
		{
			int c=a/b;
			System.out.println("Division of a number :"+c);
		}
		
	}

	public void modulus() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first no :");
a=sc.nextInt();
System.out.println("Enter the Second no :");
b=sc.nextInt();
	  System.out.println("Modulus of two no is: "+ a%b );
		
	}
	

}
