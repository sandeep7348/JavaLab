package samep;
import java.io.*;
public class Checkerror {
	public static void main(String args[])
	{
		try
		{
			
			RandomAccessFile raf=
					new RandomAccessFile("C:/Users/500064341/Documents/reflection4.txt","r");
			byte b[]=new byte[10];
            raf.readFully(b, 0, 10);
            raf.close();
			
		}
		catch(FileNotFoundException e)
		{
			System.out.println("File Not Found error");
			System.out.println(e.getMessage());
			e.printStackTrace();
			
		}
		catch(IOException e)
		{
			System.out.println("IO error");
			System.out.println(e.toString());
			e.printStackTrace();
		}
	}

}
