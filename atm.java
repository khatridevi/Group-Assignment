import java.util.Scanner;

public class SEAssignment {
    private static double balance = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean exitProgram = false;

        while (!exitProgram) {
            System.out.println("Main Menu:");
            System.out.println("1- Calculator");
            System.out.println("2- ATM");
            System.out.println("3- Exit");
            System.out.print("Choose any one: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    calculatorMenu(scanner);
                    break;
                case 2:
                    atmMenu(scanner);
                    break;
                case 3:
                    exitProgram = true;
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        }

        scanner.close();
    }

    public static void calculatorMenu(Scanner scanner) {
        boolean backToMainMenu = false;

        while (!backToMainMenu) {
            System.out.println("\nCalculator Menu:");
            System.out.println("1- Addition");
            System.out.println("2- Subtraction");
            System.out.println("3- Multiplication");
            System.out.println("4- Division");
            System.out.println("5- Back to Main Menu");
            System.out.print("Choose any one: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    addition(scanner);
                    break;
                case 2:
                    subtraction(scanner);
                    break;
                case 3:
                    multiplication(scanner);
                    break;
                case 4:
                    division(scanner);
                    break;
                case 5:
                    backToMainMenu = true;
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }

    public static void addition(Scanner scanner) {
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        double result = num1 + num2;
        System.out.println("Result: " + result);
    }

    // 2nd data 

    
}
