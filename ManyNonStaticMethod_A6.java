package assignments;

public class ManyNonStaticMethod_A6 {
	void eat(String a)
	{
		System.out.println("my favourite food");
		
	}
	void wash(int a, String b)
	{
		System.out.println(a+b);
		
	}
	void read(char a)
	{
		System.out.println(a);
	}
	

	public static void main(String[] args) {
		// calling Many NonStaticMethod
		ManyNonStaticMethod_A6 m1 = new ManyNonStaticMethod_A6();
		m1.eat("Bangalore");
		m1.wash(100,"pant");
		m1.read('A');

	}

}
