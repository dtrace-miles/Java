import java.util.Scanner;

public class NumberCompare
{
    public static void main (String[] args)
	{
		double first, second;
		Scanner userinput = new Scanner(System.in); 
		System.out.println("Type the first number: ");
		first = userinput.nextDouble();
		System.out.println("Type the second number: ");
		second = userinput.nextDouble();
		if (first > second){
			System.out.println("The first number ("+ first +") is larger.");
		}
			else if (first < second){
				System.out.println("The second number ("+ second + ") is larger.");
			}
				else if (first == second) {
					System.out.println("Both numbers (" + first +" and " + second + " are equal.");
				}
		
	}
}
