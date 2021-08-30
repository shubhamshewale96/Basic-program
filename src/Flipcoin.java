import java.util.*;

public class Flipcoin extends Cointoss {
	public static void main(String[] args) {
		Cointoss t = new Cointoss();
		int head = 0;
		int tail = 0;
		int chance = 10;
		for (int i = 1; i <= chance; i++) {
			if (t.coin().equals("tails")) {
				tail++;
			} else {
				head++;
			}
		}
		System.out.println("Chances = " + chance);
		System.out.println("Heads: " + head);
		System.out.println("Tails: " + tail);
		System.out.println("Heads Percentage: " + ((chance/head)*100));
		System.out.println("Tails Percentage: " + ((chance/tail)*100));
	}
}

class Cointoss {
	public String coin() {
		Random r = new Random();
		int chance = r.nextInt(2);
		if (chance == 0) {
			return "tails";
		} else {
			return "heads";
		}
	}
}
