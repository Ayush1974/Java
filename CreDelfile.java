import java.io.File;
import java.io.IOException;

public class CreDelfile
{
	public static void main(String[] args)
	{
		File crefile=new File("filename1.txt");
		try{if(crefile.createNewFile())
		{
			System.out.println("File created"+crefile.getName());
		}
		else
		{
			System.out.println("The file is already created.");
		}}
catch(IOException e){ System.out.println("bing....");}
	
		File delfile= new File("filename1.txt");
		if(delfile.delete())
		{	
			System.out.println("Deleted the file:"+delfile.getName());
		}
		else
		{
			System.out.println("No file with name"+delfile.getName()+"exists.");
		}
		
	}
}