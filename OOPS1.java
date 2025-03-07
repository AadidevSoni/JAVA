public class OOPS1 extends Object{

	public static void main(String[] args) {
		
		Car car = new Car();
		car.setMake("Porsche");
		car.setModel("911");
		car.setColor("Red");
		car.describeCar();
		System.out.println("GETTER METHODS");
		System.out.println("Make = " + car.getMake());
		System.out.println("Model = " + car.getModel());
		System.out.println("Color = " + car.getColor());
		System.out.println("Doors = " + car.getDoors());
		System.out.println("Convertible? = " + car.getConvertible());
		
		Car car1 = new Car();
		car1.setMake("Ferrari");
		car1.describeCar();
		
		//BANK ACCOUNT CHALLENGE
		
		BankAccount bank = new BankAccount(); //default constructor
		bank.setAccNo(6969);
		bank.setAccBalance(10000);
		bank.setCustomerName("Aadidev");
		bank.setEmail("aadidevbahrain@gmail.com");
		bank.setPhoneNo("8714120603");
		
		bank.Withdraw(6000);
		bank.Deposit(1000);
		
		System.out.println(bank.getAccNo() + " , " + bank.getCustomerName() + " , " + bank.getAccBalance() + " , " + bank.getEmail() + " , " + bank.getPhoneNo());
		
		//CONSTRUCTOR
		
		BankAccount bank1 = new BankAccount(1234,100000,"Aadi","aadidevsoni@gmail.com","33337598");
		System.out.println(bank1.getAccNo() + " , " + bank1.getCustomerName() + " , " + bank1.getAccBalance() + " , " + bank1.getEmail() + " , " + bank1.getPhoneNo());
	
		//CONSTRUCTOR CHAINING
		
		BankAccount bank2 = new BankAccount();
		System.out.println(bank2.getAccNo() + " , " + bank2.getCustomerName() + " , " + bank2.getAccBalance() + " , " + bank2.getEmail() + " , " + bank2.getPhoneNo());
		
		BankAccount bank3 = new BankAccount("Aaduttan","aadidevbah@gmail.com","33895949");
		System.out.println(bank3.getAccNo() + " , " + bank3.getCustomerName() + " , " + bank3.getAccBalance() + " , " + bank3.getEmail() + " , " + bank3.getPhoneNo());
		
		//CUSTOMER CHALLENGE
		System.out.println("CUSTOMER 1");
		Customer customer1 = new Customer("Aadi",50000,"aadidevbahrain@gmail.com");
		System.out.println(customer1.getName());
		System.out.println(customer1.getCreditLimit());
		System.out.println(customer1.getEmail());
		
		System.out.println("CUSTOMER 2");
		Customer customer2 = new Customer();
		System.out.println(customer2.getName());
		System.out.println(customer2.getCreditLimit());
		System.out.println(customer2.getEmail());
		
		System.out.println("CUSTOMER 3");
		Customer customer3 = new Customer("Ishi","ishikagupta@gmail.com");
		System.out.println(customer3.getName());
		System.out.println(customer3.getCreditLimit());
		System.out.println(customer3.getEmail());
		
		//REFERENCES
		
		System.out.println("CUSTOMER REFERENCE");
		Customer newCustomer = customer3;   //We create a reference to the same object in memory and if we make change here, it affects customer3 as well
		newCustomer.setCreditLimit(100);
		System.out.println(newCustomer.getName());
		System.out.println(newCustomer.getCreditLimit());
		System.out.println(newCustomer.getEmail());
		
		System.out.println("CUSTOMER 3");
		System.out.println(customer3.getName());
		System.out.println(customer3.getCreditLimit());   //it affected the creditLimit here as well
		System.out.println(customer3.getEmail());
		
		//STATIC VARIABLES AND INSTANCE VARIABLES
		//Every instance of that class shares the same static variable
		
		Dog dog1 = new Dog("Rex");
		Dog dog2 = new Dog("Tom");
		dog1.printName();
		dog2.printName();   //both prints tom
		
		//STATIC AND INSTANCE METHODS
		//static methods cannot access instance methods and variables directly. we cant use this keyword n it
		
		Dog.printAge(2006);   //STATIC METHODS DONT NEED A INITIALIZATION TO BE CALLED.
		
		Dog dog3 = new Dog("Bob",7);
		dog3.printName();
		dog3.printAge();
		dog3.printAge(2018);  //ALTHOUGH IT WORKS, STATIC METHODS SHOULD BE CALLED FROM THE CLASS
		
		//POJO
		//PLANE OLD JAVA OBJECT - CLASS HAS ONLY INSTANCE FIELDS. USED TO READ AND WRITE DATA FROM DATABASES
		
		for(int i=1;i<=5;i++) {
			Student s = new Student("S92300" + i,
					switch(i) {
						case 1->"Jam";
						case 2->"Tim";
						case 3->"Bob";
						case 4->"Jim";
						case 5->"Roy";
						default->"NO NAME";
					},
					"05.11.1985",
					"Java MasterClass");
			System.out.println(s);  //we dont have to call toString method. Every object passed to println will implicitly run toString method if it exists
		}
		
		//THE RECORD - replace boilerplate code of the POJO and has rules. They are immutable
		//it is a class with data that cannot be altered
		//we dont have to write any of this code and it contains only constructors and accessors
		
		//create LPAStudent record class with all parameters
		
		for(int i=1;i<=5;i++) {
			LPAStudent s = new LPAStudent("S92300" + i,
					switch(i) {
						case 1->"Jam";
						case 2->"Tim";
						case 3->"Bob";
						case 4->"Jim";
						case 5->"Roy";
						default->"NO NAME";
					},
					"05.11.1985",
					"Java MasterClass");
			System.out.println(s);  
		}
		//it prints everything in a similar format to above but has no code written in it
		
		Student pojoStudent = new Student("S923006","Ann","05/11/1985","Java Masterclass");
		
		LPAStudent recordStudent = new LPAStudent("S923007","Ken","05/11/1985","Java Masterclass");
		
		System.out.println(pojoStudent);
		System.out.println(recordStudent);
		
		//Setters for pojo student
		pojoStudent.setClassList(pojoStudent.getClassList() + ", JAVA OCP Exam 829");
		//records cant have setters as they are immutable to keep it protected
		//recordStudent.setClassList(recordStudent.getClassList() + ", JAVA OCP Exam 829");
		//pojo has getters
		System.out.println(pojoStudent.getName() + " is taking " + pojoStudent.getClassList());
		//record has accessor methods which is just the variable name with ()
		System.out.println(recordStudent.name() + " is taking " + recordStudent.classList());
		
		//if we want to modify data, use pojo with code generation
		//record is only for reading data from databases
		
		//POINT CHALLENGE
		
		Point first = new Point(6, 5);
		Point second = new Point(3, 1);
		System.out.println("distance(0,0)= " + first.distance());
		System.out.println("distance(second)= " + first.distance(second));
		System.out.println("distance(2,2)= " + first.distance(2, 2));
		Point point = new Point();
		System.out.println("distance()= " + point.distance());
		
		//COMPLEX NUMBER CHALLENGE
		
		ComplexNumber one = new ComplexNumber(1.0, 1.0);
		ComplexNumber number = new ComplexNumber(2.5, -1.5);
		one.add(1,1);
		System.out.println("one.real= " + one.getReal());
		System.out.println("one.imaginary= " + one.getImaginary());
		one.subtract(number);
		System.out.println("one.real= " + one.getReal());
		System.out.println("one.imaginary= " + one.getImaginary());
		number.subtract(one);
		System.out.println("number.real= " + number.getReal());
		System.out.println("number.imaginary= " + number.getImaginary());
		
		System.out.println("--------------------------------");
		System.out.println("INHERITANCE");
		//INHERITANCE
		//dogs is child class of animal using extends
		
		Animal animal = new Animal("Generic animal","Huge",300);
		doAnimalStuff(animal,"slow");
		
		Dogs dogs = new Dogs();
		doAnimalStuff(dogs,"fast");  //this is okay eventhough the method takes Animal type as it is a child of that class
		//dogs have all methods that are in animal
		
		System.out.println("--------------------------------");
		System.out.println("POMERIAN");
		
		Dogs pomerian = new Dogs("Pomerian",20);
		doAnimalStuff(pomerian,"fast");
		
		System.out.println("--------------------------------");
		System.out.println("GREY HOUND");
		
		Dogs greyHound = new Dogs("Grey Hound",50,"Floppy","Runner");
		doAnimalStuff(greyHound,"very fast");
		
		System.out.println("--------------------------------");
		System.out.println("RANDOM");
		
		Dogs randomDog = new Dogs();
		doAnimalStuff(randomDog,"slow");
		
		System.out.println("--------------------------------");
		System.out.println("WOLF");
		
		Dogs wolf = new Dogs("wolf",60);
		doAnimalStuff(wolf,"fast");
		
		System.out.println("--------------------------------");
		System.out.println("GOLD FISH");
		
		Fish goldie = new Fish("Goldfish",0.25,2,3);
		doAnimalStuff(goldie,"slow");
		
		System.out.println("--------------------------------");
		System.out.println("SAIL FISH");
		
		Fish sailFish = new Fish("Sail Fish",0.25,2,3);
		doAnimalStuff(sailFish,"fast");
		
		//polymorphism - animal class can take different forms like dogs and fish which are not directly understood in the above method
		
		//object class - every class we created are inherited from this object class
		
		System.out.println();
		
		Students max = new Students("Max",21);
		System.out.println(max.toString());  //- gives the class name + @ + Hashcode if toString method is not defined in class
		
		primarySchoolStudent jimmy = new primarySchoolStudent("Jimmy",7,"Bill");
		System.out.println(jimmy);
		
		//INHERITANCE CHALLENGE 1
		
		System.out.println("INHERITANCE CHALLENGE -1 ");
		System.out.println("--------------------");
		
		Employee tim = new Employee("Tim","11/11/1985","01/01/2020");
		System.out.println(tim);
		System.out.println("Age = " + tim.getAge());
		System.out.println("Pay = " + tim.collectPay());
		
		Employee jim = new Employee("Jim","11/11/1985","01/01/2020");
		System.out.println(jim);
		System.out.println("Age = " + jim.getAge());
		System.out.println("Pay = " + jim.collectPay());
		
		SalariedEmployee joe = new SalariedEmployee("Joe","11/11/1985","01/01/2020",80000.00);
		System.out.println(joe);
		System.out.println("Joe's paycheck per week is = $" + joe.collectPay());
		
		joe.retire();
		System.out.println("Joe's pension paycheck per week is = $" + joe.collectPay());
		
		//this and super keyword
		
		Rectangle rectangle = new Rectangle();
		System.out.println(rectangle.toString());
		Rectangle rectangle1 = new Rectangle(4,7);
		System.out.println(rectangle1.toString());
		Rectangle rectangle2 = new Rectangle(1,5,8,3);
		System.out.println(rectangle2.toString());
		Shape shape1 = new Shape(1,2);
		System.out.println(shape1.toString());	
		
		//CHALLENGE - 1
		Circle circle = new Circle(3.75);
		System.out.println("circle.radius= " + circle.getRadius());
		System.out.println("circle.area= " + circle.getArea());
		Cylinder cylinder = new Cylinder(5.55, 7.25);
		System.out.println("cylinder.radius= " + cylinder.getRadius());
		System.out.println("cylinder.height= " + cylinder.getHeight());
		System.out.println("cylinder.area= " + cylinder.getArea());
		System.out.println("cylinder.volume= " + cylinder.getVolume());
		
		
	}
	
	public static void doAnimalStuff(Animal animal,String speed) {
		animal.move(speed);
		animal.makeNoise();
		System.out.println(animal); //for dogs, this will print the toStrings method on the dog and not the animal as it understands it is a child of that class
	}
	
}


