import java.util.Scanner;

public class OOPS2 {

	public static void main(String[] args) {
		
		//COMPOSITION
		//PERSONAL COMPUTER IN ADDITION TO BEING A PRODUCT IS MADE UP OF OTHER PRODUCTS
		
		ComputerCase theCase = new ComputerCase("2208","Dell","240");
		Monitor theMonitor = new Monitor("27inch Beast","Acer",27,"3400x4800");
		Motherboard theMotherBoard = new Motherboard("BJ-200","Asus",4,6,"v2.44");
		
		PersonalComputer thePC = new PersonalComputer("2208","Dell",theCase,theMonitor,theMotherBoard);
		//CALLING ALL FUNCTIONALITIES BY GETTER METHODS
		//thePC.getMonitor().drawPixelAt(10,10,"Red");
		//thePC.getMotherBoard().loadProgram("MacOS");
		//thePC.getComputerCase().pressPowerButton();
		
		//WHAT IF WE DONT WANT USER TO GIVE ACCESS TO EACH COMPONENTS... WE COMMENT OUT GETTER METHODS
		thePC.powerUp();
		
		//COMPOSITION CHALLENGE
		SmartKitchen kitchen = new SmartKitchen();
		kitchen.getBrewMaster().setHasWorToDo(true);
		kitchen.getDishWasher().setHasWorToDo(true);
		kitchen.getIceBox().setHasWorToDo(true);
		kitchen.getBrewMaster().brewCoffee();
		kitchen.getDishWasher().doDishes();
		kitchen.getIceBox().orderFood();
		
		kitchen.setKitchenState(true, true, false);
		kitchen.doKitchenWork();
		
		//CHALLENGE - 2
		
		Wall wall1 = new Wall("West");
		Wall wall2 = new Wall("East");
		Wall wall3 = new Wall("South");
		Wall wall4 = new Wall("North");
		 
		Ceiling ceiling = new Ceiling(12, 55);
		 
		Bed bed = new Bed("Modern", 4, 3, 2, 1);
		 
		Lamp lamp = new Lamp("Classic", false, 75);
		 
		Bedroom bedRoom = new Bedroom("YOUR NAME HERE", wall1, wall2, wall3, wall4, ceiling,bed, lamp);
		bedRoom.makeBed();
		 
		bedRoom.getLamp().turnOn();
		
		//ENCAPSULATION
		//hiding things by making them private or inaccessible
		//CODE IS MUCH MORE SAFE AS IT WONT GIVE THE USER THAT MUCH CONTROL 
		Player player1 = new Player("BatMan");
		
		int damage = 10;
		player1.loseHealth(damage);
		System.out.println("\n");
		System.out.println(player1.toString());
		System.out.println("Remaining health = " + player1.healthRemaining());
		
		//ENCAPSULATION CHALLENGE
		
		Printer printer = new Printer(50, true);
		System.out.println(printer.addToner(50));
		System.out.println("initial page count = " +printer.getPagesPrinted());
		int pagesPrinted = printer.printPages(4);
		System.out.println("Pages printed was " + pagesPrinted +" new total print count for printer = " +printer.getPagesPrinted());
		pagesPrinted = printer.printPages(2);
		System.out.println("Pages printed was " + pagesPrinted +" new total print count for printer = " +printer.getPagesPrinted());
		
		//POLYMORPHISM
		//THE METHOD THAT HAS SAME NAME IS RUN DIFFERENTYL FOR DIFFERENT OBJECTS
		
		Movie myMovie = new Comedy("Charlie Chaplin");  //directly creating a new comedy class from movie class
		myMovie.watchMovie();  
		
		//Creating a adventure type movie inside movie class
		Movie theMovie = Movie.getMovie("Adventure", "Star Wars");  //ADVENTURE IS A MOVIE (SUBCLASS)
	    theMovie.watchMovie();
	    
	    Scanner s = new Scanner(System.in);
	    while(true) {
	    	System.out.println("Enter movie type(A-Adventure, C-Comedy, S-Science Fiction,Q-Quit): ");
			String type = s.nextLine();
			if("Qq".contains(type)) {
				break;
			}
			System.out.println("Enter movie title: ");
			String title = s.nextLine();
			Movie movie = Movie.getMovie(type, title);
			movie.watchMovie();  //the watch movie inside the objects get executed eventhough the main has no idea about these classes
	    }
		
	    //this works
	    Movie movie = Movie.getMovie("A", "Jaws");
		movie.watchMovie();
		
		//this does not work as the compiler just knows Movie.getMovie() returns a movie but not an adventure
		//Adventure jaws = Movie.getMovie("A", "Jaws");
		
		//hence we use casting
		Adventure jaws = (Adventure)Movie.getMovie("A", "Jaws");
		jaws.watchMovie();
		
		//this also does not run as we didnt assign what class mask belongs to 
		Object mask = Movie.getMovie("C", "Mask");
		Comedy comedyMovie = (Comedy)mask;
		comedyMovie.watchMovie();  //this works
		comedyMovie.watchComedy(); //this does not work if it was Movie comedyMovie = (Movie)mask;
		
		var airplane = Movie.getMovie("C", "Airplane");
		airplane.watchMovie();
		
		var plane = new Comedy("Plane");
		plane.watchComedy();
		
		Object unknownObject = Movie.getMovie("C", "Apple");
		if(unknownObject.getClass().getSimpleName() == "Comedy") {
			Comedy c = (Comedy)unknownObject;
			c.watchComedy();
		}else if(unknownObject instanceof Adventure) {
			((Adventure) unknownObject).watchAdventure();
		}else if(unknownObject instanceof ScienceFiction scfi) {
			scfi.watchScienceFiction();   //if it can identify it is an instance of the class, we can use any method in the class without casting it
		}
		
		//POLYMORPHISM CHALLENGE-1
		
		Cars car = new Cars(8, "Base car");
		System.out.println(car.startEngine());
		System.out.println(car.accelerate());
		System.out.println(car.brake());
		 
		Mitsubishi mitsubishi = new Mitsubishi(6, "Outlander VRX 4WD");
		System.out.println(mitsubishi.startEngine());
		System.out.println(mitsubishi.accelerate());
		System.out.println(mitsubishi.brake());
		 
		Ford ford = new Ford(6, "Ford Falcon");
		System.out.println(ford.startEngine());
		System.out.println(ford.accelerate());
		System.out.println(ford.brake());
		 
		Holden holden = new Holden(6, "Holden Commodore");
		System.out.println(holden.startEngine());
		System.out.println(holden.accelerate());
		System.out.println(holden.brake());
		
		//POLYMORPHISM ALSO WORKS ON METHODS CALLED FROM OTHER METHODS
		
		startRace(car);
		startRace(ford);
		
		
	}
	
