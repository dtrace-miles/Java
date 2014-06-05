/* package whatever; // don't place package name! */
import java.util.scanner;


public class NumberCompare
{
	public static void main (String[] args) throws java.lang.Exception
	{
		double first. second;
		Scanner user_input = new Scanner(System.in); 
		System.out.println("Type the first number: ");
		first = user_input.nextDouble();
		System.out.println("Type the second number: ");
		second = user_input.nextDouble();
		if (first > second){
			System.out.println("The first number ("+ first +") is larger.");
			else if (first < second){
				System.out.println("The second number ("+ second + ") is larger.");
				else if (first == second) {
					System.out.println("Both numbers (" + first +" and " + second + " are equal.");
				}
			}
		}
		
		
	}
}