//only one class in the main can be public
class Students {
	private String name;
	private int age;
	
	public Students(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	//@Override
	//public String toString() {
	//	return super.toString();   //this does the same thing as System.out.println(max.toString()); as super is just object class
	//}
	
	@Override
	public String toString() {
		return(name + " is " + age);
	}
	
}

class primarySchoolStudent extends Students{
	private String parentName;
	
	public primarySchoolStudent(String name, int age,String parentName) {
		super(name, age);
		this.parentName = parentName;
	}
	
	@Override
	public String toString() {
		return(parentName + "'s kid : " + super.toString());
	}

}

class Car {
	
	//default values
	private String make = "Tesla";
	private String model = "Model Y";
	private String color = "White";
	private int doors = 2;
	private boolean convertible = true;
	
	//GETTER METHODS
	
	public String getMake() {
		return make;
	}
	public String getModel() {
		return model;
	}
	public String getColor() {
		return color;
	}
	public int getDoors() {
		return doors;
	}
	public boolean getConvertible() {
		return convertible;
	}
	
	//SETTER METHODS
	
	public void setMake(String make) {
		if(make == null) make = "Unknown";
		String lowercaseMake = make.toLowerCase();
		switch(lowercaseMake) {
			case "holden" , "porsche" , "tesla" -> this.make = make;
			default -> this.make = "Unsupported";
		}
	}
	public void setModel(String model) {
		this.model = model;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public void setDoors(int doors) {
		this.doors = doors;
	}
	public void setConvertible(boolean convertible) {
		this.convertible = convertible;
	}
	
	//DESCRIPTION
	
	public void describeCar() {
		System.out.println("Make: " + make);
		System.out.println("Model: " + model);
		System.out.println("Color: " + color);
		System.out.println("Doors: " + doors);
		System.out.println("Convertible: " + (convertible?"Yes":"No"));
	}
}

class BankAccount {
	private int accNo;
	private double accBalance;
	private String customerName;
	private String email;
	private String phoneNo;
	
