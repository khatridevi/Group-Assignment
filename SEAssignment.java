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



    public static void subtraction(Scanner scanner) {
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        double result = num1 - num2;
        System.out.println("Result: " + result);
    }

    public static void multiplication(Scanner scanner) {
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        double result = num1 * num2;
        System.out.println("Result: " + result);
    }

    public static void division(Scanner scanner) {
        System.out.print("Enter numerator: ");
        double numerator = scanner.nextDouble();
        System.out.print("Enter denominator: ");
        double denominator = scanner.nextDouble();

        if (denominator != 0) {
            double result = numerator / denominator;
            System.out.println("Result: " + result);
        } else {
            System.out.println("Cannot divide by zero!");
        }
    }

    public static void atmMenu(Scanner scanner) {
        boolean backToMainMenu = false;

        while (!backToMainMenu) {
            System.out.println("\nATM Menu:");
            System.out.println("1- Withdraw");
            System.out.println("2- Deposit");
            System.out.println("3- View Balance");
            System.out.println("4- Back to Main Menu");
            System.out.print("Choose any one: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    withdraw(scanner);
                    break;
                case 2:
                    deposit(scanner);
                    break;
                case 3:
                    viewBalance();
                    break;
                case 4:
                    backToMainMenu = true;
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }

    public static void withdraw(Scanner scanner) {
        System.out.print("Enter amount to withdraw: ");
        double amount = scanner.nextDouble();

        if (amount > balance) {
            System.out.println("Insufficient balance!");
        } else {
            balance -= amount;
            System.out.println("Withdrawal successful.");
        }
    }

    public static void deposit(Scanner scanner) {
        System.out.print("Enter amount to deposit: ");
        double amount = scanner.nextDouble();

        if (amount <= 0) {
            System.out.println("Invalid amount!");
        } else {
            balance += amount;
            System.out.println("Deposit successful.");
        }
    }

    public static void viewBalance() {
        System.out.println("Your current balance is: $" + balance);
    }

    
}
