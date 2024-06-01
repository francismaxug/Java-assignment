import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Abstraction execution
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");

        Calculator calculator = new Calculator();
        System.out.println("Please select the operation you want to work on! \n1. Addition\n2. Multiplication\n3. Division\n4. Subtraction");
        int userInput;
        Scanner scanner = new Scanner(System.in);
        userInput = scanner.nextInt();
        System.out.println("Please provide your first number");
        calculator.setA(scanner.nextInt());
        System.out.println("Please provide your second number");
        calculator.setB(scanner.nextInt());

        switch (userInput){
            case 1:
                System.out.println(calculator.add(5,7));
                break;
            case 2:
                System.out.println(calculator.multiply());
                break;
            case 3:
                System.out.println(calculator.divide());
                break;
            case 4:
                System.out.println(calculator.subtract());
                break;
            default:
                break;
        }


    }
}
