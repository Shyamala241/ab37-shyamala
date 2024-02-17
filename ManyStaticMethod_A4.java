package assignments;

public class ManyStaticMethod_A4 {
	static void add(int a, int b) {
		System.out.println(a+b);
	}
	static void sub(int a, int b)
	{
		System.out.println(a-b);
		
	}
	static void mul(int a, int b)
	{
		System.out.println(a*b);
	}
	static void div(int a, double b)
	{
		System.out.println(a/b);
	}
	

	public static void main(String[] args) {
		// Many Static methods calling inside the main method
		add(10, 20);
		sub(500, 200);
		mul(50, 80);
		div(2000,5000);

	}

}
