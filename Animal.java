public class Animal
{
public static void main(String [] args)
{
	System.out.println("The execution is as follows:\n1. Domestic \n2.Junglee");
}
	Domestic myobj=new Domestic();
	Domestic.dom();
	Domestic.forest();
}


abstract class Junglee{
void forest()
{
	System.out.println("Lion,tiger,Panther are non-domestic animals");
}

}

class Domestic extends Junglee{
void dom(){
	System.out.println("Domestic animals are: cats, dogs, cows,etc");
}

}