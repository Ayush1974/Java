public class Break_continue
{
	public static void main(String[] args)
	{
		for(int i=1;i<=100;i++)
		{
			if(i>50)
			{
				break;
			}
			else if(i%2==0)
			{
				continue;
			}
			System.out.print(" "+i);
		}
	}
}