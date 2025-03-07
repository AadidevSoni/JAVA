public class OOPMasterChallenge {

	public static void main(String[] args) {
		
		//FoodItems coke = new FoodItems("drink","coke",1.50);
		//coke.printItem();
		//coke.setSize("LARGE");
		//coke.printItem();
		
		//FoodItems avocado = new FoodItems("Topping","Avocado",1.50);
		//avocado.printItem();
		
		//Burger burger = new Burger("Regular",4.00);
		//burger.addToppings("BACON","CHEESE","MAYO");
		//burger.printItem();
		
		System.out.println();
		System.out.println("FIRST ORDER");
		System.out.println();
		
		MealOrder regularMeal = new MealOrder();
		regularMeal.addBurgerToppings("BACON", "CHEESE", "MAYO");
		regularMeal.setDrinkSize("LARGE");
		regularMeal.printItemizedList();
		
		System.out.println();
		System.out.println("SECOND ORDER");
		System.out.println();
		
		MealOrder secondMeal = new MealOrder("turkey", "7-up",
                "chili");
        secondMeal.addBurgerToppings("LETTUCE", "CHEESE", "MAYO");
        secondMeal.setDrinkSize("SMALL");
        secondMeal.printItemizedList();
		

	}

}

class FoodItems {
	
	private String type;
	private String name;
	private double price;
	private String size = "MEDIUM";
	
	
	public FoodItems(String type, String name, double price) {
		this.type = type.toUpperCase();
		this.name = name.toUpperCase();
		this.price = price;
	}
	
	
	
	public String getName() {
		
		if(type.equals("SIDE") || type.equals("DRINK")) {
			return(size + " " + name);
		}
		return name;
	}

	public double getBasePrice() {
		return price;
	}
	
	public double getAdjustedPrice() {
		return switch(size) {
		case "SMALL" -> getBasePrice() - 0.5;
		case "LARGE" -> getBasePrice() + 1;
		default -> getBasePrice();
		};
	}
	
	public void setSize(String size) {
		this.size = size;
	}

	public static void printItem(String name,double price) {
		System.out.printf("%20s:%6.2f%n", name, price);
	}
	
	public void printItem() {
		printItem(getName(),getAdjustedPrice());
	}
	

}

class Burger extends FoodItems{
	
	private FoodItems extra1;
	private FoodItems extra2;
	private FoodItems extra3;
	
	public Burger(String name, double price) {
		super("Burger",name,price);
	}
	
	public void addToppings() {
		
	}

	@Override
	public String getName() {
		return super.getName() + " BURGER";
	}

	@Override
	public double getAdjustedPrice() {
		return getBasePrice() + ((extra1 == null)?0:extra1.getAdjustedPrice()) + ((extra2 == null)?0:extra2.getAdjustedPrice()) + ((extra3 == null)?0:extra3.getAdjustedPrice());
	}
	
	public double getExtraPrice(String toppingName) {
		return switch(toppingName.toUpperCase()) {
			case "AVOCADO","CHEESE" -> 1.0;
			case "BACON","HAM","SALAMI" -> 1.5;
			default -> 0.0;
		};
	}
	
	public void addToppings(String extra1,String extra2,String extra3) {
		this.extra1 = new FoodItems("TOPPING",extra1,getExtraPrice(extra1));
		this.extra2 = new FoodItems("TOPPING",extra2,getExtraPrice(extra2));
		this.extra3 = new FoodItems("TOPPING",extra3,getExtraPrice(extra3));
	}
	
	public void printItemizedList() {
		printItem("BASE BURGER",getBasePrice());
		if(extra1 != null) {
			extra1.printItem();
		}
		if(extra2 != null) {
			extra2.printItem();
		}
		if(extra3 != null) {
			extra3.printItem();
		}
	}
	
	@Override
	public void printItem() {
		System.out.println("-".repeat(30));
		printItemizedList();
		System.out.println("-".repeat(30));
		super.printItem();
		System.out.println("-".repeat(30));
	}
	
	
}

class MealOrder{
	
	private Burger burger;
	private FoodItems drink;
	private FoodItems sideItem;
	
	public MealOrder() {
		this("regular","coke","fries");
	}
	
	public MealOrder(String burgerType, String drinkType, String sideItemType) {
		if(burgerType.equalsIgnoreCase("deluxe")) {
			this.burger = new DeluxeBurger(burgerType,8.5);
		}else {
			this.burger = new Burger(burgerType,4.0);
		}
		this.drink = new FoodItems("drink",drinkType,1.00);
		this.sideItem = new FoodItems("side",sideItemType,1.50);
	}
	
	public double getTotalPrice() {
		if(burger instanceof DeluxeBurger) {  //if its deluxe burger we dont charge for fries and drinks
			return burger.getAdjustedPrice();
		}
		return sideItem.getAdjustedPrice() + burger.getAdjustedPrice() + drink.getAdjustedPrice();
	}
	
	public void printItemizedList() {
		burger.printItem();
		System.out.println("-".repeat(30));
		FoodItems.printItem("TOTAL PRICE",getTotalPrice());
	}
	
	public void addBurgerToppings(String extra1,String extra2,String extra3) {
		burger.addToppings(extra1,extra2,extra3);
	}
	
	public void setDrinkSize(String size) {
		drink.setSize(size);
	}
	
}

class Packages {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class DeluxeBurger extends Burger{
	
	FoodItems deluxe1;
	FoodItems deluxe2;
	public DeluxeBurger(String name, double price) {
		super(name, price);
	}
	
	public void addToppings(String extra1, String extra2, String extra3,String extra4,String extra5) {
		// TODO Auto-generated method stub
		super.addToppings(extra1, extra2, extra3);
		deluxe1 = new FoodItems("TOPPING",extra4,0);
		deluxe2 = new FoodItems("TOPPING",extra5,0);
	}
	@Override
	public void printItemizedList() {
		// TODO Auto-generated method stub
		super.printItemizedList();
		if(deluxe1 != null) {
			deluxe1.printItem();
		}
		if(deluxe2 != null) {
			deluxe2.printItem();
		}
		
	}

	@Override
	public double getExtraPrice(String toppingName) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
	
	
	

}
