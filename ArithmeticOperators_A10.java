package assignments;

public class ArithmeticOperators_A10 {
	static void add(int a, int b)
	{
		int sum = a+b;
		System.out.println(sum);
	}
	static void sub(int a, int b)
	{
		int Subtraction = a-b;
	System.out.println(Subtraction);
	}
	void mul(int a, int b)
	{
		int multiplication = a*b;
		System.out.println(multiplication);
	}
	void div(int a, float b)
	{
		float div = (a/b);
		System.out.println(div);
	}
	public static void main(String[] args) {
		add(100, 200);
		sub(1000, 500);
		ArithmeticOperators_A10 a = new ArithmeticOperators_A10();
		a.mul(10, 20);// a is reference variable
		ArithmeticOperators_A10 b = new ArithmeticOperators_A10();
		b.div(70, 10);
	}

}
