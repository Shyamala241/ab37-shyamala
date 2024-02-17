package assignments;

public class Constructor_A8 {
	void morning()
	{
		System.out.println("Cons 1");
	}
	void afternoon(String a, String b)
	{
		System.out.println("a");
	}
	void evening()
	{
		System.out.println("Cons 3");
	}

	public static void main(String[] args) {
		// Create few constructor and call it in main method
		Constructor_A8 C1 = new Constructor_A8();
			C1.morning();
			C1.afternoon("First", "Lunch");
			C1.evening();
			
	
	}

}
