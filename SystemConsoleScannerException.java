import java.util.Scanner;

public class SystemConsoleScannerException {

	public static void main(String[] args) {
		
		int currentYear = 2024;
		String userDateOfBirth = "2006";
		int userDate = Integer.parseInt(userDateOfBirth); //Converting string to integer
		System.out.println("Age = " + (currentYear - userDate));
		
		//SYSTEM.CONSOLE
		try {
			System.out.println(getInputFromConsole(currentYear));
		}catch(NullPointerException e) {
			System.out.println(getInputFromScanner(currentYear));
		}
		
		//READING USER INPUT CHALLENGE
		userInputChallenge();
		
		//MINMAXCHALLENGE
		minMaxChallenge();
		
		//InputCalculator
		inputThenPrintSumAndAverage();
		inputThenPrintSumAndAverage2();
		
		//PAIN JOB
		System.out.println(getBucketCount(-3.4, 2.1, 1.5, 2));
		System.out.println(getBucketCount(3.4, 2.1, 1.5, 2));
		System.out.println(getBucketCount(2.75, 3.25, 2.5, 1));
		
		System.out.println(getBucketCount(-3.4, 2.1, 1.5));
		System.out.println(getBucketCount(3.4, 2.1, 1.5));
		System.out.println(getBucketCount(7.25, 4.3, 2.35));
		
		System.out.println(getBucketCount(3.4, 1.5));
		System.out.println(getBucketCount(6.26, 2.2));
		System.out.println(getBucketCount(3.26, 0.75));
		

	}
	
	public static String getInputFromConsole(int currentYear) {
		
		//can only be run on terminal (SYSTEM.CONSOLE())
		
		String name = System.console().readLine("Hi, What's your name? : ");//can only be run on terminal
		System.out.println("Hello " + name + " nice to meet you!");
		System.out.println();
		
		String age = System.console().readLine("What year were you born? : ");
		int userAge = 2024 - Integer.parseInt(age);
		return("So you are " + userAge + " years old!");
	}
	
	public static String getInputFromScanner(int currentYear) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Hi, What's your name? : ");
		String name = scanner.nextLine();
		System.out.println("Hello " + name + " nice to meet you!");
		
		System.out.println("What year were you born? : ");
		boolean validDob = false;
		int age = 0;
		do {
			System.out.println("Enter a year >= " + (2024 - 125) + " and <= " + 2024);
			try {
				age = checkData(2024,scanner.nextLine());
				validDob = age < 0? false : true;
			}catch(NumberFormatException badUserData) {
				System.out.println("Characters not allowed! Try again!");
			}
	
		}while(!validDob);
		
		return("So you are " + age + " years old!");
	}
	
	public static int checkData(int currentYear,String DateOfBirth) {
		int dob = Integer.parseInt(DateOfBirth);
		int minYear = currentYear - 125;
		if((dob<minYear)||(dob > currentYear)) {
			return -1;
		}
		return(currentYear - dob);
	}
	
	//READING USER INPUT CHALLENGE
	
	public static void userInputChallenge() {
		Scanner scanner = new Scanner(System.in);
		int sum=0;
		int counter = 1;
		while(counter <= 5) {
			System.out.println("Enter number #" + counter + ": ");
			String nextNum = scanner.nextLine();
			try {
				int num = Integer.parseInt(nextNum); //if this gives error, the next 2 lines are skipped
				sum += num;
				counter++;
			}catch(NumberFormatException nfe) {
				System.out.println("INVALID NUMBER");
			}
		}
		System.out.println("SUM = " + sum);
	}
	
	//MINMAXCHALLENGE
	
	public static void minMaxChallenge() {
		Scanner scanner = new Scanner(System.in);
		int loopCount = 0;
		double max = 0.0;
		double min = 0.0;
		while(true) {
			System.out.println("Enter any number or charcter to exit: ");
			String quit = scanner.nextLine();
			try {
				double num = Double.parseDouble(quit);
				if((loopCount == 0)||(num < min)) {
					min = num;
				}
				if((loopCount == 0) || (num > max)) {
					max = num;
				}
				loopCount++;
			}catch(NumberFormatException nfe) {
				break;
			}
		}
		
		if(loopCount > 0) {
			System.out.println("MIN = " + min);
			System.out.println("MAX = " + max);
		}else {
			System.out.println("No Valid Data");
		}
	}
	
	//InputCalculator
	
	public static void inputThenPrintSumAndAverage(){
        Scanner scanner = new Scanner(System.in);
        int c = 0;
        int sum = 0;
        while(true){
            System.out.println("Enter a number or charcter to quit: ");
            String numIn = scanner.nextLine();
            try{
                int num = Integer.parseInt(numIn);
                c++;
                sum += num;
            }catch(NumberFormatException nfe){
                long avg = sum/c;
                System.out.println("SUM = " + sum + " AVG = " + avg);
                break;
            }
        }
    }
	
	public static void inputThenPrintSumAndAverage2() {
        
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        long avg = 0;
 
        while (true) {
            boolean hasNextInt = scanner.hasNextInt();
            if (!hasNextInt) {
                // break the loop on invalid input
                break;
            }
            sum += scanner.nextInt();
            count++;
            // clear buffer e.g. remove line separator
            scanner.nextLine();
        }
         
        if (count > 0) {
            avg = Math.round((double) sum / count);
        }
 
        System.out.println("SUM = " + sum + " AVG = " + avg);
        scanner.close();
    }
	
	//PAIN JOB
	
	public static int getBucketCount(double width,double height,double areaPerBucket,int extraBuckets){
        if((width < 0)||(height < 0)||(areaPerBucket<0)||(extraBuckets<0)){
            return -1;
        }else{
            double area = width * height;
            double bucketArea = areaPerBucket * extraBuckets;
            double remainingArea = area - bucketArea;
            int bucketCount = (int) (Math.ceil((remainingArea / areaPerBucket)));
            return(bucketCount);
        }
    }
    
    public static int getBucketCount(double width,double height,double areaPerBucket){
        if((width < 0)||(height < 0)||(areaPerBucket<0)){
            return -1;
        }else{
            double area = width * height;
            int bucketCount = (int) (Math.ceil((area / areaPerBucket)));
            return(bucketCount);
        }
    }
    
    public static int getBucketCount(double area,double areaPerBucket){
        if((area<0)||(areaPerBucket<0)){
            return -1;
        }else{
            int bucketCount = (int) (Math.ceil((area / areaPerBucket)));
            return(bucketCount);
        }
    }

}
