public class IfThenElseChallenge {

	public static void main(String[] args) {
		
		boolean gameOver = true;
		int score = 800;
		int levelCompleted = 5;
		int bonus = 100;
		
		int finalScore = score;
		
		if(gameOver == true) {
			finalScore += (levelCompleted * bonus);
			finalScore += 1000;
			System.out.println("Your final score is " + finalScore);
		}
		
		score = 10000;
		levelCompleted = 8;
		bonus = 200;
		
		finalScore = score;
		
		if(gameOver == true) {
			finalScore += (levelCompleted * bonus);
			System.out.println("Your final score is " + finalScore);
		}

	}

}
