package assignments;

public class NonStaticMethod_A5 {
	void add(int a, int b)
	{
		System.out.println(a+b);
	}

	public static void main(String[] args) {
		// Non Static Method, we should create an object then call the reference variable(n1)  
		NonStaticMethod_A5 n1 = new NonStaticMethod_A5();
		n1.add(10, 20);

	}

}
