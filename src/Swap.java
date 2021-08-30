import java.util.*;

public class Swap {
	public static void main(String arg[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two no: ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		System.out.println("Before swapping");
		System.out.println("value of x:" + x);
		System.out.println("value of y:" + y);
		System.out.println("After swapping");
		x = x + y;
		y = x - y;
		x = x - y;
		System.out.println("value of x:" + x);
		System.out.println("value of y:" + y);
	}

}