	//CONSTRUCTOR - only called once at the start
	
	public BankAccount() {
		//CONSTRUCTOR CHAINING - has to be first line on a constructor (default for empty parameter constructor to call another constructor)
		this(1253,12443,"Default name","Default email","Default phone");
		System.out.println("Empty constructor called");
	}
	
	public BankAccount(int accNo,double accBalance,String customerName,String email,String phoneNo) {
		System.out.println("Constructor with 5 parameters called");
		this.accNo = accNo;
		this.accBalance = accBalance;
		this.customerName = customerName;
		this.email = email;
		this.phoneNo = phoneNo;
	}
	
	public BankAccount(String customerName,String email,String phoneNo) {
		this(9999,19834,customerName,email,phoneNo);  //defaulted first 2 variables
		System.out.println("Constructor with 3 parameters called");
	}
	//GETTERS
	
	public int getAccNo() {
		return accNo;
	}
	public double getAccBalance() {
		return accBalance;
	}
	public String getCustomerName() {
		return customerName;
	}
	public String getEmail() {
		return email;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	
	//SETTERS
	
	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}
	public void setAccBalance(double accBalance) {
		this.accBalance = accBalance;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	
	//METHODS
	
	public void Deposit(double amount) {
		accBalance += amount;
		System.out.println("Rs" + amount + " deposited");
		System.out.println("Account Balance: Rs" + accBalance);
	}
	
	public void Withdraw(double amount) {
		if(amount < accBalance) {
			accBalance -= amount;
			System.out.println("Rs" + amount + " withdrawn");
			System.out.println("Account Balance: Rs" + accBalance);
		}else {
			System.out.println("INSUFFICIENT BALANCE!");
		}
	}
}

class Customer {
	private String name;
	private double creditLimit;
	private String email;
	
