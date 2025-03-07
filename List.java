import java.util.ArrayList;
import java.util.Arrays;

record GrocceryItems(String name,String type,int count) {
	
	public GrocceryItems(String name) {
		this(name,"DAIRY",1);
	}
	
	@Override
	public String toString() {
		return(String.format("%d %s in %s", count,name.toUpperCase(),type));
	}
	
}

public class List {

	public static void main(String[] args) {
		
		GrocceryItems[] grocceryArray = new GrocceryItems[3];
		grocceryArray[0] = new GrocceryItems("milk");
		grocceryArray[1] = new GrocceryItems("Apples","PRODUCE",6);
		grocceryArray[2] = new GrocceryItems("Oranges","PRODUCE",5);
		System.out.println(Arrays.toString(grocceryArray));
		
		
		//ARRAYLIST - RESIZABLE ARRAYS
		//raw 
		 //array list does not know what kind of inputs it need.. therefore we need to decalre a type for arraylist
		//which is the record we declared above
		
		ArrayList<GrocceryItems> grocceryList = new ArrayList<>();
		grocceryList.add(new GrocceryItems("Butter"));
		grocceryList.add(new GrocceryItems("Fish","MEAT",8));
		//adding at specific index pos
		grocceryList.add(0,new GrocceryItems("Milk"));
		//replace an entry - set method
		System.out.println(grocceryList);
		grocceryList.set(0,new GrocceryItems("CHEESE"));
		System.out.println(grocceryList);
		//removing items
		grocceryList.remove(1);
		System.out.println(grocceryList);
		
		
		
		
	}

}
