package testlab;

public class Testq2 {

	public boolean makeBricks(int small, int big, int goal)
	{
		int maxBig = goal/5;
		if(maxBig <= big)
			goal -= maxBig*5;
		else
			goal -= big*5;
		if(goal <= small)
			return true;
		else
		return false;
	}
	public static void main(String args[])
	{
		boolean d;
		Testq2 b=new Testq2();
		d=b.makeBricks(1, 5, 3);
		System.out.println(d);
	}

}
