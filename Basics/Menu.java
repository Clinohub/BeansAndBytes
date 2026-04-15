import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Number1: ");
        int number1 = scanner.nextInt();
        System.out.println("The number you entered is " + number1);

        System.out.print("Enter Number2: ");
        int number2 = scanner.nextInt();
        System.out.println("The number you entered is " + number2);

        System.out.println("1 - Add");
        System.out.println("2 - Subtract");
        System.out.println("3 - Divide");
        System.out.println("4 - Multiply");
        System.out.print("Choose Operation: ");
        int operation = scanner.nextInt();

        if (operation == 1)
            System.out.println("Result is - " + (number1 + number2));
	else if (operation == 2)
            System.out.println("Result is - " + (number1 - number2));
	else if (operation == 3)
            System.out.println("Result is - " + (number1 / number2));
	else if (operation == 4)
            System.out.println("Result is - " + (number1 * number2));
	else 
            System.out.println("Invalid");
    }
} 
