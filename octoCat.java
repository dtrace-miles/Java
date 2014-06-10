import java.util.Scanner;

public class octoCat
{
	public static void main( String[] args )
	{
	double age, height;
	String name;

	Scanner userinput = new Scanner(System.in);
	System.out.println("How old are you?");
	age = userinput.nextDouble();

	System.out.println("How tall are you in centimeters?");
	height = userinput.nextDouble();

	System.out.println("What is your name?");
	name = userinput.next();

	boolean evalAge, evalHeight;
    
    String thatsAll = "That's all folks!";
    double newAge=age*2;

	evalAge = (age > 35);
	evalHeight = (height > 182.0);
	System.out.println("Here are your results:");
	System.out.println("Are you too tall?: " + evalHeight);
	System.out.println("Are you too old?: " + evalAge);
	System.out.println("If you were double your age you would be " + newAge);
    System.out.println("" + thatsAll);

    
    }
}
