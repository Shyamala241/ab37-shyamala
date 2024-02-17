package assignments;
import java.util.Scanner;
public class Assignment_37 {
	//WAP to do addition, subtraction,multiplication, division by using scanner class and  a and b as global variables
	static Scanner s1=new Scanner(System.in);
	static int a=s1.nextInt();
	static int b=s1.nextInt();
	void add()
	{
		int sum=a+b;
		System.out.println("Addition is:"+sum);

	}
	void sub()
	{
		int sub=a-b;
		System.out.println("Subtraction is:"+sub);
	}
	void mul()
	{
		int mul = a*b;
		System.out.println("Multiplication is:"+mul);
	}
	void div()
	{
		double div=a/b;
		System.out.println("Division is:"+div);
	}

	public static void main(String[] args) {
		Assignment_37 A1=new Assignment_37();
		A1.add();
		A1.sub();
		A1.mul();
		A1.div();
		}
	}
