import java.util.Scanner;

class ATM {
    public static void main(String[] args) {
        // store correct user credentials
        String correctUsername = "user";
        String correctPassword = "1234";
        int balance = 1000;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your username: ");
        String username = scanner.nextLine();
        System.out.print("Please enter your password: ");
        String password = scanner.nextLine();

        // check username and password
        if (username.equals(correctUsername) && password.equals(correctPassword)) {
            System.out.println("Login successful. Welcome to the ATM application!");

            // transaction menu
            int choice;
            do {
                System.out.println("\nPlease choose an operation:");
                System.out.println("1 - Check Balance");
                System.out.println("2 - Deposit Money");
                System.out.println("3 - Withdraw Money");
                System.out.println("4 - Exit");

                choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        System.out.println("Your current balance: " + balance + " TL");
                        break;
                    case 2:
                        System.out.println("Enter the amount you want to deposit:");
                        int depositAmount = scanner.nextInt();
                        if (depositAmount > 0) {
                            balance += depositAmount;
                            System.out.println("New balance: " + balance + " TL");
                        } else {
                            System.out.println("Invalid amount.");
                        }
                        break;
                    case 3:
                        System.out.println("Enter the amount you want to withdraw:");
                        int withdrawAmount = scanner.nextInt();
                        if (withdrawAmount <= balance && withdrawAmount > 0) {
                            balance -= withdrawAmount;
                            System.out.println("New balance: " + balance + " TL");
                        } else {
                            System.out.println("Insufficient funds or invalid amount.");
                        }
                        break;
                    case 4:
                        System.out.println("Logging out. Have a nice day!");
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again!");
                        break;
                }

            } while (choice != 4);

        } else {
            System.out.println("Incorrect username or password.");
        }

        scanner.close();
    }
}
