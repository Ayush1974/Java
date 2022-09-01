public class Mymeth
{
 int method(int n)
{
int sum=0;
for(int i=1;i<=n;i++)
sum+=i;
return sum;
}

public static void main(String [] args)
{
int n=100;
Mymeth obj=new Mymeth();
System.out.println(obj.method(n));
}
}