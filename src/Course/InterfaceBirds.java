package Course;

interface BirdInterface {
	BirdInterface walk(int distance);
	String says();
}

interface BirdThatFliesInterface extends BirdInterface {
	BirdThatFliesInterface fly(int height);
}

interface BirdThatSwimsInterface extends BirdInterface {
	BirdThatSwimsInterface swim(int duration);
}

abstract class Bird implements BirdInterface {
	protected String name;
	protected int age;
	protected String color;
	
	public Bird(String name, String color, int age) {
		this.name = name;
		this.age = age;		
		this.color = color;		
	}
	
	public Bird(String name, String color) {
		this(name, color, 0);
	}
	
	public String says() {
		return "Beep";
	}
			
	public String toString() {
		return says()+" My name is "+name+" and I am " + age + " years old." +" I have a " + color +" color.";
	}
	
	public boolean equals(Object o) {
			if (!(o instanceof Bird))
				return false;
			Bird birdToCompare = (Bird)o;
			return birdToCompare.name.equals(this.name);
	}
}

class Duck extends Bird implements BirdThatFliesInterface, BirdThatSwimsInterface {
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
	
	public String says() {
		return "Quack!";
	}
	
	// Walk a distance - given in km
	public BirdInterface walk(int distance) {
		System.out.println("Walking... " + distance + " km.");
		//this.kmTravelled += distance;
		return new Duck(name, color, this.kmTravelled + distance, age);
	}
	
	// Swim for a duration - given in seconds
	public BirdThatSwimsInterface swim(int duration) {
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
	public BirdThatFliesInterface fly(int height) {
		//this.kmTravelled += computeKmTravelledToReachHeight(height);
		double updatedKmTravelled = kmTravelled + computeKmTravelledToReachHeight(height);
		return new Duck(name, color, updatedKmTravelled, age);
	}
	
	public String toString() {
		return super.toString() + " I've travelled " + kmTravelled + " km.";
	}
	
}

class InterfaceBirds {
  public static void main(String[] args) {
	  BirdInterface bird = new Duck("Baby Duck", "yellow", 0);
	  BirdThatFliesInterface bird1 = new Duck("Donald","white", 100);
	  BirdThatSwimsInterface bird2 = new Duck("Duffy","black", 150);
	  
	  System.out.println(bird);
	  BirdInterface b = bird.walk(50);
	  System.out.println(b);
		  
	  System.out.println(bird1);
	  BirdThatFliesInterface new_bird = bird1.fly(5);
	  System.out.println(new_bird);
	  new_bird.walk(30);
	  
	  System.out.println(bird2);
	  BirdThatSwimsInterface new_bird2 = bird2.swim(10);	  
	  System.out.println(new_bird2);
	  new_bird2.walk(30);
	  }
}