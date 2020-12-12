import java.security.cert.PKIXRevocationChecker.Option;
import java.util.Scanner;

public class BankingApplication {

	public static void main(String[] args) {

		BankAccount obj1 = new BankAccount("Mr Arun Kumar Pandey", "HDFC0001");
		obj1.showMenu();

	}

}

class BankAccount {

	int balance;
	int previousTransaction;
	String customername;
	String customerid;

	public BankAccount(String cname, String cid) {
		customername = cname;
		customerid = cid;
	}

	void deposit(int amount) {
		if (amount != 0) {

			balance = balance + amount;
			previousTransaction = amount; // 

		}

	}

	void withdraw(int amount) {
		if (amount != 0) {
			balance = balance - amount;
			previousTransaction = -amount;
		}

	}

	void getpreviousTransaction() {

		if (previousTransaction > 0) {

			System.out.println("Deposited: " + previousTransaction);
		}

		else if (previousTransaction < 0) {

			System.out.println("Withdrawn: " + Math.abs(previousTransaction));
		} else {

			System.out.println("No Transaction occured");
		}
	}

	void showMenu() {

		char option = '\0';
		Scanner scanner = new Scanner(System.in);

		System.out.println("Welcome " + customername);
		System.out.println("Welcome " + customerid);
		System.out.println("\n");
		System.out.println("A. CheckBalance");
		System.out.println("B. Deposit");
		System.out.println("C. WithDraw");
		System.out.println("D. PreviousTransaction");
		System.out.println("E. Exit");

		do {

			System.out.println("============================================================================");
			System.out.println("Enter an option");
			System.out.println("============================================================================");
			option = scanner.next().charAt(0);
			System.out.println("\n");

			switch (option) {
			case 'A':

				System.out.println("--------------------------------------------------------");
				System.out.println("Balance = " + balance);
				System.out.println("--------------------------------------------------------");
				System.out.println("\n");
				break;

			case 'B':

				System.out.println("--------------------------------------------------------");
				System.out.println("Enter an Amount to deposit:");
				System.out.println("--------------------------------------------------------");
				int amount = scanner.nextInt();
				deposit(amount);
				System.out.println("\n");
				break;

			case 'C':

				System.out.println("--------------------------------------------------------");
				System.out.println("Enter an Amount to Withdraw:");
				System.out.println("--------------------------------------------------------");
				int amount2 = scanner.nextInt();
				withdraw(amount2);
				System.out.println("\n");
				break;

			case 'D':

				System.out.println("--------------------------------------------------------");
				getpreviousTransaction();
				System.out.println("--------------------------------------------------------");
				System.out.println("\n");
				break;

			case 'E':

				System.out.println("*****************************************");
				break;
			default:

				System.out.println("Invalid option!!. Please enter again");
				break;

			}
		}

		while (option != 'E');

		System.out.println("Thanku for using our services");

	}
}
