public class Methods {

	public static void main(String[] args) {
		
		boolean gameOver = true;
		int score = 800;
		int levelCompleted = 5;
		int bonus = 100;
		
		int finalScore = score;
		
		calculateScore(true,800,5,bonus);   //We can also pass in variables
		
		score = 10000;
		levelCompleted = 8;
		bonus = 200;
		
		finalScore = score;
		
		calculateScore(true,score,levelCompleted,bonus);

	}
	
	public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
		
		int finalScore = score;
		
		if(gameOver == true) {
			finalScore += (levelCompleted * bonus);
			finalScore += 1000;
			System.out.println("Your final score is " + finalScore);
		}
		
	}

}
