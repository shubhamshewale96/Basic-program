import java.util.Scanner;

class Evenodd {
	public static void main(String args[]) {
		System.out.println("Enter an Integer number:");
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		if (num % 2 == 0){
			System.out.println("Entered number is even");
		}
		else
			System.out.println("Entered number is odd");
	}
}