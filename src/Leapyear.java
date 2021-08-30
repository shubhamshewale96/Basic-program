import java.util.Scanner;

public class Leapyear {
	public static void main(String[] args) {
		System.out.println("Enter an Year :: ");
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		if (year > 999 && year < 9999) {
			if (year % 4 == 0) {
				System.out.println("Specified year is a leap year");
			} else
				System.out.println("Specified year is not a leap year");
		}
		else
			System.out.println("Enter year is not correct format");
	}

}
