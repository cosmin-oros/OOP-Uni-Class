package Assignment5;

/*
    1. We need to instantiate inside a Java main method several planes
    belonging to the fleet of a country. The fleet contains passenger planes as
    well as fighter planes.
    There are two types of passenger planes: Boeing or Concorde. Fighter
    planes can be MiG or TomCat.

    Each type of plane is modelled through a class and the actual planes will be
    instances of those classes. Each plane can perform a specific range of
    operations and procedures, as specified below. It is required to “build” more
    planes of various types and execute all the operations provided by each
    airplane.

    Each plane must contain a unique private member planeID (e.g. 1, 2, 3, 4).
    The ID of a plane is implicitly set when the plane is instantiated and its value
    is the ID of the previous plane plus one. The ID of the first plane is 1.

    Each plane must contain an int denoting the power of its engine. This value is
    set in the constructor of the plane that receives this value via a parameter.

    Each plane provides the following services:
    public String getPlaneID() - returns the ID of the plane
    public int getTotalEnginePower() - returns the power of the engine
    public void takeOff() - prints “takeOff” on the screen
    public void land() - prints “land” on the screen
    public void fly() - prints “fly” on the screen

    Only passenger planes contain a member maxPassengers that is set in the
    constructor of the class and a method public int getMaxPassengers() to return
    the value of this member.

    Concorde passenger planes are supersonic and, consequently, the next two
    services are provided by this plane:
    public void goSuperSonic() - prints “Supersonic mode activated” on
    the screen
    public void goSubSonic() - prints “Supersonic mode deactivated” on
    the screen

    Fighter planes have the capacity to launch rockets on different targets, so for
    every fighter we must be able to call the method:
    public void launchMissile() - prints “Launching rocket” on the screen

    MIG planes have variable geometry for normal and high-speed flight. The
    class that models this plane have the next methods:
    public void highSpeedGeometry() - prints “High speed selected
    geometry” on the screen
    public void and normalGeometry() - prints “Normal selected geometry”
    on the screen

    TomCat planes can be refuelled when flighting, so for such planes it makes
    sense to call a method
    public void refuel() which prints on the screen “TomCat - Refuelling”
    Each method that prints a message on the screen must display also the ID of
    the plane.

    Create inside a main method more variables that have the same type and
    refer to all existing planes.
 */

class Plane {
    private int planeId;
    private static int planeNr = 1;
    private int enginePower;

    public Plane(int power) {
        this.planeId = planeNr;
        planeNr++;
        this.enginePower = power;
    }

    public String getPlaneID() {
        return toString(planeId);
    }

    public String toString(Object i) {
        return i + "";
    }

    public int getTotalEnginePower() {
        return this.enginePower;
    }

    public void takeOff() {
        System.out.println(this.getPlaneID() + " takeOff");
    }

    public void land() {
        System.out.println(this.getPlaneID() + " land");
    }

    public void fly() {
        System.out.println(this.getPlaneID() + " fly");
    }
}

class PassengerPlane extends Plane {
    private int maxPassengers;

    public PassengerPlane(int power, int maxPassengers) {
        super(power);
        this.maxPassengers = maxPassengers;
    }

    public int getMaxPassengers() {
        return this.maxPassengers;
    }
}

class ConcordePassengerPlane extends PassengerPlane {

    public ConcordePassengerPlane(int power, int maxPassengers) {
        super(power, maxPassengers);
    }

    public void goSuperSonic() {
        System.out.println(this.getPlaneID() + " Supersonic mode activated");
    }

    public void goSubSonic() {
        System.out.println(this.getPlaneID() + " Supersonic mode deactivated");
    }
}

class FighterPlane extends Plane {

    public FighterPlane(int power) {
        super(power);
    }

    public void launchMissile() {
        System.out.println(this.getPlaneID() + " Launching rocket");
    }
}

class MIGPlane extends FighterPlane {

    public MIGPlane(int power) {
        super(power);
    }

    public void highSpeedGeometry() {
        System.out.println(this.getPlaneID() + " High speed selected geometry");
    }

    public void normalGeometry() {
        System.out.println(this.getPlaneID() + " Normal speed selected geometry");
    }
}

class TomCatPlane extends FighterPlane {

    public TomCatPlane(int power) {
        super(power);
    }

    public void refuel() {
        System.out.println(this.getPlaneID() + " Tomcat - Refuelling");
    }
}

class Ex1 {
    public static void main(String[] args) {
        Plane plane1 = new Plane(3);
        PassengerPlane passengerPlane = new PassengerPlane(3, 5);
        ConcordePassengerPlane concordePassengerPlane = new ConcordePassengerPlane(5, 6);
        PassengerPlane passengerPlane1 = new ConcordePassengerPlane(3, 4);
        FighterPlane fighterPlane = new FighterPlane(3);
        MIGPlane migPlane = new MIGPlane(7);
        TomCatPlane tomCatPlane = new TomCatPlane(10);

        plane1.fly();
        plane1.takeOff();
        plane1.land();
        System.out.println(plane1.getPlaneID());
        System.out.println(plane1.getTotalEnginePower());

        System.out.println(passengerPlane.getMaxPassengers());

        concordePassengerPlane.goSubSonic();
        concordePassengerPlane.goSuperSonic();

        fighterPlane.launchMissile();

        migPlane.highSpeedGeometry();
        migPlane.normalGeometry();

        tomCatPlane.refuel();

    }
}
