public class WhileLoops {

	public static void main(String[] args) {
		
		int j = 1;
		boolean isReady = false;
		do {
			if(j>5) {
				break;
			}
			System.out.println(j);
			j++;
			isReady = (j>0);
		}while(isReady);
		
		//EvenNo
		int start = 5;
		int end = 25;
		int odd = 0;
		int even = 0;
		while(start<=end) {
			if(isEvenNumber(start)) {
				System.out.print(start + " ");
				even++;
			}else {
				odd++;
			}
			start++;
		}
		System.out.println();
		System.out.println("No of even nos: " + even);
		System.out.println("No of odd nos: " + odd);
		
		//SUM OF DIGITS
		System.out.println("Sum of digits of 125: " + sumOfDigits(125));
		
		//PALINDROME
		System.out.println("121 is a Palindrome: " + isPalindrome(121));
		
		//First And Last Digit Sum
		System.out.println("Sum of first and last digit of 123 = " + sumFirstAndLastDigit(123));
		
		//Even Digit Sum
		System.out.println("Sum of even digits of 124 = " + getEvenDigitSum(124));
		
		//Shared Digit
		System.out.println(hasSharedDigit(15,23));
		
		//Last Digit Checker
		System.out.println("Validity of 100: " + isValid(100));
		System.out.println("Validity of 200: " + isValid(200));
		System.out.println("Validity of 111: " + isValid(111));
		System.out.println("100,200 and 111 has atleast one last digit same: " + hasSameLastDigit(100,200,111));
		
		//All Factors
		printFactors(6);
		
		//Greatest Common Divisor
		System.out.println("Greatest Common Divisor of 12 and 30: " +  getGreatestCommonDivisor(12,30));
		
		//PERFECT NUMBER
		System.out.println("6 is a Perfect Number: " + isPerfectNumber(6));
		
		//NUMBER TO WORDS
		numberToWords(001);
		System.out.println();
		numberToWords(1234);
		System.out.println();
		
		//LARGEST PRIME
		System.out.println(getLargestPrime(21));
		
		//DIAGONAL STAR
		printSquareStar(8);
	}
	
	//EVEN NO
	
	public static boolean isEvenNumber(int number) {
		if(number%2 == 0) {
			return true;
		}else {
			return false;
		}
	}
	
	//SUM OF DIGITS
	
	public static int sumOfDigits(int num) {
		int sum = 0;
		int rem = 0;
		while(num>0) {
			rem = num%10;
			sum += rem;
			num /= 10;
		}
		return sum;
	}
	
	//PALINDROME
	
	public static boolean isPalindrome(int number){
        int original = number;
        int rem = 0;
        int reversed = 0;
        int i = 1;
        if(number < 0){
            while(number < 0){
                rem = number%10;
                reversed = reversed*10 + rem;
                number /= 10;
            }
            if(reversed == original){
                return true;
            }else{
                return false;
            }
        }
        while(number > 0){
            rem = number%10;
            reversed = reversed*10 + rem;
            number /= 10;
        }
        if(reversed == original){
            return true;
        }else{
            return false;
        }
        
    }
	
	//First And Last Digit Sum
	
	public static int sumFirstAndLastDigit(int number){
        int sum = 0;
        int last = 0;
        int reversed = 0;
        int first = 0;
        int rem = 0;
        if(number < 0){
            return(-1);
        }
        last = number % 10;
        
        while(number > 0){
            rem = number%10;
            reversed = reversed*10 + rem;
            number /= 10;
        }
        first = reversed % 10; 
        sum = first + last;
        return(sum);
    }
	
	//Even Digit Sum
	
	public static int getEvenDigitSum(int number){
        if(number < 0){
            return -1;
        }
        int sum = 0;
        int rem = 0;
        while(number > 0){
            rem = number % 10;
            if(rem % 2 == 0){
                sum += rem;
            }
            number /= 10;
        }
        return(sum);
    }
	
	//Shared Digit
	
	public static boolean hasSharedDigit(int a,int b){
        if(a>=10 && a<= 99 && b>=10 && b<=99){
        	int a1 = 0;
        	int a2 = 0;
        	int i = 1;
            while(a>0) {
            	if(i==1) {
            		a1 = a%10;
            	}else {
            		a2 = a%10;
            	}
            	a/=10;
            	i++;
            }
            int b1 = 0;
        	int b2 = 0;
        	int j =1;
            while(b>0) {
            	if(j==1) {
            		b1 = b%10;
            	}else {
            		b2 = b%10;
            	}
            	b/=10;
            	j++;
            }
            if((a1==b1 || a1 == b2) || (a2 == b1 || a2 == b2)) {
            	return true;
            }else {
            	return false;
            }
            
        }else{
            return false;
        }
    }
	
	//Last Digit Checker
	
