public class PrimitiveTypesChallenge {

	public static void main(String[] args) {
		
		byte myByte = 100;
		short myShort = 1000;
		int myInt = 10000;
		
		long myLong = 50000 + 10 * (myByte + myShort + myInt);
		System.out.println(myLong);
		
		short myTotal = (short) (50000 + 10 * (myByte + myShort + myInt));  //for int and long, java will do casting on its own
		System.out.println(myLong);

	}

}
