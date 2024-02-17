package assignments;

public class Assignment_21 {
	static int a;
	static int b;
	void add(int a,int b)
	{
		System.out.println(a+b);
	}
	void subtract(int c, int d)
	{
		System.out.println(c-d);
	}

	public static void main(String[] args) {
		// WAP with 3 methods main,static add and static subtract. 
		//Declare and initialize a and b global variables as non- static in nature and then perform addition and subtraction with static methods
		Assignment_21 A1 = new Assignment_21();
		A1.add(50, 100);
		A1.subtract(10, 80);
		}
	}
