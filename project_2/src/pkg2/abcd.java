package pkg2;

public class abcd {

public abcd() {
	
	System.out.println("default constructor");
	}
	public abcd(int a) {
		
		System.out.println("one parametrized constructor");
		}
	public abcd(int a,int b) {
	
		System.out.println("two parameterized constructor");
		}
	public abcd(int a,int b,int c) {
	
		System.out.println("three parameterized constructor");
		}
public abcd(int a,int b,int c,int d) {
		
		System.out.println("four parameterized constructor");
		}
public static void main(String[] args) {
	abc ob= new abc();
	abc ob1= new abc(22);
	abc ob2= new abc(22,33);
	abc ob3= new abc(22,33,44);
	abc ob4= new abc(23,33,44,55);
}

}



