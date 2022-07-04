package pkg2;

public class student
{

	int age= 20;
	int rollNo =10;
	
	public void display()
	{
		System.out.println("welcome to all");
	}
	public void display2()
	{
	System.out.println("automation is complted");
	}
	public static void main(String[] args) {
		student s =new student();
		s.display();
		s.display2();
		System.out.println(s.age);
		System.out.println(s.rollNo);
	}
}
