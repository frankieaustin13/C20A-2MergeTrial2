public class TheMotivator {
	public void feedback(int score) {
		if (score == 100)
			System.out.println("Oh watch out. Badass");
		else if (score > 90)
			System.out.println("Ayyee my guy!");
		else if (score > 60)
			System.out.println("Well, at least you passed.");
		else
			System.out.println("That's CLIPPED.");
	}
	public static void main(String[] args) {
		TheMotivator tm = new TheMotivator();
		tm.feedback(60);
	}
}