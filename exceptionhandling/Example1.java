package exceptionhandling;

public class Example1 {

	public static void main(String[] args) {
		try {
			System.out.println(5/0);
			//throw new ArithmeticException();
		}
		catch(ArithmeticException e) {
			e.printStackTrace();
			
			System.out.println(e.getMessage());
		}
		System.out.println("Hello");

	}

}
