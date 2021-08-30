public class Harmonic {
	public static void main(String args[]) {
		int num = 5;
		double result = 0.0;

		System.out.println("The harmonic series is: ");

		// printing the harmonic series till num value
		while (num > 0) {

			// calculating harmonic value
			result = result + (double) 1 / num;
			num--;
			System.out.print(result + ", ");
		}
	}
}
