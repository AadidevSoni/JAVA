public class SwitchStatements {

	public static void main(String[] args) {
		
		int switchval = 4;
		switch(switchval) {
		case 1:
			System.out.println("It was a 1");
			break;
		case 2:
			System.out.println("It was a 2");
			break;
		case 3: case 4: case 5:
			System.out.println("It was a 3,4 or 5");
			break;	
		default:
			System.out.println("It was not a 1,2,3,4 or 5");
			break;
		}
		
		//Enhanced switch statements
		
		int switchval1 = 8;
		switch(switchval1) {
		case 1 -> System.out.println("It was a 1");
		case 2 -> System.out.println("It was a 2");
		case 3 , 4 ,5 -> System.out.println("It was a 3,4 or 5");
		default -> System.out.println("It was not a 1,2,3,4 or 5");
		}
		
		String month = "July";
		System.out.println("July is in the " + months(month) + " Quarter");
		String month1 = "Sunday";
		System.out.println(months(month1));
		
		dayOfTheWeek(3);
		
		printNumberInWord(7);
		
		System.out.println(getDaysInMonth(2,2024) + " days in Feb in 2024");


	}
	
	public static String months(String month) {
		return switch(month) {
			case "Jan" , "Feb" , "Mar" -> "1st";
			case "Apr" , "May" , "June" -> {yield "2nd";} //This is the meaning
			case "July" , "Aug" , "Sept" -> "3rd";
			case "Oct" , "Nov" , "Dec" -> "4th";
			default -> {
				String badResponse = month + " is a bad entry";
				yield badResponse;   //yield is a keyword to return a value from return statement
			}
		};
	}
	
	public static void dayOfTheWeek(int day) {
		String dayOfWeek = switch(day) {
			case 0 -> "Sunday";
			case 1 -> "Monday";
			case 2 -> "Tuesday";
			case 3 -> "Wednesday";
			case 4 -> "Thursday";
			case 5 -> "Friday";
			case 6 -> "Saturday";
			default -> "Invalid day";
		};
		
		System.out.println(day + " represents " + dayOfWeek);
	}
	
	public static void printNumberInWord(int number){
        String NumberInWord = switch(number){
            case 0 -> "ZERO";
            case 1 -> "ONE";
            case 2 -> "TWO";
            case 3 -> "THREE";
            case 4 -> "FOUR";
            case 5 -> "FIVE";
            case 6 -> "SIX";
            case 7 -> "SEVEN";
            case 8 -> "EIGHT";
            case 9 -> "NINE";
            default -> "OTHER";
        };
        System.out.println(NumberInWord);
    }
	
	public static boolean isLeapYear(int year){
        if(year >= 1 && year <= 9999){
            if((year%4 == 0 && year%100 != 0) || (year%100 == 0 && year%400 == 0)){
                return true;
            }else{
                return false;
            }
        }else{
            return false;
        }
    }
    
    public static int getDaysInMonth(int month,int year){
        if(1<=month && month<=12 && 1<=year && year <= 9999){
            return switch(month){
                case 1,3,5,7,8,10,12 -> 31;
                case 4,6,9,11 -> 30;
                case 2 -> isLeapYear(year)? 29:28;
                default -> -1;
            };
        }else{
            return -1;
        }
    }

}
