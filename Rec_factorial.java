public class Rec_factorial
{	public static int factorial(int n)
	{
		int products=1;
		if(n==0)
		{
			return 1;
		}
		else
		{
		return n*factorial(n-1);
		}
	}
	public static void main(String[] args)
	{
		int n=5;
		System.out.println("Factorial 5:"+factorial(n));
	}
}