public class FizzBuzz {
	public static void  main(String[] args) {
        for (int foo = 1; foo <= 500; foo++) {
        	if (foo % 15 == 0) {
        		System.out.println("FizzBuzz");
        	}
        	else if (foo % 3 == 0) {
        		System.out.println("Fizz");
        	}
        	else if (foo % 5 == 0) {
        		System.out.println("Buzz");
        	}
         }  
      }
    }
