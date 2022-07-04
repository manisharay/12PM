package pkg2;

public class arthmetic {
public int sum(int a, int b)
{
int c;
c=a+b;
System.out.println("sum result is"+c);
return c;
}
public int sub(int x, int y)
{
int z;
z=x-y;
System.out.println("sub result is"+z);
return z;
}
public void multi(int x1, int x2)
{
int x3;
x3=x1*x2;
System.out.println("final result is"+x3);
}
public static void main(String[] args) {
	arthmetic ob =new arthmetic();
	int sumReult =ob.sum(12,2);
	int subresult =ob.sub(12, 2);
	ob.multi(sumReult, subresult);
}	
}
