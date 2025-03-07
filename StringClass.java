public class StringClass {

	public static void main(String[] args) {
		
		//STRING FORMATING
		
		String bulletIt = "Print a Bulleted list:\n"+
				"\t\u2022 First Point\n" +
				"\t\t\u2022 Second Point";
		System.out.println(bulletIt);
		
		//textblock - multiline text block string
		
		String textBlock = """
				Print a bulleted list:
					\u2022 First Point
						\u2022 Second Point""";
				
		System.out.println(textBlock);	
		
		int age = 35;
		System.out.printf("Your age is %d\n", age);
		//precision
		System.out.printf("You have $%.2f\n", (float)age);
		
		//width of the number - each no should occupy 6 places and becomes right aligned
		for(int i=1;i<=100000;i*=10) {
			System.out.printf("Printing :%6d %n",i);
		}
		
		//format keyword
		String formattedString = String.format("Your age is %d", age);
		System.out.println(formattedString);
		
		formattedString = "Your age is %d".formatted(age);
		System.out.println(formattedString);
		
		//STRING INSPECTION METHODS
		
		String myString = "Hello World";
		
		//length
		int size = myString.length();
		System.out.println("LENGTH = "  + size);
		
		//charAt
		char c = myString.charAt(6);
		System.out.println("CHAR at Index 6 = "  + c);
		
		//indexOf
		int i = myString.indexOf('l');
		System.out.println("INDEX of l = "  + i);
		
		i = myString.indexOf("World");
		System.out.println("INDEX of World = "  + i);  //returns -1 if does not exists
		
		//lastIndexOf
		i = myString.indexOf('l');
		System.out.println("INDEX of l = "  + i);
		i = myString.lastIndexOf('l');
		System.out.println("LAST INDEX of l = "  + i);
		//second parameter
		i = myString.indexOf('l',3);  
		System.out.println("INDEX of l (index 4)= "  + i);  //starts searching from index 3
		i = myString.lastIndexOf('l',8);                    //searches till index 8
		System.out.println("LAST INDEX of l (index 4)= "  + i);
		
		//isEmpty
		boolean hasSome = myString.isEmpty();
		System.out.println("is empty? = "  + hasSome);
		
		String mineString = "   ";
		//isBlank
		boolean blank = mineString.isBlank();
		System.out.println("is blank? = "  + blank);
		
		//STRING COMPARISON METHODS
		
		String helloWorld = "Hello World";
		String helloWorldLower = helloWorld.toLowerCase();
		if(helloWorldLower.equals(helloWorld)) {
			System.out.println("Values matches exactly");
		}else {
			System.out.println("Values does not match exactly");
		}
		if(helloWorldLower.equalsIgnoreCase(helloWorld)) {
			System.out.println("Values matches (ignoring case)");
		}else {
			System.out.println("Values does not match exactly (ignoring case)");
		}
		
		if(helloWorld.startsWith("Hello")) {
			System.out.println("Starts with Hello");
		}
		if(helloWorld.endsWith("World")) {
			System.out.println("Ends with World");
		}
		if(helloWorld.contains("World")) {
			System.out.println("helloWorld contains World");
		}
		if(helloWorld.contentEquals("Hello World")) {
			System.out.println("Values match exactly");
		}
		
		//STRING MANIPULATION METHODS
		
		//SUBSTRING
		String birthDate = "10/07/2006";
		int StartingIndex = birthDate.indexOf("2006");
		System.out.println("Starting index = " + StartingIndex);
		System.out.println("Birth Year = " + birthDate.substring(StartingIndex));
		
		//SUBSTRING WITH ENDING INDEX
		int monthIndex = birthDate.indexOf("07");
		System.out.println("Starting index of month = " + monthIndex);
		System.out.println("Birth month = " + birthDate.substring(monthIndex,(monthIndex+2)));
		//OR
		System.out.println("Month = " + birthDate.substring(3,5));
		
		//JOIN
		String newDate = String.join("/","10","07","2006");
		System.out.println(newDate);
		
		//CONCAT
		newDate = "10";
		newDate.concat("/");
		newDate.concat("07");
		newDate.concat("/");
		newDate.concat("2006");
		System.out.println(newDate);
		
		newDate = "10".concat("/").concat("07").concat("/").concat("2006");
		System.out.println(newDate);
		
		//REPLACE
		System.out.println(newDate.replace('/', '-'));
		//CAN ALSO REPLACE STRINGS
		System.out.println(newDate.replace("2", "00"));
		
		//REPLACE FIRST
		System.out.println(newDate.replaceFirst("/", "--")); //only takes strings
		
		//REPLACE ALL
		System.out.println(newDate.replaceAll("/", "---"));
		
		//REPEAT
		System.out.println("-".repeat(20));
		System.out.println("ABC\n".repeat(3));
		System.out.println("-".repeat(20));
		
		//INDENT
		System.out.println("-".repeat(20));
		System.out.println("ABC\n".repeat(3).indent(8));
		System.out.print("-".repeat(20));
		
		//INDENT TO REMOVE LEADING SPACES
		System.out.println("-".repeat(20));
		System.out.println("    ABC\n".repeat(3).indent(-2));
		System.out.println("-".repeat(20));
		
		//STRING IS IMMUTABLE
		//STRING BUILDER CLASS - PROVIDES A WAY TO MUTATE STRINGS
		
		String HelloWorld = "Hello" + " World";
		HelloWorld.concat(" and Welcome");
		
		StringBuilder helloWorldBuilder = new StringBuilder("Hello" + " World");
		helloWorldBuilder.append(" and Welcome");
		
		printInformation(HelloWorld);
		printInformation(helloWorldBuilder);
		
		StringBuilder emptyString = new StringBuilder();
		emptyString.append("a".repeat(17));
		StringBuilder emptyString32 = new StringBuilder(32);
		emptyString32.append("a".repeat(17));
		
		printInformation(emptyString);
		printInformation(emptyString32);
		
		//BUILDER CLASS METHODS
		//DELETE CHAR AT AND INSERT
		StringBuilder BuilderPlus = new StringBuilder("Hello" + " World");
		BuilderPlus.append(" and Welcome");
		BuilderPlus.deleteCharAt(16).insert(16,'G');
		System.out.println(BuilderPlus);
		
		//REPLACE
		BuilderPlus.replace(16, 17, "w");
		System.out.println(BuilderPlus);
		
		//REVERSE
		BuilderPlus.reverse();
		System.out.println(BuilderPlus);
		
		//SET LENGTH
		BuilderPlus.reverse();
		BuilderPlus.setLength(11);
		System.out.println(BuilderPlus);
	}
	
	public static void printInformation(String string) {
		System.out.println(string);
		System.out.println(string.length());
	}
	
	public static void printInformation(StringBuilder builder) {
		System.out.println("String = " + builder);
		System.out.println("Length = " + builder.length());
		System.out.println("Capacity: " + builder.capacity());
	}
	

}
