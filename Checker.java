
import java.util.*;

public class Checker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("enter your number");
            try{
            int number = scanner.nextInt();
            if (number % 2 == 0) {
                System.out.println("even number");
            } else {
                System.out.println("odd number");
            }
            System.out.println("do you want to continue? (yes/no)");
            String answer = scanner.next().toLowerCase();
            if (answer.equals("no")) {
                System.out.print("exiting...");
                break;
            } else {
                continue;
            }
            }catch(Exception e){
                System.out.println("please enter a valid input");
                scanner.next();                               // we use this to clear the buffer... always remember!!!
            }
        }
        scanner.close();
    }
}
/*this is a simple program that checks if a number is even or odd. if the user enters a non-integer value,
 the program will catch the exception and ask the user to enter a valid input. the scanner.next() method is used to 
 clear the buffer after catching the exception. this is important because if we don't clear the buffer, the program will 
 keep reading the same invalid input and will keep throwing the exception. so, always remember to clear 
 the buffer after catching an exception. happy coding my guys!!!*/
