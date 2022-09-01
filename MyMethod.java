public class MyMethod
{
	static void method()
	{
	System.out.println("Hi");
	}

	static void method1(int age)
	{
	System.out.println(age);
	}

	static int method2(int a,int b)
	{
	int c=a+b;
	return c;
	}
	public static void main(String[] args)
	{
	int age=18;
	method();
	method1(age);
	int sum=method2(2,3);
	System.out.println("sum="+sum);
	}
}
	
			