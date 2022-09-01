import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Readfile
{
	public static void main(String[] args)
	{
		try{
			FileWriter f=new FileWriter("filename.txt");
			f.write("My name is Ayush Mishra.");
			f.close();
			System.out.println("Successfully written in file.");
			
			File g=new File("filename.txt");
			Scanner sc=new Scanner(g);
			while (sc.hasNextLine())
			{
				String strs=sc.nextLine();
				System.out.println(strs);
			}
			sc.close();
			}
		catch(Exception e)
		{
			System.out.println("Help me..");
		}
}
}

				
				