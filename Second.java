import java.util.*;

abstract class Hideit
{
	String Fname="John";
	String Lname="Doe";
	int age=18;
	public abstract void study();
}

class First extends Hideit
{
	float marks=95.2f;
	String Fathername="Xavier";
	public void study()
	{
		System.out.println("Your grade is: A");
	}
}

public class Second extends First
{
	public static void main(String[] args)
	{
		First sc = new First();
		System.out.println("Your name is : "+sc.Fname+" "+sc.Lname);
		System.out.println("Your marks is : "+sc.marks);
		sc.study();
	}
}