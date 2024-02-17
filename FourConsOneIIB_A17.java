package assignments;

public class FourConsOneIIB_A17 {
	FourConsOneIIB_A17(int a)
	{
		System.out.println("I am a  first Constructor");
	}
	FourConsOneIIB_A17(int a, int b)
	{
		System.out.println("I am a  second Constructor");
	}
	FourConsOneIIB_A17(int a, Double b)
	{
		System.out.println("I am a  Third Constructor");
	}
	FourConsOneIIB_A17(String a)
	{
		System.out.println("I am a  Fourth Constructor");
		
	}
	{
		System.out.println("I am IIB");
	}

	public static void main(String[] args) {
		// WAP with 4 constructors and 1 IIB
		new FourConsOneIIB_A17(200);
		new FourConsOneIIB_A17(10, 20);
		new FourConsOneIIB_A17(15, 5.5);
		new FourConsOneIIB_A17("Karnataka");
		}

}