	public static void startRace(Cars car) {
		car.drive();
	}

}

class Product {
	
	//all its subclasses need not have all the features of product but can contain some of them
	private String model;
	private String manufacturer;
	private int width;
	private int height;
	private int depth;
	
	public Product(String model,String manufacturer) {
		this.model = model;
		this.manufacturer = manufacturer;
	}

}

class Monitor extends Product{
	
	private int size;
	private String resolution;
	
	public Monitor(String model,String manufacturer) {
		super(model,manufacturer);
	}

	public Monitor(String model, String manufacturer, int size, String resolution) {
		super(model, manufacturer);
		this.size = size;
		this.resolution = resolution;
	}
	
	public void drawPixelAt(int x,int y,String color) {
		System.out.println(String.format("Drawing pixel at %d,%d in color %s",x,y,color));
	}
	
}

class Motherboard extends Product{
	
	private int ramSlots;
	private int cardSlots;
	private String bios;
	
	public Motherboard(String model,String manufacturer) {
		super(model,manufacturer);
	}

	public Motherboard(String model, String manufacturer, int ramSlots, int cardSlots, String bios) {
		super(model, manufacturer);
		this.ramSlots = ramSlots;
		this.cardSlots = cardSlots;
		this.bios = bios;
	}
	
	public void loadProgram(String programName) {
		System.out.println("Program " + programName + " is now loading");
	}
	
}

