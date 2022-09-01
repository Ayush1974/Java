interface Animalo
{
	public void animal();
	public void cat();
}
class Cats implements Animalo
{
	public void  animal()
	{
		System.out.println("The animal function.");
	}
	public void cat()
	{
		System.out.println("The cat.");
	}
}

class Zoo_Animal
{
	
	public static void main(String[] args)
	{
		Cats myObj = new Cats();
		myObj.animal();
		myObj.cat();
	}
}