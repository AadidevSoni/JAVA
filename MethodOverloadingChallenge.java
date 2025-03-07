public class MethodOverloadingChallenge {

	public static void main(String[] args) {
		
		double h1 = convertToCentimeters(1);
		System.out.println("1 inch = " + h1 + "cm");
		double h2 = convertToCentimeters(6,2);
		System.out.println("6 feet 2 inch = " + h2 + "cm");
		
		//SECONDS AND MINUTES
		String time = getDurationString(3945);
		System.out.println(time);
		String time2 = getDurationString(65,45);
		System.out.println(time2);
		
		//BONUS CHALLENGE
		System.out.println(area(5.0));
		System.out.println(area(5.0,4.0));
		
		//MINUTES TO YEARS AND DAYS
		printYearsAndDays(525600);
		
		//EQUALITY PRINTER
		printEqual(1,2,1);
		printEqual(1,2,3);
		printEqual(1,1,1);
		
		//CAT PLAYING
		System.out.println(isCatPlaying(true,30));

	}
	
	public static double convertToCentimeters(int inch) {
		return(inch*2.54);
	}
	
	public static double convertToCentimeters(int height,int inch) {
		int newHeight = height * 12;
		int totalHeight = newHeight + inch;
		double heightInInch = convertToCentimeters(totalHeight);
		return(heightInInch);
	}
	
	//SECONDS AND MINUTES
	
	public static String getDurationString(int secs) {
		if(secs>=0) {
			int hr = secs/3600;
			int min = (secs%3600)/60;
			int sec = (secs%3600)%60;
			String time = hr + "hr " + min + "min " + sec + "sec";
			return time;
		}else {
			return("INVALID INPUT");
		}
	}
	
	public static String getDurationString(int mins,int secs) {
		if(mins>=0 && secs >=0 && secs <= 59) {
			int hr = mins/60;
			int min = mins%60;
			String time = hr + "hr " + min + "min " + secs + "sec";
			return time;
		}else {
			return("INVALID INPUT");
		}
	}
	
	//BONUS CHALLENGE
	
	public static double area(double radius){
        if(radius<0){
            return -1.0;
        }else{
            return(Math.PI*radius*radius);
        }
    }

    public static double area(double x,double y){
        if(x<0 || y<0){
            return -1.0;
        }else{
            return(x*y);
        }
    }
    
    //MINUTES TO YEARS AND DAYS
    
    public static void printYearsAndDays(long minutes){
        if(minutes < 0){
            System.out.println("Invalid Value");
        }else{
            int y = (int)minutes/525600;
            int d = (int)(minutes%525600)/1440;
            System.out.println(minutes+" min = " + y + " y and " + d + " d");
        }
    }
    
    //EQUALITY PRINTER
    
    public static void printEqual(int a,int b,int c){
        if(a<0 || b<0 || c<0){
            System.out.println("Invalid Value");
        }else{
            if(a==b && b==c){
                System.out.println("All numbers are equal");
            }else if((a==b) || (b==c) || (a==c)){
                System.out.println("Neither all are equal or different");
            }else{
                System.out.println("All numbers are different");
            }
        }
    }
    
    //CAT PLAYING
    
    public static boolean isCatPlaying(boolean summer,int temperature){
        if(summer == true){
            if(25 <= temperature && temperature <= 45){
                return true;
            }else{
                return false;
            }
        }else{
            if(25 <= temperature && temperature <= 35){
                return true;
            }else{
                return false;
            }
        }
    }

}

