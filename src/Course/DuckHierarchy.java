/*
package Course;

class Animal {
	
	protected String name;
	protected int age;
	
	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public Animal(String name) {
		this(name, 0);
	}
	
	protected String says() {
		return "?";
	}
	
	public int increaseAgeByYears(int yearCount) {
		age += yearCount;
		return age;
	}
	
	public void print()
	{
		System.out.println(this.toString());
	}
	
	public String toString() {
		return says()+" My name is "+name+" and I am " + age + " years old.";
	}
	
	public boolean equals(Object o) {
			if (!(o instanceof Animal))
				return false;
			Animal animalToCompare = (Animal)o;
			return animalToCompare.name.equals(this.name);
	}
}

class Bird2 extends Animal {
	
	protected String color;
	
	public Bird2(String name, String color, int age) {
		super(name, age);	
		this.color = color;		
	}
	
	public Bird2(String name, String color) {
		this(name, color, 0);
	}
	
	protected String says() {
		return "Beep";
	}
	
	// Fly to reach a certain height in meters
	public Bird2 fly(int height) {
		System.out.println("Flying... to reach " + height + " m.");
		return this;
	}
		
	public String toString() {
		return super.toString()+" I have a " + color +" color.";
	}
	
}

class Duck extends Bird2 {
	// Ducks have fairly short legs, and then they cannot gain too much speed, so 0.003 km/second is a reasonable value
	private static final double AVG_SWIM_SPEED = 0.003; 
	
	private double kmTravelled;
	
	public Duck(String name, String color, double km, int age)	{
		super(name, color, age);
		this.kmTravelled = km;
	}
	
	public Duck(String name, String color, double km)	{
		this(name, color, km, 0);		
	}
	
	public Duck(String name, String color) {
		this(name, color, 0);
	}
	
	protected String says() {
		return "Quack!";
	}
	
	// Walk a distance - given in km
	public Duck walk(int distance) {
		System.out.println("Walking... " + distance + " km.");
		//this.kmTravelled += distance;
		return new Duck(name, color, this.kmTravelled + distance, age);
	}
	
	// Swim for a duration - given in seconds
	public Duck swim(int duration) {
		System.out.println("Swimming for... " + duration + " seconds.");
		//this.kmTravelled += AVG_SWIM_SPEED * duration;
		double updatedKmTravelled = kmTravelled + AVG_SWIM_SPEED * duration;
		return new Duck(name, color, updatedKmTravelled, age);
	}
	
	// Provide height in meters
	private double computeKmTravelledToReachHeight(int height) {
		// ... computations
		return 10;
	}
	
	// Provide height in meters
	public Duck fly(int height) {
		super.fly(height);
		//this.kmTravelled += computeKmTravelledToReachHeight(height);
		double updatedKmTravelled = kmTravelled + computeKmTravelledToReachHeight(height);
		return new Duck(name, color, updatedKmTravelled, age);
	}
	
	public String toString() {
		return super.toString() + " I've travelled " + kmTravelled + " km.";
	}
	
}

class DuckHierarchy {
  public static void main(String[] args) {
	  Duck donald = new Duck("Donald","white", 100);
	  
	  donald.print();
	  donald.increaseAgeByYears(25);
	  
	  Duck duffy = new Duck("Duffy","black", 150);
	  
	  duffy.print();
	  duffy.increaseAgeByYears(30);
	  
	  System.out.println(donald + " ////// " + duffy);
	  
	  System.out.println("Comparing Donald to Duffy: " + donald.equals(duffy));
	  
	  Duck babyDuck = new Duck("Baby","yellow");
	  
	  System.out.println(babyDuck);
	  
	  Duck babyDuck2 = new Duck("Baby","white");
	  
	  System.out.println(babyDuck2);
	  
	  System.out.println("Comparing baby ducks: " + babyDuck.equals(babyDuck2));
	  
	  Duck babyDuck3 = babyDuck.walk(2);

	  System.out.println("Original: " + babyDuck);	 
	  System.out.println("Modified: " + babyDuck3);	
	  
	  Duck babyDuck4 = babyDuck3.swim(30);
	 
	  System.out.println("First baby duck: " + babyDuck);	 
	  System.out.println("Original: " + babyDuck3);	 
	  System.out.println("Modified: " + babyDuck4);	
	  
	  Animal[] animals = new Animal[2];
	  animals[0] = new Animal("Pluto");
	  animals[1] = donald;
	  
	  System.out.println("Array of animals:");
	  for(int i = 0; i < animals.length; i++){
		  System.out.println(animals[i]);
		  if (animals[i] instanceof Duck)
			((Duck)animals[i]).walk(8);
	  }
	  
	  Bird2 tweety = new Bird2("Tweety", "yellow");
	  System.out.println(tweety);
	  tweety.fly(3);
	  tweety.increaseAgeByYears(15);
	  System.out.println(tweety);
	  
	  Duck airborneDonald = donald.fly(5);
	  System.out.println(airborneDonald);
	}
}*/
