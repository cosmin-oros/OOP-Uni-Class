/*
package Course;

class Duck {
	private static final double AVG_SWIM_SPEED = 0.003; // km/sec
	
	private String name;
	private String color;
	private double km; // travelled
	
	public Duck(String name, String color, double km)	{
		this.name = name;
		this.color = color;
		this.km = km;
	}
	
	public Duck(String name, String color) {
		this(name,color,0);
	}
	
	private String says() {
		return "Quack!";
	}
	
	public Duck walk(int distance) {
		System.out.println("Walking... " + distance + " km.");
		//this.km += distance;
		return new Duck(name, color, this.km + distance);
	}
	
	public Duck swim(int duration) {// seconds;
		System.out.println("Swimming for... " + duration + " seconds.");
		//this.km += AVG_SWIM_SPEED * duration;
		return new Duck(name, color, km + AVG_SWIM_SPEED * duration);
	}
	
	public void print()
	{
		System.out.println(this.toString());
	}
	
	public String toString() {
		return says()+" My name is "+name+", I have a " + color +" color and travelled " + km + " km.";
	}
	
	public boolean equals(Object o) {
			return (o instanceof Duck) && ((Duck)o).name.equals(this.name);
	}
	
}

class ImmutableObjects {
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
	  
	  Duck babyDuck3 = babyDuck.walk(2);

	  System.out.println("Original: " + babyDuck);	 
	  System.out.println("Modified: " + babyDuck3);	
	  
	  Duck babyDuck4 = babyDuck3.swim(30);
	 
	  System.out.println("First baby duck: " + babyDuck);	 
	  System.out.println("Original: " + babyDuck3);	 
	  System.out.println("Modified: " + babyDuck4);	
	}
}*/
