import java.util.Scanner; //First import Scanner Class

public class EvenOrOdd {
    public static void main(String[] args) {
        //Next create Scanner object
        Scanner yourNum = new Scanner(System.in);

        //Next create welcome line
        System.out.println("Welcome to Even or Odd!");
        System.out.println("To figure out if your number is even or odd enter your number");
        int choice = yourNum.nextInt() % 2; //Decided to put modulus operator directly into input to make fewer lines of code

        //Create conditional statement to print whether even or odd
        if (choice == 0) {
            System.out.println("Your number is even!");
        } else {
            System.out.println("Your number is odd!");
        }



    }
}
