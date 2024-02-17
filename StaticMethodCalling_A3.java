package assignments;

public class StaticMethodCalling_A3 {
	static void div(int a, double b)
	{
		System.out.println(a/b);
	}

	public static void main(String[] args) {
		// Calling Static method inside the the main method
		//StaticMethodCalling s1 = new StaticMethodCalling();
		//s1.div(4,2);
		div(4,2);
	}

}
