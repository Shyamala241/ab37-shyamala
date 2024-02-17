package assignments;

import java.util.Scanner;

public class Assignment_38 {
	
	//WAP to find area of triangle by taking values of b and h from scanner class

	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the value of b");
		int b = s1.nextInt();
		System.out.println("Enter the value of h");
		int h = s1.nextInt();
		double AreaofTriangle = 0.5*b*h;
		System.out.println("The Area of Triangle is: "  +AreaofTriangle);

	}

}
