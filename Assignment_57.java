package assignments;

public class Assignment_57 {
	
	//Create a class with 4 different methods other than main method with 4 different access specifiers and try to access them within class

		public void add()
		{
			System.out.println("Addition");
		}
		private  void sub()
		{
			System.out.println("Subtraction");
		}
		protected void mul()
		{
			System.out.println("multiplication");
		}
		void div()
		{
			System.out.println("Division");
		}
		public static void main(String[] args) {
			Assignment_57 A1 = new Assignment_57();
			A1.add();
			A1.sub();
			A1.mul();
			A1.div();
	}

}
