package Course;

class Duck {
	// Ducks have fairly short legs, and then they cannot gain too much speed, so 0.003 km/second is a reasonable value
	private static final double AVG_SWIM_SPEED = 0.003; 
	
	private String name;
	private String color;
	private double kmTravelled;
	
	public Duck(String name, String color, double km)	{
		this.name = name;
		this.color = color;
		this.kmTravelled = km;
	}
	
	public Duck(String name, String color) {
		this(name,color,0);
	}
	
	private String says() {
		return "Quack!";
	}
	
	public String getName() {
		return this.name;
	}
	
	// Walk a distance - given in km
	public void walk(int distance) {
		System.out.println("Walking... " + distance + " km.");
		this.kmTravelled += distance;
		//return new Duck(name, color, this.kmTravelled + distance);
	}
	
	// Swim for a duration - given in seconds
	public void swim(int duration) {
		System.out.println("Swimming for... " + duration + " seconds.");
		this.kmTravelled += AVG_SWIM_SPEED * duration;
		//double updatedKmTravelled = kmTravelled + AVG_SWIM_SPEED * duration;
		//return new Duck(name, color, updatedKmTravelled);
	}
	
	public void print()
	{
		System.out.println(this.toString());
	}
	
	public String toString() {
		return says()+" My name is "+name+", I have a " + color +" color and travelled " + kmTravelled + " km.";
	}
	
	public boolean equals(Object o) {
			if (!(o instanceof Duck))
				return false;
			Duck duckToCompare = (Duck)o;
			return duckToCompare.name.equals(this.name);
	}
	
}

class CleanObjects {
  public static void main(String[] args) {
	  Duck donald = new Duck("Donald","white", 100);
	  
	  donald.print();
	  
	  Duck duffy = new Duck("Duffy","black", 150);
	  
	  duffy.print();
	  
	  System.out.println(donald + " ////// " + duffy);
	  
	  System.out.println("Comparing Donald to Duffy: " + donald.equals(duffy));
	  
	  Duck babyDuck = new Duck("Baby","yellow");
	  
	  System.out.println(babyDuck);
	  
	  Duck babyDuck2 = new Duck("Baby","white");
	  
	  System.out.println(babyDuck2);
	  
	  System.out.println("Comparing baby ducks: " + babyDuck.equals(babyDuck2));
	 
  }
	
}