public class FloatAndDoublePrimitives {

	public static void main(String[] args) {
		
		System.out.println("Range of float Value is: (" + Float.MIN_VALUE + " to " + Float.MAX_VALUE + ")");
		System.out.println("Size of float value: " + Float.SIZE + " bits");
		
		System.out.println("Range of double Value is: (" + Double.MIN_VALUE + " to " + Double.MAX_VALUE + ")");
		System.out.println("Size of double value: " + Double.SIZE + " bits");
		
		double myDouble = 5.25d;
		System.out.println(myDouble);
		
		float myFloat = 5.25f;   //Since double is the default type, we have to cast it either by writing (float) or adding f to end
		System.out.println(myFloat);

	}

}
