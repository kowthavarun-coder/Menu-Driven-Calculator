package Project;
import java.util.Scanner;

public class Menudrivencalculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice; 
	
		do {
			System.out.println("\n1.Add 2.Sub 3.Mul 4.Div 5.Mod 6.Exit");
			System.out.print("Enter choice: ");
			choice = sc.nextInt();

			if (choice == 6) {
				System.out.println("Exiting...");
				break;
			}
			if (choice < 1 || choice > 6) {
				System.out.println("Invalid choice!");
				continue;
			}

			System.out.print("Enter first number: ");
			double n1 = sc.nextDouble();
			System.out.print("Enter second number: ");
			double n2 = sc.nextDouble();

			switch (choice) {
				case 1:
					System.out.println("Result: " + (n1 + n2));
					break;
				case 2:
					System.out.println("Result: " + (n1 - n2));
					break;
				case 3:
					System.out.println("Result: " + (n1 * n2));
					break;
				case 4:
					if (n2 == 0) System.out.println("Error: Div by 0");
					else System.out.println("Result: " + (n1 / n2));
					break;
				case 5:
					if (n2 == 0) System.out.println("Error: Mod by 0");
					else System.out.println("Result: " + (n1 % n2));
					break;
			}
		} while (choice != 6);
		
		sc.close();
	}
}
