import java.util.*;//Arraylist & Collection
public class Arrays
{
public static void main(String [] args)
{

ArrayList<Integer> myNum= new ArrayList<Integer>();
myNum.add(33);
myNum.add(53);
myNum.add(22);
myNum.add(18);
myNum.add(9);

Collections.sort(myNum);
for(int i: myNum)
{
System.out.print(" "+i);
}

}
}
