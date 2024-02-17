package practisePrgms;

public class Parent
{
	Parent()
	{
		System.out.println("Iam the Parent");
	}
}


class SuperCalling extends Parent
{
	 SuperCalling()
	{
		 super();
		 
		System.out.println("I am the SuperCalling Statement");
	}

	public static void main(String[] args) {
		// superCalling 
		new SuperCalling();
		

	}

}
