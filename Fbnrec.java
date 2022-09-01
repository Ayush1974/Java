public class Fbnrec
{	static int fabonacci(int n)
	{
		if(n==1||n==2)
		{return 1;}
		else
{
return fabonacci(n-2)+fabonacci(n-1);
}
}
		
          
		public static  void main(String[] args)
		{
			int n=10;//enter index
			for(int i=1;i<=n;i++){
			System.out.println(" "+fabonacci(i));
}		}
}