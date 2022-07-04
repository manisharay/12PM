package pkg2;

public class studentss {
public int sum(int a,int b,int c)
{
int d;
d=a+b;
c=d+b;
System.out.println("sum result is"+c);
return c;
}
public int sub(int e,int f)
{
int g;
g=e-f;

System.out.println("sub result is"+g);
return g;
}
public int multi(int h,int i)
{
int j;
j=h*i;

System.out.println("multi result is"+j);
return j;
}
public void div(int k,int l)
{
int m;
m=k/l;

System.out.println("final result is"+m);

}
public static void main(String[] args) {
	studentss obj=new studentss();
	int sumResult=obj.sum(10, 2, 2);
	int subResult=obj.sub(sumResult, 2);
	int multi=obj.multi(subResult, 2);
	obj.div(multi,2);
}
}
