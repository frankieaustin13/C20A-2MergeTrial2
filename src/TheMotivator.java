public class TheMotivator {
	public void feedback(int score) {
		if (score == 50)
			System.out.println("You're awesome");
		else if (score > 45)
			System.out.println("That's great");
		else if (score > 30)
			System.out.println("That's good ");
		else
			System.out.println("Well, what can I say?");
	}
	public static void main(String[] args) {
		TheMotivator tm = new TheMotivator();
		tm.feedback(60);
	}
}