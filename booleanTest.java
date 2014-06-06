import java.util.Scanner;
public class booleanTest
{
	public static void main(String[] args)
	{
		Scanner userInput =new Scanner(System.in);
		double alpha;
		boolean echo;

		System.out.println("What is 24 / 2?");
		alpha = userInput.nextDouble();
		echo = (12.0 == alpha); //check if alpha is twelve, and return true or false.
		System.out.println("Did you get the correct answer... " + echo".");


	}
}
