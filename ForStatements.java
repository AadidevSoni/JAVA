public class ForStatements {

	public static void main(String[] args) {
		
		for(int i=0;i<5;i++) {
			System.out.println(i);
		}
		
		for(double rate = 2.0;rate <= 5.0;rate++) {
			double interest = calculateInterest(10000,rate);
			System.out.println("Interest for Rs 10,000 at " + rate + "% rate is " + interest);
		}
		
		//PRIME NUMBER 
		System.out.println("2 is prime: " + isPrime(2));
		System.out.println("7 is prime: " + isPrime(7));
		System.out.println("9 is prime: " + isPrime(9));
		
		//Counting Prime Numbers in a range
		int prim = 0;
		for(int i=10;i<=50;i++) {
			if(isPrime(i) == true) {
				System.out.println(i+ " is a Prime number");
				prim++;
			}
		}
		System.out.println("There are " + prim + " prime numbers between 10 and 50");
		
		//SUM ODD RANGE
		System.out.println(sumOdd(1, 100));
		System.out.println(sumOdd(-1, 100));
		System.out.println(sumOdd(100, 100));
	}
	
	public static double calculateInterest(double amount,double interestRate) {
		return(amount * (interestRate/100));
	}
	
	//PRIME NUMBER
	
	public static boolean isPrime(int number) {
		if(number > 0) {
			for(int i=2;i<(number+1)/2;i++) {
				if(number % i == 0) {
					return false;
				}
			}
			return true;
		}else {
			return false;
		}
	}
	
	//SUM ODD RANGE
	
	public static boolean isOdd(int number){
        if(number>0){
            if(number%2 == 0){
                return false;
            }else{
                return true;
            }
        }else{
            return false;
        }
    }
    public static int sumOdd(int start,int end){
        if(end >= start && start >0 && end > 0){
            int sum = 0;
            for(int i=start;i<=end;i++){
                if(isOdd(i) == true){
                    sum += i;
                }
            }
            return sum; 
        }else{
            return -1;
        }
    }

}