	public Customer(String name,double creditLimit,String email) {
		this.name = name;
		this.creditLimit = creditLimit;
		this.email = email;
	}
	
	public Customer() {
		this("Default name",100000,"Default email");
	}
	
	public Customer(String name,String email) {
		this(name,100000,email);
	}
	
	public String getName() {
		return name;
	}
	
	public double getCreditLimit() {
		return creditLimit;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setCreditLimit(double creditLimit) {
		this.creditLimit = creditLimit;
	}

}

class Dog {
	private static String name;
	
	private String dogName;
	private int dogAge;
	
	public Dog(String name) {
		this.name = name;
	}
	
	public Dog(String dogName,int dogAge) {
		this.dogName = dogName;
		this.dogAge = dogAge;
	}

	public void printName() {
		System.out.println("Name = " + name);
	}
	
	public void printAge() {
		System.out.println("Age = " + dogAge);
	}
	
	//STATIC METHODS
	
	public static void printAge(int year) {
		System.out.println("Age = " + (2024 - year));
	}
}

class Student {
	
	private String id;
	private String name;
	private String dateOfBirth;
	private String classList;
	
	public Student(String id,String name,String dateOfBirth,String classList) {
		this.id = id;
		this.name = name;
		this.dateOfBirth = dateOfBirth;
		this.classList = classList;
	}
	
