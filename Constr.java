public class Constr
{
	int x;
	public Constr(int y)
	{
	x=y;
	}
	public static void main(String[] args)
	{
	Constr myObj=new Constr(5);
	System.out.println(myObj.x);
	}
}