class ComputerCase extends Product{
	
	private String powerSupply;
	
	public ComputerCase(String model,String manufacturer) {
		super(model,manufacturer);
	}

	public ComputerCase(String model, String manufacturer, String powerSupply) {
		super(model, manufacturer);
		this.powerSupply = powerSupply;
	}
	
	public void pressPowerButton() {
		System.out.println("Power button pressed");
	}
	
}

class PersonalComputer extends Product{
	
	//Composition
	//contains 3 other classes that are also sub classes pr Product class
	private ComputerCase computerCase;
	private Monitor monitor;
	private Motherboard motherBoard;
	public PersonalComputer(String model, String manufacturer, ComputerCase computerCase, Monitor monitor,
			Motherboard motherBoard) {
		super(model, manufacturer);
		this.computerCase = computerCase;
		this.monitor = monitor;
		this.motherBoard = motherBoard;
	}
	
	//public ComputerCase getComputerCase() {
	//	return computerCase;
	//}
	//public Monitor getMonitor() {
	//	return monitor;
	//}
	//public Motherboard getMotherBoard() {
	//	return motherBoard;
	//}
	
	
	private void drawLogo() {
		monitor.drawPixelAt(1200, 50, "RED");
	}
	
	public void powerUp() {
		computerCase.pressPowerButton();
		drawLogo();
	}
	
}

class SmartKitchen {
	
	private Refrigerator iceBox;
	private DishWasher dishWasher;
	private CoffeeMaker brewMaster;
	
	
	
	public SmartKitchen() {
		brewMaster = new CoffeeMaker();
		dishWasher = new DishWasher();
		iceBox = new Refrigerator();
	}



	public Refrigerator getIceBox() {
		return iceBox;
	}

	public DishWasher getDishWasher() {
		return dishWasher;
	}
	
	public CoffeeMaker getBrewMaster() {
		return brewMaster;
	}
	
	public void setKitchenState(boolean coffeeFlag,boolean fridgeFlag,boolean dishWasherFlag) {
		brewMaster.setHasWorToDo(coffeeFlag);
		dishWasher.setHasWorToDo(dishWasherFlag);
		iceBox.setHasWorToDo(fridgeFlag);
	}
	
	public void doKitchenWork() {
		brewMaster.brewCoffee();
		dishWasher.doDishes();
		iceBox.orderFood();
	}
	
}

class Refrigerator{
	boolean hasWorkToDo;
	
	public void setHasWorToDo(boolean hasWorkToDo) {
		this.hasWorkToDo = hasWorkToDo;
	}
	
	public void orderFood() {
		if(hasWorkToDo) {
			System.out.println("Ordering food");
			hasWorkToDo = false;
		}
	}
}

class DishWasher{
	boolean hasWorkToDo;
	
	public void setHasWorToDo(boolean hasWorkToDo) {
		this.hasWorkToDo = hasWorkToDo;
	}
	
	public void doDishes() {
		if(hasWorkToDo) {
			System.out.println("Doing dishes");
			hasWorkToDo = false;
		}
	}
}

class CoffeeMaker{
	boolean hasWorkToDo;
	
	public void setHasWorToDo(boolean hasWorkToDo) {
		this.hasWorkToDo = hasWorkToDo;
	}
	
	public void brewCoffee() {
		if(hasWorkToDo) {
			System.out.println("Brewing coffee");
			hasWorkToDo = false;
		}
	}
}

class Bedroom {
	
	private String name;
    private Wall wall1;
    private Wall wall2;
    private Wall wall3;
    private Wall wall4;
    private Ceiling ceiling;
    private Bed bed;
    private Lamp lamp;
 
