public class Shorthandcond
{
	public static void main(String[] args)
	{
		int age=18;
		String vot=(age>=18)?"You can vote.":"You cannot vote";//ternary operator.
		System.out.println("Your age is: "+age+"\n"+vot);
	}
}