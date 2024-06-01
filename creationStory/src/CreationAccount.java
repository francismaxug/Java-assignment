import java.util.Scanner;

public class CreationAccount {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueLoop = true;

        while (continueLoop) {
            System.out.println("Enter a day of the creation week (1-7) to see the events, or type 'verse' to see the verse recorded for an event:");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("verse")) {
                System.out.println("Enter the day (1-7) to get the verse:");
                int day = scanner.nextInt();
                scanner.nextLine();
                Verse.printVerse(day);
            } else {
                try {
                    int day = Integer.parseInt(input);
                    Events.printCreationEvent(day);
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Please enter a number between 1 and 7, or 'verse'.");
                }
            }

            System.out.println("Do you want to continue? (yes/no)");
            String continueInput = scanner.nextLine();
            if (continueInput.equalsIgnoreCase("no")) {
                continueLoop = false;
            }
        }

        scanner.close();
    }
}