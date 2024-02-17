package practiceProgramming;

import java.util.Arrays;

public class ConvertStringintoArray {

	public static void main(String[] args) {
		// Convert String into Array
		String m1 = "God is Great";
		System.out.println(m1);
		System.out.println(m1.charAt(0));
		char c[]=m1.toCharArray();
		System.out.println(Arrays.toString(c));

	}

}
