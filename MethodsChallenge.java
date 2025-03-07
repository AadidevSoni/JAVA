public class MethodsChallenge {

	public static void main(String[] args) {
		int position;
		
		position = calculateHighScorePosition(1500);
		displayHighScorePosition("Tim",position);
		
		position = calculateHighScorePosition(1000);
		displayHighScorePosition("Bob",position);
		
		position = calculateHighScorePosition(500);
		displayHighScorePosition("Tom",position);
		
		position = calculateHighScorePosition(100);
		displayHighScorePosition("Ken",position);
		
		position = calculateHighScorePosition(25);
		displayHighScorePosition("Fred",position);
		
		//POSITIVE NEGATIVE AND ZERO NUMBER
		checkNumber(5);
		
		//SPEED CONVERTER
		printConversion(10.25);
		
		//MEGABYTES CONVERTER
		printMegaBytesAndKiloBytes(2500);
		
		//BARKING DOG
		boolean Bool = shouldWakeUp(true,7);
		System.out.println("Should wake up = "+Bool);
		
		//LEAP YEAR
		boolean Bool1 = isLeapYear(2024);
		System.out.println("Is Leap Year = "+Bool1);
		
		//DECIMAL COMPARATOR
		boolean Bool2 = areEqualByThreeDecimalPlaces(1.234,1.233);
		System.out.println("Are Equal = " + Bool2);
		
		//EQUAL SUM CHECKER
		boolean Bool3 = hasEqualSum(1,1,2);
		System.out.println("Has equal sum = " + Bool3);
		
		//TEEN NUMBER CHECKER
		boolean Bool4 = hasTeen(99,1,16);
		System.out.println("Has Teen: " + Bool4);

	}
	
	public static void displayHighScorePosition(String playerName, int playerPosition) {
		System.out.println(playerName + " managed to get position " + playerPosition + " on the high score list");
	}
	
	public static int calculateHighScorePosition(int score) {
		int position;
		
		if(score >= 1000) {
			position = 1;
		}else if(score >= 500 && score < 1000) {
			position = 2;
		}else if(score >= 100 && score < 500) {
			position = 3;
		}else {
			position = 4;
		}
		
		return position;
	}
	
	//POSITIVE NEGATIVE AND ZERO NUMBER
	
	public static void checkNumber(int number) {
		if(number > 0) {
			System.out.println("positive");
		}else if(number < 0) {
			System.out.println("negative");
		}else {
			System.out.println("zero");
		}
	}
	
	//SPEED CONVERTER
	
	public static long toMilesPerHour(double kilometersPerHour){
		
        if(kilometersPerHour < 0){
            return -1;
        }else{
            return(Math.round(kilometersPerHour / 1.609));
        }
    }
	
	public static void printConversion(double kilometersPerHour){
		
        if(kilometersPerHour < 0){
            System.out.println("Invalid Value");
            return;
        }else{
            long milesPerHour = toMilesPerHour(kilometersPerHour);
            System.out.println(kilometersPerHour+"km/h = "+milesPerHour+"mi/h");
        }
    }
	
	//MEGABYTES CONVERTER
	
	public static void printMegaBytesAndKiloBytes(int kiloBytes){
        if(kiloBytes<0){
            System.out.println("Invalid Value");
        }else{
            int MB = kiloBytes/1024;
            int KB = kiloBytes%1024;
            System.out.println(kiloBytes+" KB = "+MB+" MB and "+KB+" KB");
        }
    }
	
	//BARKING DOG
	
	public static boolean shouldWakeUp(boolean barking,int hourOfDay){
		
        if(hourOfDay<0 || hourOfDay > 23){
            return false;
        }else{
            if((barking == true) && (hourOfDay<8 || hourOfDay>22)){
                return true;
            }else{
                return false;
            }
        }
    }
	
	//LEAP YEAR
	
	public static boolean isLeapYear(int year){
        if(year >= 1 && year <= 9999){
            if((year%4 == 0 && year % 100 != 0) || (year%100 == 0 && year % 400 == 0)){
                return true;
            }else{
                return false;
            }
        }else{
            return false;
        }
    }
	
	//DECIMAL COMPARATOR
	
	public static boolean areEqualByThreeDecimalPlaces(double num1, double num2){
        long numb1 = (long)(num1*1000);
        long numb2 = (long)(num2*1000);
        if(numb1 == numb2){
            return true;
        }else{
            return false;
        }
    }
	
	//EQUAL SUM CHECKER
	
	public static boolean hasEqualSum(int num1, int num2, int num3){
        if(num1 + num2 == num3){
            return true;
        }else{
            return false;
        }
    }
	
	//TEEN NUMBER CHECKER
	
	public static boolean hasTeen(int age1, int age2, int age3){
        
		return(isTeen(age1) || isTeen(age2) || isTeen(age3));
		
    }
    
    public static boolean isTeen(int age){
        
    	return(age>=13 && age <= 19);
    	
    }

}
