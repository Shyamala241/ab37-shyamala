package practisePrgms;
class SuperClass
{
	public void add()
	{
		System.out.println("1st method");
	}
}
class SuperClass1 extends SuperClass
{
	public void sub()
	{
		System.out.println("2nd method");
	}

}

public class MulLevelInheritance extends SuperClass1
{
	

	public static void main(String[] args) {
		MulLevelInheritance m1 = new MulLevelInheritance();
		m1.add();
		m1.sub();

	}

}
