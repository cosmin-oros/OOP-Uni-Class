package Course;

class Duck {
	private static final double AVG_SWIM_SPEED = 0.003; // km/sec
	
	private String name;
	private String color;
	private double km; // travelled
	
	public Duck(String n, String c, double k)	{
		this.name = n;
		this.color = c;
		this.km = k;
	}	
	
	private String says() {
		return "Quack!";
	}
	
	public void walk(int distance) {
		System.out.println("Walking... " + distance + " km.");
		this.km += distance;
	}
	
	public void swim(int duration) {// seconds;
		System.out.println("Swimming for... " + duration + " seconds.");
		this.km += AVG_SWIM_SPEED * duration;		
	}
	
	public void print()
	{
		System.out.println(says()+" My name is "+name+", I have a " + color +" color and travelled " + km + " km.");
	}
		
}

class DuckObjects {
  public static void main(String[] args) {
	  Duck donald = new Duck("Donald","white", 100);
	  
	  donald.print();
	  donald.walk(2);
	  donald.print();
	 
	  Duck duffy = new Duck("Duffy","black", 150);
	  
	  duffy.print();
	  duffy.swim(30);
	  duffy.print();
	}
}