public class Casting {

	public static void main(String[] args) {
		
		short myMinShortValue = Short.MIN_VALUE;
		int myMinIntValue = Integer.MIN_VALUE;
		byte myMinByteValue = Byte.MIN_VALUE , myMaxByteValue = Byte.MAX_VALUE;  //same datatype then , and dont declare again the datatype
		short firstShort = 1; int firstInteger = 2;   //2 diff datatypes then ;
		
		int myTotal = (myMinIntValue/2);
		System.out.println(myTotal);
		
		//byte myNewByteValue = (myMinByteValue/2);   will show error as java doesnt know if the calculation fits in range but in int we can
		// System.out.println(myNewByteValue);
		
		//to let java know it can fit, we use casting
		
		byte myNewByteValue = (byte) (myMinByteValue/2);  //casting. Now it treats it as byte and not default integer
		System.out.println(myNewByteValue);
		
		short myNewShortValue = (short) (myMinShortValue/2);  //casting. Now it treats it as byte and not default integer
		System.out.println(myNewShortValue);
		
				

	}

}
