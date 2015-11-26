public class FizzBuzz {
	public static void  main(String[] args) {
        for (int counter = 1; counter <= 500; counter++) {
        	if (counter % 15 == 0) {
        		System.out.println("FizzBuzz");
        	}
        	else if (counter % 3 == 0) {
        		System.out.println("Fizz");
        	}
        	else if (counter % 5 == 0) {
        		System.out.println("Buzz");
        	}
         }  
      }
    }
