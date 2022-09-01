import java.util.HashMap;
public class HashMapes
{
	public static void main(String[] args)
	{	
		HashMap <String,Integer> hnm= new HashMap<String,Integer>();
	//HashMap=( keySet, Values)
		hnm.put("Ram",20);
		hnm.put("Krishn",15);
		hnm.put("Jay",25);
		hnm.put("Kim",30);
		hnm.put("Lin",40);
		for(String i: hnm.keySet())
		{ System.out.println("The Value at"+i+"="+hnm.get(i));}
	}
}