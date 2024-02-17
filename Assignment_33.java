package assignments;

public class Assignment_33
{
	final static double pi=3.14;
	static void AreaOfCircle()
	{
		int r = 7;
		double c= 2*3.14*r;
		System.out.println(c);
	}
	void AreaOfCircle1()
	{
		int r = 14;
		double c = 2*3.14*r;
		System.out.println(c);
	}
	public static void main(String[] args) {
		// WAP to find the Area of Circle , keep pi as static global final , create 2 methods 1 having r = 7 and another having r =14
		AreaOfCircle();
		Assignment_33 A1 = new Assignment_33();
		A1.AreaOfCircle1();
		}

}
