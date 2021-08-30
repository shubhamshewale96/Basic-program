import java.util.*;
public class QuotientReminder {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter divident: ");
		int dividend=sc.nextInt(); 
		System.out.println("Enter Diviser: ");
		int divisor=sc.nextInt();
		int quotient = dividend / divisor;
		int remainder = dividend % divisor;
		System.out.println("Quotient = " + quotient);
		System.out.println("Remainder = " + remainder);
	}
}
