package pkg2;//((((10/2)-2)-2)*2)

public class students {
 public int div(int a,int b)
 {
	 int c;
	 c=a/b;
	 System.out.println("div result is"+c);
	 return c;
 }
 public int sub(int d,int e,int g)
 {
	 int f;
	 f=d-e;
	 g=f-e;
	 
	 System.out.println("sub result is"+g);
	 return g;
 }
 public int sum(int h,int i)
 {
	 int j;
	 j=h+i;
	
	 
	 System.out.println("sum result is"+j);
	 return j;
 }
 public void mullti(int k,int l)
 {
	 int m;
	 m=k*l;
	
	 
	 System.out.println("final result is"+m);
	 
 }
 public static void main(String[] args) {
	students obj =new students();
	int divResult = obj.div(10, 2);
	int subResult = obj.sub(divResult, 2, 2);
	int sumReult = obj.sum(subResult,2);
	obj.mullti(sumReult, 2);
}
}