	public static boolean hasSameLastDigit(int a,int b,int c){
        if(10<=a && a<= 1000 && 10<=b && b<=1000 && 10<=c && c<=1000 ){
            int l1 = a%10;
            int l2 = b%10;
            int l3 = c%10;
            if((l1 == l2) || (l2 == l3) || (l1 == l3)){
                return true;
            }else{
                return false;
            }
        
        }else{
            return false;
        }
    }
    
    public static boolean isValid(int num){
        if(10<=num && num<= 1000){
            return true;
        }else{
            return false;
        }
    }
    
    //All Factors
    
    public static void printFactors(int number){
        if(number < 1){
            System.out.println("Invalid Value");
        }else{
            for(int i=1;i<=number;i++){
                if(number%i == 0){
                    System.out.print(i + " ");
                }
            }
        }
        System.out.println();
    }
    
  //Greatest Common Divisor
    
    public static int getGreatestCommonDivisor(int first,int second){
        if(first < 10 || second < 10){
            return -1;
        }
        int GCD = 0;
        if(first > second){
            for(int i=1;i<=first;i++){
                if(first % i ==0 && second % i == 0){
                    GCD = i;
                }
            }
            return(GCD);
        }else{
            for(int i=1;i<=second;i++){
                if(first % i ==0 && second % i == 0){
                    GCD = i;
                }
            }
            return(GCD);
        }
    }
    
    //PERFECT NUMBER
    
    public static boolean isPerfectNumber(int number){
        if(number < 1){
            return false;
        }
        int sum = 0;
        for(int i=1;i<number;i++){
            if(number%i == 0){
                sum += i;
            }
        }
        if(number == sum){
            return true;
        }else{
            return false;
        }
    }
    
    //NUMBER TO WORDS
    
    public static void numberToWords(int number){
        if(number < 0){
            System.out.println("Invalid Value");
        }else{
            int reverse = reverse(number);
            int leadingZeroes = getDigitCount(number) - getDigitCount(reverse);
            
            if (reverse == 0) {
                System.out.println("Zero");
                return;
            }
            int rem = 0;
            while(reverse > 0){
                rem = reverse % 10;
                switch(rem){
                    case 0:
                        System.out.print("Zero ");
                        break;
                    case 1:
                        System.out.print("One ");
                        break;
                    case 2:
                        System.out.print("Two ");
                        break;
                    case 3:
                        System.out.print("Three ");
                        break;
                    case 4:
                        System.out.print("Four ");
                        break;
                    case 5:
                        System.out.print("Five ");
                        break;
                    case 6:
                        System.out.print("Six ");
                        break;
                    case 7:
                        System.out.print("Seven ");
                        break;
                    case 8:
                        System.out.print("Eight ");
                        break;
                    case 9:
                        System.out.print("Nine ");
                        break;
                }
                reverse /= 10;
            }
            // print zeroes if there are any leading zeroes in reversed number
            for (int i = 0; i < leadingZeroes; i++) {
                System.out.println("Zero");
            }
        }
    }
    
    public static int reverse(int num){
        int reversed = 0;
        int rem;
        while(num > 0){
            rem = num % 10;
            reversed = reversed * 10 + rem;
            num /= 10;
        }
        return(reversed);
    }
    
    public static int getDigitCount(int number){
        if(number < 0){
            return -1;
        }
        if(number == 0) {
        	return 1;
        }
        int size = 0;
        while(number > 0){
            size++;
            number /= 10;
        }
        return size;
    }
    
    //LARGEST PRIME
    
    public static int getLargestPrime(int number){
        if(number <= 1){
            return -1;
        }
        int largest = 0;
        for(int i=2;i<=number;i++){
        	int c = 0;
        	if(number%i == 0) {
        		for(int j=2;j<i;j++){
                    if(i%j == 0){
                        c++;
                    }
                }
                if(c==0){
                    largest = i;
                }
        	}
        }
        return(largest);
    }
    
    //DIAGONAL STAR
    
    private static final String STAR = "*";
    private static final String SPACE = " ";
    
    public static void printSquareStar(int number) {
        
        if (number < 5) {
            System.out.println("Invalid Value");
            return;
        }
 
        // Iterate over each row
        for (int row = 1; row <= number; row++) {
            // Iterate over each column
            for (int column = 1; column <= number; column++) {
                // if either row or column equals 1, assign true to isFirstRowOrColumn.
                boolean isFirstRowOrColumn = row == 1 || column == 1;
                // if either row or column equals number, assign true to isLastRowOrColumn.
                boolean isLastRowOrColumn = row == number || column == number;
                // if either row equals column, or column equals number minus row plus 1, assign true to isFirstRowOrColumn.
                boolean isDiagonal = (row == column) || (column == (number - row + 1));
 
                if (isFirstRowOrColumn || isLastRowOrColumn || isDiagonal) {
                    System.out.print(STAR);
                } else {
                    System.out.print(SPACE);
                }
            }
            // Move to the next line
            System.out.println();
        }
    }
    

}
