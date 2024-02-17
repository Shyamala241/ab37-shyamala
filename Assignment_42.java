package assignments;

import java.util.Scanner;

public class Assignment_42 {

	public static void main(String[] args) {
		// WAP using switch(a) keyword case1: addition of b&c, case2: subtraction of b&c, case3: multiplication of b&C, 
		//case4: division of b&c. Fetch the value of a, b &c from scanner class using nextint() method. And print the output individually for all cases.
		Scanner S1 = new Scanner(System.in);
		System.out.println("Enter the value of a");
		int a = S1.nextInt();
		System.out.println("Enter the value of b");
		int b = S1.nextInt();
		System.out.println("Enter the value of c");
		int c = S1.nextInt();
		int sum = b+c;
		int sub = b-c;
		int mul = b*c;
		double div = b/c;
		switch(a)
		{
		case 1: System.out.println("Addition of b&c : 2" +sum);
		break;
		case 2: System.out.println("Subtraction of b&c : " +sub);
		break;
		case 3: System.out.println("Multiplication of b&c : " +mul);
		break;
		case 4: System.out.println("Division of b&c : " +div);
		break;
		default : System.out.println("I am default line");
		}
	}

}
