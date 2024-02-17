package assignments;

import java.util.Scanner;

public class Assignment_41 {

	public static void main(String[] args) {
		/* "WAP a program using  Switch(a) keyword case1:
		addition, case2:subtraction, case3:multiplication, 
		case4 And fetch the value of 'a' with scanner
		class using next int() method." */
		Scanner S1 = new Scanner(System.in);
		System.out.println("Enter the value of a");
		int a = S1.nextInt();
		switch(a)
		{
		case 1: System.out.println("Addition");
		break;
		case 2: System.out.println("Subtraction");
		break;
		case 3: System.out.println("Multiplication");
		break;
		case 4: System.out.println("Division");
		break;
		default: System.out.println("I am default line");
		
		}
	}

}
