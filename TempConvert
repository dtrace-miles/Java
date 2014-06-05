import java.util.Scanner;

public class TempConvert
{
	public static void main( String[] args )
	{
		int answer, temp_input, celsius, kelvin;
		Scanner input = new Scanner(System.in);
		System.out.println("Please choose a temperature to convert (1 or 2):");
		System.out.println("(1) Kelvin");
		System.out.println("(2) Celsius");
		answer = input.nextInt();
		if (answer == 1) {
			System.out.println("Input the temperature in Kelvin to convert to Celsius: \n");
            temp_input = input.nextInt();
            celsius = temp_input - 274;
            System.out.println("The converted temperature is: "+ celsius + " Celsius.");
		} else if (answer == 2) {
			System.out.println("Input the temperature in Celsius to convert to Kelvin: \n");
			temp_input = input.nextInt();
			kelvin = temp_input + 274;
			System.out.println("The converted temperature is: " + kelvin + " Kelvin.");

		} else {
			System.out.println("Error. Please choose a temperature to convert.");
		}

    }
}
