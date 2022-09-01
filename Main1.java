public class Main1//Inheritence
{
	
	public static void main(String[] args)
	{
		Vehical v=new Vehical();
		Cars c= new Cars();
		c.disp();
		v.show();
	}
}

 class Vehical
{
	void show()
	{
		System.out.println("This is parent class \'Vehical\'");
	}
}

class Cars extends Vehical
{

	void disp()
	{
		System.out.println("This is child class.");
		show();//inheriting the parent class vehical.
	}
}

