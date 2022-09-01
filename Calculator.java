import java.util.Scanner;

public class Calculator
{
public static void main(String[] args)
{
int a,b;
System.out.println("\tCalculator");
System.out.println("Enter first number:");
Scanner sc=new Scanner(System.in);
a=sc.nextInt();
System.out.println("Enter second number:");
Scanner obj=new Scanner(System.in);
b=sc.nextInt();
System.out.println("Enter the operation:");
char c=sc.next().charAt(0);

switch(c)
{
case '+':
System.out.println("Addition:"+(float)((int)a+(int)b));
break;
case '-':
System.out.println("Substraction:"+(float)((int)a-(int)b));
break;
case '*':
System.out.println("Multiplication:"+(float)((int)a*(int)b));
break;
case '/':
System.out.println("Division:"+(float)(a/b));
break;
case'%':
System.out.println("Modulo:"+a%b);
break;
default:
System.out.println("Wrong input");
break;
}
}
}