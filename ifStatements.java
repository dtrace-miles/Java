import java.util.Scanner;

public class ifStatements
{
	public static void main( String[] args )
	{
	 String name;
	 double age;
	 boolean canVote;

	 Scanner kext = new Scanner(System.in);

	 System.out.println("Hello. What is your name?");
	 name = kext.next();

	 System.out.println("How old are you " + name +"?");
	 age = kext.nextDouble();

	 canVote = (age > 17);
	 if (canVote == false){
		System.out.println("Too bad, you can't vote.");
	}
	  else if (canVote == true){
		System.out.println("Great! You can vote.");
	 }
  }
}