    public Bedroom(String name, Wall wall1, Wall wall2, Wall wall3, Wall wall4, Ceiling ceiling, Bed bed, Lamp lamp) {
        this.name = name;
        this.wall1 = wall1;
        this.wall2 = wall2;
        this.wall3 = wall3;
        this.wall4 = wall4;
        this.ceiling = ceiling;
        this.bed = bed;
        this.lamp = lamp;
    }
 
    public Lamp getLamp() {
        return lamp;
    }
 
    public void makeBed() {
        System.out.print("Bedroom -> Making bed | ");
        bed.make();
    }

}

class Wall {
    
    private String direction;
 
    public Wall(String direction) {
        this.direction = direction;
    }
 
    public String getDirection() {
        return direction;
    }
}


class Ceiling {
    
    private int height;
    private int paintedColor;
 
    public Ceiling(int height, int paintedColor) {
        this.height = height;
        this.paintedColor = paintedColor;
    }
 
    public int getHeight() {
        return height;
    }
 
    public int getPaintedColor() {
        return paintedColor;
    }
}


class Bed {
    
    private String style;
    private int pillows;
    private int height;
    private int sheets;
    private int quilt;
 
    public Bed(String style, int pillows, int height, int sheets, int quilt) {
        this.style = style;
        this.pillows = pillows;
        this.height = height;
        this.sheets = sheets;
        this.quilt = quilt;
    }
 
    public void make() {
        System.out.print("Bed -> Making | ");
    }
 
    public String getStyle() {
        return style;
    }
 
    public int getPillows() {
        return pillows;
    }
 
    public int getHeight() {
        return height;
    }
 
    public int getSheets() {
        return sheets;
    }
 
    public int getQuilt() {
        return quilt;
    }
}


class Lamp {
    
    private String style;
    private boolean battery;
    private int globRating;
 
    public Lamp(String style, boolean battery, int globRating) {
        this.style = style;
        this.battery = battery;
        this.globRating = globRating;
    }
 
    public void turnOn() {
        System.out.print("Lamp -> Turning on");
    }
 
    public String getStyle() {
        return style;
    }
 
    public boolean isBattery() {
        return battery;
    }
 
    public int getGlobRating() {
        return globRating;
    }
}

class Player {

	private String name;
	private int healthPercentage;
	private String weapon;
	
	public Player(String name) {
		this(name,100,"Sword");
	}
	
	public Player(String name, int health, String weapon) {
		super();
		this.name = name;
		if(health<=0) {
			this.healthPercentage = 1;
		}else if(health >100) {
			this.healthPercentage = 100;
		}else {
			this.healthPercentage = health;
		}
		this.weapon = weapon;
	}

	public void loseHealth(int damage) {
		healthPercentage -= damage;
		if(healthPercentage<=0) {
			System.out.println("AGME OVER");
		}
	}
	
	public int healthRemaining() {
		return healthPercentage;
	}
	
	public void restoreHealth(int extraHealth) {
		healthPercentage += extraHealth;
		if(healthPercentage>=100) {
			System.out.println("MAX HEALTH REACHED");
			healthPercentage = 100;
		}
	}

	@Override
	public String toString() {
		return "Player [name=" + name + ", health=" + healthPercentage + ", weapon=" + weapon + "]";
	}
	
	
	
}

class Printer {
    
  private int tonerLevel;
  private int pagesPrinted;
  private boolean duplex;

  public Printer(int tonerLevel, boolean duplex) {
      if (tonerLevel > -1 && tonerLevel <= 100) {
          this.tonerLevel = tonerLevel;
      } else {
          this.tonerLevel = -1;
      }
      this.duplex = duplex;
      this.pagesPrinted = 0;
  }

  public int addToner(int tonerAmount) {
      
      if (tonerAmount > 0 && tonerAmount <= 100) {
          if (this.tonerLevel + tonerAmount > 100) {
              return -1;
          }
          this.tonerLevel += tonerAmount;
          return this.tonerLevel;
      } else {
          return -1;
      }
  }

