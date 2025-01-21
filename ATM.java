import java.util.Scanner;
public class ATM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String accountHolderName = "Aman Vishwakarma";
        double balance = 5000.00;

        System.out.println("Welcome, " + accountHolderName + "!");

        boolean exit = false;

        while (!exit) {
            System.out.println("\nATM Menu:-");
            System.out.println("Select 1 for Check Balance");
            System.out.println("Select 2 for Deposit");
            System.out.println("Select 3 for Withdraw");
            System.out.println("Select 4 for Exit");
            System.out.print("Choose an option:- ");
            
            int choice = input.nextInt();

            switch (choice) {
                case 1:
                    // Check balance
                    System.out.println("Your current balance: ₹" + balance);
                    break;
                case 2:
                    System.out.print("Enter amount to deposit: ₹");
                    double depositAmount = input.nextDouble();
                    if (depositAmount > 0) {
                        balance += depositAmount;
                        System.out.println("Deposited ₹" + depositAmount);
                    } else {
                        System.out.println("Invalid deposit amount.");
                    }
                    break;
                case 3:
                System.out.print("Enter amount to withdraw: ₹");
                double withdrawAmount = input.nextDouble();
                if (withdrawAmount > 0 && withdrawAmount <= balance) {
                    balance -= withdrawAmount;
                    System.out.println("Successfully withdrew ₹" + withdrawAmount);
                } else if (withdrawAmount > balance) {
                    System.out.println("Insufficient balance!");
                } else {
                    System.out.println("Invalid withdrawal amount.");
                }
                break;
                case 4:
                System.out.println("Thank you for using the ATM.");
                exit = true;
                break;
                default:
                System.out.println("Invalid option.Try again.");
            }
        }

        input.close();
    }
}
