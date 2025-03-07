public class OperatorPrecedence {

	public static void main(String[] args) {
		
		double num = 20.00;
		double num1 = 80.00;
		double result = (num + num1) * 100;
		double remainder = result % 30.00;
		boolean isZero = remainder == 0.00 ? true : false;
		System.out.println(isZero);
		
		if(!isZero) {
			System.out.println("The remainder is : " + remainder);
		}

	}

}
