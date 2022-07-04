package pkg2;

public class abc 
{
	public abc() {
		this(22,33,44);
	System.out.println("default constructor");
	}
	public abc(int a) {
		
		System.out.println("one parametrized constructor");
		}
	public abc(int a,int b) {
		this(22);
		System.out.println("two parameterized constructor");
		}
	public abc(int a,int b,int c) {
	
		System.out.println("three parameterized constructor");
		}
public abc(int a,int b,int c,int d) {
		
		System.out.println("four parameterized constructor");
		}
public static void main(String[] args) {
	abc ob= new abc();
	abc ob2= new abc(22,33);
	abc ob4= new abc(23,33,44,55);
}

}