	@Override  //annotation - metadata and has more meaning than comments and give information about the code
	public String toString() {
		return "Student{" +
				"id='" + id + '\'' + 
				", name='" + name + '\'' + 
				", dateOfBirth='" + dateOfBirth + '\'' + 
				", classList='" + classList + '\'' + 
				'}'; 
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getClassList() {
		return classList;
	}

	public void setClassList(String classList) {
		this.classList = classList;
	}
	
}

record LPAStudent(String id,String name,String dateOfBirth,String classList) {//record header

}

class Point {
	 
  private int x;
  private int y;

  public Point() {}

  public Point(int x, int y) {
      this.x = x;
      this.y = y;
  }

  public int getX() {
      return x;
  }

  public void setX(int x) {
      this.x = x;
  }

  public int getY() {
      return y;
  }

  public void setY(int y) {
      this.y = y;
  }

  public double distance() {
      return distance(0, 0);
  }

  public double distance(Point a) {
      return distance(a.x, a.y);
  }

  public double distance(int x, int y) {
      
      int xDiff = this.x - x;
      int yDiff = this.y - y;
      return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
  }
}

class ComplexNumber {
  // write code here
  private double real;
  private double imaginary;
  
  public ComplexNumber(double real,double imaginary){
      this.real = real;
      this.imaginary = imaginary;
  }
  
  public double getReal(){
      return(real);
  }
  
  public double getImaginary(){
      return(imaginary);
  }
  
  public void add(double real,double imaginary){
      this.real += real;
      this.imaginary += imaginary;
  }
  
  public void add(ComplexNumber a){
      this.real += a.real;
      this.imaginary += a.imaginary;
  }
  
  public void subtract(double real,double imaginary){
      this.real -= real;
      this.imaginary -= imaginary;
  }
  
  public void subtract(ComplexNumber a){
      this.real -= a.real;
      this.imaginary -= a.imaginary;
  }
  
}

class Animal {
	
	protected String type; //if type is private, not even sub classes can access them. but protected lets sub classes access them
	private String size;
	private double weight;
	
	public Animal() {
		
	}
	
	public Animal(String type, String size, double weight) {
		super();
		this.type = type;
		this.size = size;
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Animal [type=" + type + ", size=" + size + ", weight=" + weight + "]";
	}
	
	public void move(String speed) {
		System.out.println(type + " moves " + speed);
	}
	
	public void makeNoise() {
		System.out.println(type + " makes noise");
	}
	
}




class Dogs extends Animal{
	
	private String earShape;
	private String tailShape;
	
	//ANIMAL has to have a constructor with no parameters or it shows error
	public Dogs() {
		super("Bull dog","small",100);  //it is a way to call a constructor on super class directly from constructor of child class
	}
	
	public Dogs(String type,double weight) {  //makes it easy to make constructors for those dogs with perky ears and curled tails
		this(type,weight,"Perky","Curled"); //this will call the Dogs with 4 parameters and that calls animals constructor ie, constructor chaining
		//this goes to the animal 3 parameter constructor
	}

	public Dogs(String type,double weight,String earShape,String tailShape) {
		super(type, weight < 15?"small":(weight < 30?"medium":"big"), weight); //super must be the first statement in the constructor
		this.earShape = earShape;
		this.tailShape = tailShape;
	}

	@Override
	public String toString() {
		return "Dogs [earShape=" + earShape + ", tailShape=" + tailShape + "] " + super.toString(); //it calls super class's method
	}
	
	

	@Override
	public void makeNoise() {
		if(type == "wolf") {
			System.out.println("Ow woooooo");
		}else {
			bark();
		}
	}

	@Override
	public void move(String speed) {
		super.move(speed);  //we are calling the move method on the parent class. now it can do what the animal class does plus additional stuffs
		//System.out.println("Dogs walk,run and wag their tail");
		
		if(speed == "slow") {
			walk();
			tailWag();
		}else {
			run();
			bark();
		}
		System.out.println();
	}
	
