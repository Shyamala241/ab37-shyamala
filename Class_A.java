package assignments;

public class Class_A
{
	static int a;
	static int b;
	static void add(int a, int b)
	{ 
		System.out.println(a+b);
	}
	static void subtract(int c, int d)
	{
		System.out.println(c-d);
	}

	public static void main(String[] args) {
		// WAP with 3 methods main,static add and static subtract. 
		// Declare a and b as static global variables and initialize then in each method and perform addition and subtraction
		add(10, 20);
		subtract(60, 40);
		}
	}
