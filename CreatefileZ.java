import java.io.File;
import java.io.IOException;
public class Createfilez
{
public static void main(String[] args)
{

try{
File f= new File("filename.txt");
if(f.createNewFile())
{
System.out.println("File created...");
}
else{
System.out.println("File already exists!");
}
}

catch(Exception e){
System.out.println("Error");
}

}
}