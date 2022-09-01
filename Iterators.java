import java.util.Iterator;
import java.util.ArrayList;

public class Iterators
{
	public static void main(String[] args)
{
ArrayList<Integer> num= new ArrayList<Integer>();
num.add(8);
num.add(10);
num.add(9);

Iterator<Integer> it = num.iterator();
while(it.hasNext())
{
System.out.println(it.next());
}
}
}