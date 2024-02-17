package assignments;

import java.util.Scanner;

public class Assignment_39 {

	public static void main(String[] args) {
		// WAP by taking value of age from scanner class and if age is greater than or equal to 18 then print " i am adult" else print " i am young"
		Scanner S1 = new Scanner(System.in);
		System.out.println("Enter the age");
		int age = S1.nextInt();
		if(age>=18)
		{
			System.out.println("I am Adult");
		}
		else
		{
			System.out.println("I am Young");
		}

	}

}
