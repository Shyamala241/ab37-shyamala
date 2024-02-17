package assignments;

public class ConditionalStatements_A12 {

	public static void main(String[] args) {
		// Conditional Statements to perform 6 if blocks
		int a = 8;
		int b = 6;
		int c = 7;
		int sum = a + b;

		// if Condition
		if(a>b) // false
		{
			System.out.println("c1");
		}
		if(a<b)
		{
			System.out.println("c2");
		}
		if(a>=b)
		{
			System.out.println("c3");
		}
		if(a<=b)
		{
			System.out.println("c4");
		}
		if(a==b)
		{
			System.out.println("c5");
		}
		if(a!=b)
		{
			System.out.println("c6");
		}
	


	// else_if Condition
		if (a < b)// true
		{
			System.out.println(2);

		} else {
			System.out.println(3);
		}

// If_else_if Condition
		if (a <= b)// true
		{
			System.out.println(4);
		} else if (a == 20)// false
		{
			System.out.println(5);
		} else if (a >= 20)// false
		{
			System.out.println("6");
		} else {
			System.out.println("False");
		}                          
		
		// Nested_if_else
		if(a>=b)
		{
			if(a==b)
			{
				System.out.println("condition1");
			}
			else
			{
				System.out.println("condition2");
			}
		}	
		else
		{
			System.out.println("i am the else block");
		}
	}
}                   