  public int printPages(int pages) {
      
      int pagesToPrint = pages;
      if (this.duplex) {
          pagesToPrint = (pages / 2) + (pages % 2);
          System.out.println("Printing in duplex mode");
      }
      this.pagesPrinted += pagesToPrint;
      return pagesToPrint;
  }

  public int getPagesPrinted() {
      return pagesPrinted;
  }
}

class Movie {

  private String title;

  public Movie(String title) {
      this.title = title;
  }

  public void watchMovie() {

      String instanceType = this.getClass().getSimpleName();  //this returns the name of the class
      System.out.println(title + " is a " + instanceType + " film");
  }
  
  public static Movie getMovie(String type,String title) {
    return switch(type.toUpperCase().charAt(0)) {
      case 'A' -> new Adventure(title);
      case 'C' -> new Comedy(title);
      case 'S' -> new ScienceFiction(title);
      default -> new Movie(title);
    };
  }
  
  
  
}

class Adventure extends Movie {

  public Adventure(String title) {
      super(title);
  }

  @Override
  public void watchMovie() {
      super.watchMovie();
      System.out.printf(".. %s%n".repeat(3),
              "Pleasant Scene",
              "Scary Music",
              "Something Bad Happens");
  }
  
  public void watchAdventure() {
    System.out.println("Watching adventure film");
  }
  
}

class Comedy extends Movie {

  public Comedy(String title) {
      super(title);
  }

  @Override
  public void watchMovie() {
      super.watchMovie();
      System.out.printf(".. %s%n".repeat(3),
              "Something funny happens",
              "Something even funnier happens",
              "Happy Ending");
  }
  
  public void watchComedy() {
    System.out.println("Watching comedy film");
  }
}

class ScienceFiction extends Movie {

  public ScienceFiction(String title) {
      super(title);
  }

  @Override
  public void watchMovie() {
      super.watchMovie();
      System.out.printf(".. %s%n".repeat(3),
              "Bad Aliens do Bad Stuff",
              "Space Guys Chase Aliens",
              "Planet Blows Up");
  }
  
  public void watchScienceFiction() {
    System.out.println("Watching Science Fiction film");
  }
}

class Cars {
  // write code here
  private boolean engine;
  private int cylinders;
  private String name;
  private int wheels;
  
  public Cars(int cylinders,String name){
      this.cylinders = cylinders;
      this.name = name;
      this.engine = true;
      this.wheels = 4;
  }
  
  public String startEngine(){
      return("Car -> startEngine()");
  }
  
  public String accelerate(){
      return("Car -> accelerate()");
  }
  
  public String brake(){
      return("Car -> brake()");
  }
  
  public int getCylinders(){
      return cylinders;
  }
  
  public String getName(){
      return name;
  }
  
  public void drive() {
    System.out.println("Car -> Driving type is " + getClass().getSimpleName());
    System.out.println(startEngine());
  }
  
}

class Mitsubishi extends Cars{
  // write code here
  public Mitsubishi(int cylinders,String name){
      super(cylinders,name);
  }
  
  @Override
  public String startEngine(){
      return("Mitsubishi -> startEngine()");
  }
  
  @Override
  public String accelerate(){
      return("Mitsubishi -> accelerate()");
  }
  
  @Override
  public String brake(){
      return("Mitsubishi -> brake()");
  }
  
  
}

class Holden extends Cars{
  // write code here
  public Holden(int cylinders,String name){
      super(cylinders,name);
  }
  
  @Override
  public String startEngine(){
      return("Holden -> startEngine()");
  }
  
  @Override
  public String accelerate(){
      return("Holden -> accelerate()");
  }
  
  @Override
  public String brake(){
      return("Holden -> brake()");
  }
}

class Ford extends Cars{
  // write code here
  public Ford(int cylinders,String name){
      super(cylinders,name);
  }
  
  @Override
  public String startEngine(){
      return("Ford -> startEngine()");
  }
  
  @Override
  public String accelerate(){
      return("Ford -> accelerate()");
  }
  
  @Override
  public String brake(){
      return("Ford -> brake()");
  }
  
}