import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    String doAgain = "yes";
        while(doAgain.equals("yes"))
	    {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the number:");
            byte input = scanner.nextByte();

            if (input % 3 == 0 && input % 5 != 0) System.out.println("Fizz");
            else if (input % 3 != 0 && input % 5 == 0) System.out.println("Buzz");
            else if (input % 3 == 0 && input % 5 == 0) System.out.println("FizzBuzz");
            else System.out.println(input);
            System.out.print("Enter yes to continue:");
            doAgain = scanner.next();
        }
    }
}
