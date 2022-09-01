import java.util.LinkedList;
import java.util.Collections;
public class LList
{
	public static void main(String[] args){
	LinkedList<String> LLists= new LinkedList<String>();
	LLists.add("5");
	LLists.add("25");
	LLists.add("13");
	LLists.add("1");
	LLists.addFirst("10");//Add in First
	
	LLists.addLast("30");//Add in Last
	LLists.removeFirst();//Remove First Element
	
	Collections.sort(LLists);
	LLists.removeLast();//Remove Last Element
System.out.println(LLists.getFirst());

	System.out.println(LLists.getLast());
	for(String i: LLists)
	{
		System.out.print(" "+i);
	}}
	
}
