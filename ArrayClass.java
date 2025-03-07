import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArrayClass {

	public static void main(String... args) {
		
		int[] myIntArray = new int[10];
		
		//array initializer
		int[] myArray = new int[] {1,2,3,4,5};
		
		//ANONYMOUS ARRAY
		int[] intArr = {1,2,3,4,5,6,7,8,9,10};
		int length = intArr.length;
		System.out.println("Length = " + length);
		for(int i=0;i<length;i++) {
			System.out.print(intArr[i] + " ");
		}
		System.out.println();
		
		//default set to 0
		int[] myNew = new int[5];
		for(int i=0;i<myNew.length;i++) {
			System.out.print(myNew[i] + " ");
		}
		System.out.println();
		
		//for each loop
		int c = 0;
		for(int x: intArr) {
			c++;
			if(c==10) {
				System.out.print(x);
			}else {
				System.out.print(x + " , ");
			}
		}
		System.out.println();
		
		//toString for array
		System.out.println(Arrays.toString(intArr));
		
		//PASSING ARRAYS TO OBJECTS
		Object objectVaraible = intArr;
		if(objectVaraible instanceof int[]) {
			System.out.println("intArr is an instance of int array");
		}
		
		//ARRAY OF OBJECTS
		Object[] objectArray = new Object[3];
		objectArray[0] = "Hello";
		objectArray[1] = new StringBuilder("World");
		objectArray[2] = intArr;
		System.out.println("ELEMENTS:");
		for(int i=0;i<3;i++) {
			System.out.println(objectArray[i]);
		}
		
		//RANDOM ARRAY
		int[] myRandomArray = getRandomArray(10);
		System.out.println(Arrays.toString(myRandomArray));
		
		//SORT ARRAY
		Arrays.sort(myRandomArray);
		System.out.println(Arrays.toString(myRandomArray));
		
		//FILL ARRAYS
		int[]myFilledArray = new int[10];
		System.out.println(Arrays.toString(myFilledArray));
		Arrays.fill(myFilledArray, 1);
		System.out.println(Arrays.toString(myFilledArray));
		
		//COPY ARRAY - not a reference to original array
		int[] firstArray = getRandomArray(10);
		System.out.println(Arrays.toString(firstArray));
		int[] secondArray = Arrays.copyOf(firstArray, firstArray.length);
		System.out.println(Arrays.toString(secondArray));
		
		//COPY A PART OF ARRAY
		int[] thirdArray = getRandomArray(10);
		System.out.println("PARENT ARRAY : " + Arrays.toString(thirdArray));
		int[] forthArray = Arrays.copyOf(thirdArray, 5);
		System.out.println("CHILD ARRAY: " + Arrays.toString(forthArray));
		
		//IF WE GIVE MORE SIZE THAN IS PRESENT - REST TO 0
		int[] fifthArray = getRandomArray(10);
		System.out.println("PARENT ARRAY : " + Arrays.toString(fifthArray));
		int[] sixthArray = Arrays.copyOf(fifthArray, 15);
		System.out.println("CHILD ARRAY: " + Arrays.toString(sixthArray));
		
		//BINARY SEARCH
		//WORKS ONLY WITH SORTED ARRAYS
		String[] nameArray = {"Aadi","Nael","Asher","Sohith","Stephen","Ishika","Sisira"};
		Arrays.sort(nameArray);
		System.out.println("Array : " + Arrays.toString(nameArray));
		if(Arrays.binarySearch(nameArray, "Ishika") >= 0) {
			System.out.println("Ishika found int the array");
		}else {
			System.out.println("Ishika not found in the array");
		}
		
		//COMPARING ARRAYS
		int[]s1 = {1,2,3,4};
		int[]s2 = {1,2,3,4};
		if(Arrays.equals(s1, s2)) {
			System.out.println("Arrays are equal");
		}else {
			System.out.println("Arrays are not equal");
		}
		
		//ARRAYS CHALLENGE
		System.out.println();
		System.out.println("Given array: ");
		int[]descArray = getRandomArray(10);
		System.out.println(Arrays.toString(descArray));
		for(int i=0;i<descArray.length-1;i++) {
			for(int j=0;j<descArray.length-i-1;j++) {
				if(descArray[j] < descArray[j+1]) {
					int temp = descArray[j];
					descArray[j] = descArray[j+1];
					descArray[j+1] = temp;
				}
			}
		}
		System.out.println("Array in descending order: ");
		System.out.println(Arrays.toString(descArray));
		
		//METHOD 2
		System.out.println();
		System.out.println("Given array: ");
		int[]descArr = getRandomArray(10);
		System.out.println(Arrays.toString(descArr));
		System.out.println("Array in descending order: ");
		descArr = sortArray(descArr);
		System.out.println(Arrays.toString(descArray));
		
		//SPLIT STRING TO ARRAY   AND    VARIABLE ARGUMENT ...
		System.out.print("Enter a sentence: ");
		Scanner scanner = new Scanner(System.in);
		String myStringToSplit = scanner.nextLine();
		String[] splittedString = myStringToSplit.split(" ");
		printText(splittedString);
		
		//VARIABLE ARGUMENT LETS US USE THE SAME FUNCTION WITHOUT OVERLOADING AND HAVING DOFFERENT NUMBER OF ARGUMENTS
		System.out.println("_".repeat(20));
		printText("Hello");
		
		System.out.println("_".repeat(20));
		printText("Hello","World","Again");
		
		System.out.println("_".repeat(20));
		printText();
		//THE ABOVE ARGUMENTS WOULD OTHERWISE SHOW ERROR AS THE FUNCTION DOES NOT EXIST FOR THESE PARAMETER INPUTS
		
		//JOIN FUNCTION ON ARRAY OF STRINGS
		String[] sArray = {"first","second","third","forth","fifth"};
		System.out.println(String.join(",",sArray));
		
		//ARRAYS CHALLENGE
		int[] readIntegerArr = readIntegers();
		for(int n:readIntegerArr) {
			System.out.print(n + " ");
		}
		System.out.println("\nMIN ELEMENT : " + minEle(readIntegerArr));
		
		//REVERSE ARRAY
		System.out.print("Enter size of array: ");
		int s = scanner.nextInt();
		int[] arr100 = new int[s];
		for(int i=0;i<s;i++) {
			System.out.print("Enter element " + (i+1) + ": ");
			int x = scanner.nextInt();
			arr100[i] = x;
		}
		System.out.print("BEFORE REVERSING:");
		System.out.println(Arrays.toString(arr100));
		reverse(arr100);
		System.out.print("AFTER REVERSING:");
		System.out.println(Arrays.toString(arr100));
		
		//2D Arrays
		int[][] array2 = new int[4][4];
		System.out.println(Arrays.toString(array2));
		System.out.println("Length = " + array2.length);
		for(int[] outer:array2) {
			System.out.println(Arrays.toString(outer));
		}
		
		for(int i=0;i<array2.length;i++) {
			var innerArray = array2[i];
			for(int j=0;j<innerArray.length;j++) {
				array2[i][j] = (i*10) + (j*10+10);
			}
		}
		
		for(int i=0;i<array2.length;i++) {
			var innerArray = array2[i];
			for(int j=0;j<innerArray.length;j++) {
				System.out.print(array2[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("USING FOR EACH LOOP");
		for(var outer: array2) {
			for(var element: outer) {
				System.out.print(element + " ");
			}
			System.out.println();
		}
		
		//DEEP TO STRING
		System.out.println("DEEP TO STRING: ");
		System.out.println(Arrays.deepToString(array2));
		
		//MULTI DIMENSIONAL ARRAYS 
		//this works  -  the elements need not have same number of elements
		array2[1] = new int[] {10,20,30};
		System.out.println(Arrays.deepToString(array2));
		
		Object[] anyArray = new Object[3];
		System.out.println(Arrays.toString(anyArray));
		anyArray[0] = new String[]{"a","b","c"};
		System.out.println(Arrays.deepToString(anyArray));
		
		anyArray[1] = new String[][] {
			{"1","2"},
			{"3","4","5"},
			{"6","7","8","9"}
		};
		System.out.println(Arrays.deepToString(anyArray));
		
		anyArray[2] = new int[2][2][2];
		System.out.println(Arrays.deepToString(anyArray));
		
		for(Object element: anyArray) {
			System.out.println("Element type = " + element.getClass().getSimpleName());
			System.out.println("Element to string = " + element);
			System.out.println(Arrays.deepToString((Object[]) element)); //for java compiler to know it is an array by casting to object[]
		}
		
	}
	
	public static int[] getRandomArray(int len) {
		Random random = new Random();
		int[] newInt = new int[len];
		for(int i=0;i<len;i++) {
			newInt[i] = random.nextInt(100);
		}
		return(newInt);
	}
	
	public static int[] sortArray(int[]descArr) {
		int[] mydescending = Arrays.copyOf(descArr, descArr.length);
		boolean flag = true;
		int temp;
		while(flag) {
			flag = false;
			for(int i=0;i<descArr.length-1;i++) {
				if(mydescending[i]<mydescending[i+1]) {
					temp = mydescending[i];
					mydescending[i] = mydescending[i+1];
					mydescending[i+1] = temp;
					flag = true;
				}
			}
		}
		return mydescending;
	}
	
	private static void printText(String... textList) {
		for(String t:textList) {
			System.out.println(t);
		}
	}
	
	public static int[] readIntegers() {
		System.out.println();
		System.out.print("Enter comma separated integers: ");
		Scanner scanner = new Scanner(System.in);
		String myInput = scanner.nextLine();
		String[] intArray = myInput.split(",");
		int[] values = new int[intArray.length];
		for(int i=0;i<intArray.length;i++) {
			values[i] = Integer.parseInt(intArray[i].trim());
		}
		return values;
	}
	
	public static int minEle(int[]myArr) {
		int min = Integer.MAX_VALUE;
		for(int num:myArr) {
			if(num < min) {
				min = num;
			}
		}
		return min;
	}
	
	public static void reverse(int[] myArr) {
		int maxIndex = myArr.length - 1;
		int halfLength = myArr.length/2;
		for(int i=0;i<halfLength;i++) {
			int temp = myArr[i];
			myArr[i] = myArr[maxIndex-i];
			myArr[maxIndex-i] = temp;
		}
		
	}

}
