package Course;

class BunchOfDucks {
	// If there are more than 10 ducks, they'd fight.
	private static final int MAX_MEMBERS = 10; 
	
	private String owner;
	private int duckCount;
	private Duck2[] memberDucks;

	public BunchOfDucks(String owner) {
		this.owner = owner;
		this.duckCount = 0;
		memberDucks = new Duck2[MAX_MEMBERS];
		System.out.println("Length: " + memberDucks.length);
	}
	
	public void AddDuck(Duck2 d) {
		memberDucks[duckCount] = d;
		duckCount++;
		System.out.println("Length: " + memberDucks.length);
	}
	
	private boolean removeDuckFromList(int indexOfDuckToRemove) {
		if (indexOfDuckToRemove == -1)
			return false;
		
		memberDucks[indexOfDuckToRemove]=null; 
		duckCount--;
		for (int i = indexOfDuckToRemove; i < duckCount; i++)
			memberDucks[i] = memberDucks[i+1];
		
		return true;
	}
	
	private boolean compareDucks(Duck2 d1, Duck2 d2)	{
		return d1.equals(d2);
	}
		
	private boolean compareDucks(Duck2 d, String duckName)	{
		return d.getName().equals(duckName);
	}
	
	public boolean RemoveDuck(Duck2 d) {
		int indexOfDuckToRemove = -1;
		for (int i = 0; i < duckCount; i++)
			if (compareDucks(memberDucks[i],d)) {
				indexOfDuckToRemove = i;
				break;
			}
		
		return removeDuckFromList(indexOfDuckToRemove);
	}
	
	public boolean RemoveDuck(String duckName) {
		int indexOfDuckToRemove = -1;
		for (int i = 0; i < duckCount; i++)
			if (compareDucks(memberDucks[i], duckName)) {
				indexOfDuckToRemove = i;
				break;
			}
		
		return removeDuckFromList(indexOfDuckToRemove);	
	}
	
	public void Swim(int duration) {
		for (int i = 0; i < duckCount; i++)
			memberDucks[i].swim(duration);
	}
	
	public void Walk(int distance) {
		for (int i = 0; i < duckCount; i++)
			memberDucks[i].walk(distance);
	}
	
	public String DetailedInfo() {
		StringBuilder memberList = new StringBuilder();
		for (int i = 0; i < duckCount; i++) {
			memberList.append(memberDucks[i].toString());
			memberList.append(", ");
		}
		
		return "My owner is " + owner + " and members are: " + memberList.toString();
	}
	
	public String toString() {
		StringBuilder memberList = new StringBuilder();
		for (int i = 0; i < duckCount; i++) {
			memberList.append(memberDucks[i].getName());
			memberList.append(", ");
		}
		
		return "My owner is " + owner + " and members are: " + memberList.toString();
	}

}

class Duck2 {
	// Ducks have fairly short legs, and then they cannot gain too much speed, so 0.003 km/second is a reasonable value
	private static final double AVG_SWIM_SPEED = 0.003; 
	
	private String name;
	private String color;
	private double kmTravelled;
	
	public Duck2(String name, String color, double km)	{
		this.name = name;
		this.color = color;
		this.kmTravelled = km;
	}
	
	public Duck2(String name, String color) {
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
			Duck2 duckToCompare = (Duck2)o;
			return duckToCompare.name.equals(this.name);
	}
	
}

class DuckArrayObjects {
  public static void main(String[] args) {
	  Duck2 donald = new Duck2("Donald","white", 100);
	  
	  donald.print();
	  
	  Duck2 duffy = new Duck2("Duffy","black", 150);
	  
	  duffy.print();
	  
	  System.out.println(donald + " ////// " + duffy);
	  
	  System.out.println("Comparing Donald to Duffy: " + donald.equals(duffy));
	  
	  Duck2 babyDuck = new Duck2("Baby","yellow");
	  
	  System.out.println(babyDuck);
	  
	  Duck2 babyDuck2 = new Duck2("Baby","white");
	  
	  System.out.println(babyDuck2);
	  
	  System.out.println("Comparing baby ducks: " + babyDuck.equals(babyDuck2));
	  
	  //Duck babyDuck3 = babyDuck.walk(2);

	  System.out.println("Original: " + babyDuck);	 
	  //System.out.println("Modified: " + babyDuck3);	
	  
	 // Duck babyDuck4 = babyDuck3.swim(30);
	 
	  System.out.println("First baby duck: " + babyDuck);	 
	  //System.out.println("Original: " + babyDuck3);	 
	  //System.out.println("Modified: " + babyDuck4);	
	  
	  BunchOfDucks ducks = new BunchOfDucks("Cosmina");
	  ducks.AddDuck(donald);
	  ducks.AddDuck(duffy);

	  System.out.println(ducks);

	  ducks.Swim(60);
	  
	  System.out.println(ducks.DetailedInfo());
	  
	  if (ducks.RemoveDuck("Donald"))
	  	  System.out.println(ducks);
	  else
		  System.out.println("The duck is not part of the bunch");
	  
	  String toRemove = "Bugs Bunny";
	  if (ducks.RemoveDuck(toRemove))
	  	  System.out.println(ducks);
	  else
		  System.out.println(toRemove + " is not part of the bunch");
	  
	}
}