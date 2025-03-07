public class MoreIfThenElseStatements {

	public static void main(String[] args) {
		
		boolean gameOver = true;
		int score = 5000;
		int levelCompleted = 5;
		int bonus = 100;
		
		if(score == 5000) {
			System.out.println("Your score is 5000");
		}
		
		if(score < 5000) {
			System.out.println("Your score is less than 5000");
		}else if(score == 5000) {
			System.out.println("Your score is equal to 5000");
		}else {
			System.out.println("Your score is greater than 5000");
		}
		

	}

}
