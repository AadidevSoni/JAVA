public class LogicalAndOperator {

	public static void main(String[] args) {
		
		int topScore = 100;
		if(topScore == 100) {
			System.out.println("You got the high score!");
		}
		
		int secondTopScore = 60;
		if(topScore>secondTopScore && topScore <=100) {
			System.out.println("Greater than second top score but less than equal to 100");
		}

	}

}
