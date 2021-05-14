import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    String doAgain = "yes";
        while(doAgain.equals("yes"))
	    {
            
            System.out.print("Enter the number:");
            byte input = scanner.nextByte();
	    if (input % 3 == 0 && input % 5 == 0) System.out.println("FizzBuzz");
            else if (input % 3 == 0) System.out.println("Fizz");
            else if (input % 5 == 0) System.out.println("Buzz");
            else System.out.println(input);
            
	    System.out.print("Enter yes to continue:");
            doAgain = scanner.next();
        }
    }
}
