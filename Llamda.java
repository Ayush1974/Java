import java.util.ArrayList;
public class Llamda
{	public static void main(String[] args)
	{
		ArrayList<Integer> a=new ArrayList<Integer>();
		a.add(1);
		a.add(10);
		a.add(5);
		a.add(2);
		a.remove(0);//index based deletion
		a.forEach((n)->{System.out.print(n+" " );});
	}
}
		