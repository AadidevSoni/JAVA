public class MoreMethods {

	public static void main(String[] args) {
		
		boolean gameOver = true;
		int score = 800;
		int levelCompleted = 5;
		int bonus = 100;
		
		int finalScore = score;
		
		int highScore = calculateScore(true,score,levelCompleted,bonus);   //We can also pass in variables
		System.out.println(highScore);
		
		score = 10000;
		levelCompleted = 8;
		bonus = 200;
		
		finalScore = score;
		
		int highscore = calculateScore(true,score,levelCompleted,bonus);   //We can also pass in variables
		System.out.println(highscore);

	}
	
	public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
		
		int finalScore = score;
		
		if(gameOver == true) {
			finalScore += (levelCompleted * bonus);
			finalScore += 1000;
		}
		
		return(finalScore);
		
	}

}
