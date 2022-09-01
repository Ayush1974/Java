public class Carz{
public static void main(String[] args)
{
Cars myObj= new Cars();
Cars1 myob=new Cars1();
myObj.Engine();
myob.cost();
}
}

class Cars
{
int x=10;
public void Engine()
{
System.out.println("Engine="+x);
}
}

class Cars1 extends Cars
{
int x=20;
public void cost()
{
System.out.println("Cost="+x);
}
}

