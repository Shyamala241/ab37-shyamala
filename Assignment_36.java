package assignments;

import java.util.Scanner;

public class Assignment_36 
{
		
		//WAP to do addition, subtraction,multiplication, division by using scanner class and  a and b as local variables
		
		static void add()
		{
			Scanner s1 = new Scanner(System.in);
			System.out.println("Enter the value of a");
			int a = s1.nextInt();
			System.out.println("Enter the value of b");
			int b = s1.nextInt();
			System.out.println("Addition of two numbers");
			int sum = a+b;
			System.out.println(sum);
		}
		static void sub()
		{
			Scanner s1 = new Scanner(System.in);
			System.out.println("Enter the value of a");
			int a = s1.nextInt();
			System.out.println("Enter the value of b");
			int b = s1.nextInt();
			System.out.println("Subtraction of two numbers");
			int Subtraction= a-b;
			System.out.println(Subtraction);
		}
		static void  mul()
		{
			Scanner s1 = new Scanner(System.in);
			System.out.println("Enter the value of a");
			int a = s1.nextInt();
			System.out.println("Enter the value of b");
			int b = s1.nextInt();
			System.out.println("Addition of two numbers");
			int multiplication = a*b;
			System.out.println(multiplication);
		}
		static void div()
		{
			Scanner s1 = new Scanner(System.in);
			System.out.println("Enter the value of a");
			double a = s1.nextDouble();
			System.out.println("Enter the value of b");
			double b = s1.nextDouble();
			System.out.println("Addition of two numbers");
			double Division = a/b;
			System.out.println(Division);
			}

		public static void main(String[] args) {
			add();
			sub();
			mul();
			div();
			}
		}

	