	//METHODS can be inherited and override the methods of parent class
	
	private void bark() {  //it is private because we want to call it from the move method
		System.out.println("Woof!");
	}
	
	private void run() { 
		System.out.println("Dog running");
	}
	
	private void walk() {  
		System.out.println("Dog walking");
	}
	private void tailWag() {  
		System.out.println("Dog's tail wagging");
	}
	
}




class Fish extends Animal{
	private int gills;
	private int fins;
	
	public Fish(String type,double weight,int gills, int fins) {
		super(type,"small",weight);
		this.gills = gills;
		this.fins = fins;
	}
	
	private void moveMuscles() {
		System.out.println("Muscles moving");
	}
	
	private void moveBackFin() {
		System.out.println("Back Fins Moving");
	}
	
	@Override
	public void move(String speed) {
		super.move(speed);
		moveMuscles();
		if(speed == "fast") {
			moveBackFin();
		}
	}

	@Override
	public String toString() {
		return "Fish [gills=" + gills + ", fins=" + fins + "]" + super.toString();
	}
	
}

class Worker {
	
	private String name;
	private String birthDate;
	protected String endDate;
	
	public Worker() {
		
	}

	public Worker(String name, String birthDate) {
		super();
		this.name = name;
		this.birthDate = birthDate;
	}

	public String toString() {
		return "Worker [name=" + name + ", birthDate=" + birthDate + ", endDate=" + endDate + "]";
	}
	
	public int getAge() {
		int currentYear = 2025;
		int birthYear = Integer.parseInt(birthDate.substring(6));  //STRIGN METHOD
		return(currentYear - birthYear);
	}
	
	public double collectPay() {  //the sub classes will determine the pay
		return 0.0;
	}
	
	public void terminate(String endDate) {
		this.endDate = endDate;
	}
	

}





class Employee extends Worker{
	
	private int employeeId;
	private String hireDate;
	
	private static int employeeNo = 1;
	
	public Employee(String name, String birthDate,String hireDate) {
		super(name,birthDate);
		this.employeeId = Employee.employeeNo++;
		this.hireDate = hireDate;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", hireDate=" + hireDate + "]" + super.toString();
	}
	
	

}





class SalariedEmployee extends Employee{
	
	double annualSalary;
	boolean isRetired;
	
	public SalariedEmployee(String name, String birthDate, String hireDate, double annualSalary) {
		super(name, birthDate, hireDate);
		this.annualSalary = annualSalary;
	}
	
	@Override
	public double collectPay() {
		double paycheck = annualSalary/26;
		double adjustedPay = (isRetired)?0.9*paycheck:paycheck;
		
		return (int)adjustedPay;
	}
	
	public void retire() {
		terminate("12/12'2025");
		isRetired = true;
	}
	
	
}

class Shape {
	
	private int x;
	private int y;
	
	public Shape(int x,int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		return "Shape [x=" + x + ", y=" + y + "]";
	}

}






class Rectangle extends Shape{
	
	private int x;
	private int y;
	private int width;
	private int height;
	
	//CONSTRUCTOR CHAINING
	
	public Rectangle() { //this calls the next constructor
		this(0,0);
	}
	
	public Rectangle(int x,int y) {
		this(x,y,0,0);  //this constructor calls the next constructor
	}
	
	public Rectangle(int x,int y,int width,int height) {
		super(x,y);   //this calls the constructor from the parent class;
		this.width = width;
		this.height = height;
	}

	@Override
	public String toString() {
		return "Rectangle [x=" + x + ", y=" + y + ", width=" + width + ", height=" + height + "]";
	}
	
	

}

class Circle {
	
	private double radius;
    
    public Circle(double radius){
        if(radius < 0){
            radius = 0;
        }
        this.radius = radius;
    }
    
    public double getRadius() {
        return radius;
    }
 
    public double getArea() {
        return radius * radius * Math.PI;
    }
}





class Cylinder extends Circle{
	
	private double height;
    
    public Cylinder(double radius,double height){
        super(radius);
        if(height < 0){
            height = 0;
        }
        this.height = height;
        
    }
    
    public double getHeight(){
        return height;
    }
    
    public double getVolume(){
        return(getArea()*height);
    }

}