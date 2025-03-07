public class TernaryOperator {

	public static void main(String[] args) {
		
		String makeOfCar = "BMW";
		boolean isDomestic = makeOfCar == "BMW" ? false : true;
		
		if(isDomestic) {
			System.out.println("It is domestic");
		}else {
			System.out.println("It is not domestic");
		}
		
		int age = 17;
		String ageText = age > 18 ? "18+" : "Still a kid";
		System.out.println("The person is " + ageText);

	}

}