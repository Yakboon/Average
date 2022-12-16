import java.util.Scanner;
import java.util.jar.Attributes.Name;

import javax.security.auth.Subject;

public class Student {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println(" your Name please: ");
		String name = scanner.nextLine();

		System.out.println("last name: ");
		String name2 = scanner.nextLine();

		System.out.println("subjec: ");
		String sub = scanner.nextLine();
		System.out.println("your first exam point: ");
		double total = scanner.nextDouble();
		System.out.println("your second exam point: ");
		double total2 = scanner.nextDouble();
		System.out.println("your Final mark: ");
		double Finalnot = scanner.nextDouble();

		double result = (total * 0.3) + (total2 * 0.3) + (Finalnot * 0.3);
		if (result > 70) {
			System.out.println(name + " " + name2 + "student" + sub + result + "pass");
		}

		else {
			System.out.println("did not pass");

		}
	}

}
