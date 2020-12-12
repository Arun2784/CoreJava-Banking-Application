import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter a number");
		int a = scanner.nextInt();

		System.out.println("value is = " + a);
	}

}
