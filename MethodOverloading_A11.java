package assignments;

public class MethodOverloading_A11 {
	static void add(int a)
	{
		System.out.println(a);
	}
	void add(double a)
	{
		System.out.println (a);
	}
	static void add(boolean a)
	{
	System.out.println(a);
	}
	static void add( char a)
	{
		System.out.println(a);
	}
	void add(String a)
	{
		System.out.println(a);
	}

	public static void main(String[] args) {
			MethodOverloading_A11 m1 = new MethodOverloading_A11();
			m1.add(100);
			m1.add(100.60);
			m1.add(true);
			m1.add('A');
			m1.add("God is Great");
	}
}
