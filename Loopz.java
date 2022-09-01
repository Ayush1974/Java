public class Loopz
{
	public static void main(String[] args)
	{
		//printitng 10 numbers
		int i;
		System.out.println("Loops\nWhile loop");
		i=0;
		while(i<10)
		{
			++i;
			System.out.println(i);
		}
		//printing 10 numbers by do while
		System.out.println("Do-while");
		i=0;
		do{
			i++;
			System.out.println(i);
		    }
		while(i<10);
	 	//printing alphabet by for loop
		System.out.println("For loop");
		for(char c='A';c<='Z';c++)
		{
			System.out.println(c);
		}
		
	}
}