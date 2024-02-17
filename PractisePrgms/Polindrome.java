package practisePrgms;

public class Polindrome {

	public static void main(String[] args) {
		String input = "malayalam";
		String output = " ";
		for(int i=input.length()-1; i>=0; i--)
		{
			char reverse = input.charAt(i);
			output = output+reverse;
		}
			System.out.println(output);
		
		 if (input.equals(output))
		{
			System.out.println("Given String is Polindrome");
		}
		else
		{
			System.out.println("Given String is not Polindrome");
		}

	}

}
