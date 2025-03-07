public class PrimitiveTypes {

	public static void main(String[] args) {
		
		int myMinIntValue = Integer.MIN_VALUE;
		System.out.println("Minimum Integer Value = " + myMinIntValue);  //Integer = wrapper class
		
		int myMaxIntValue = Integer.MAX_VALUE;
		System.out.println("Maximum Integer Value = " + myMaxIntValue);
		
		System.out.println("Integer Value Range: (" + Integer.MIN_VALUE + " to " + Integer.MAX_VALUE + ")");  //32 bits
		
		System.out.println("Busted Max Value = " + (myMaxIntValue + 1));  //overflow
		
		System.out.println("Busted Min Value = " + (myMinIntValue - 1));  //underflow
		
		System.out.println("Byte Value Range: (" + Byte.MIN_VALUE + " to " + Byte.MAX_VALUE + ")");  //8 bits
		System.out.println("Byte has a width of: " + Byte.SIZE + " bits");
		
		System.out.println("Short Value Range: (" +Short.MIN_VALUE + " to " + Short.MAX_VALUE + ")"); //16 bits
		System.out.println("Short has a width of: " + Short.SIZE + " bits");
		
		System.out.println("Integer has a width of: " + Integer.SIZE + " bits");  //32
		
		long myLongValue = 100L;   //as 100 is an int as well and it treats it as int   
		System.out.println("My long Value = " + myLongValue);    //64 bits
		System.out.println("Long has a width of: " + Long.SIZE + " bits");
		System.out.println("Long Value Range: (" + Long.MIN_VALUE + " to " + Long.MAX_VALUE + ")");

	}

}
