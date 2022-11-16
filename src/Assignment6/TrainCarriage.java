package Assignment6;

/*
    2 (optional). Create a class useful for modelling a train. Every train has
    maximum 15 carriages and the carriages are stored into an array. A
    carriage can be a PassengersCarA, a PassengersCarB or a LoadsCar.
    Every train contains maximum 15 carriages, regardless of their type
    (PassengersCarA, PassengersCarB or LoadsCar).
    PassengersCarA
    • maximum passengers capacity: 40
    • maximum packages capacity: 300
    • provides two services, for opening/closing the doors
    PassengersCarB
    • maximum passengers capacity: 50
    • maximum packages capacity: 400
    • provides two services, for opening/closing the doors
    • provides a service for blocking the windows
    LoadsCar
    • maximum packages capacity: 400
    • does not provides services for opening/closing the doors and blocking
    the windows
    Calling the services for opening/closing the doors and blocking the window
    prints a suitable message on the screen like “The windows were blocked”.
    Class Train contains a constructor with a variable number of parameters for
    setting the carriages of the train.
    Implement a proper method for testing if two trains are equal (we consider
    that two trains are equal if they can transport the same number of packages)
    and a method for printing the types of the existing carriages in the train.
    Implement the carriages with
    1) corresponding attributes for storing the maximum capacities (passengers,
    packages)
    2) without attributes for storing the maximum capacities (passengers,
    packages)
    What is the difference between the two implementations?
 */

class Train {
    private int maxCarriages = 15;
    public Carriage[] carriages;
    private static int currentCarriage = 0;
    private static int totalPackages = 0;

    public Train() {
        carriages = new Carriage[maxCarriages];
    }

    public void addCarriage(String type) {
        if (type.equals("PassengerCarA")) {
            carriages[currentCarriage] = new PassengerCarA();
            currentCarriage++;
            totalPackages += 300;
        }else if (type.equals("PassengerCarB")) {
            carriages[currentCarriage] = new PassengerCarB();
            currentCarriage++;
            totalPackages += 400;
        }else if (type.equals("LoadsCar")) {
            carriages[currentCarriage] = new LoadsCar();
            currentCarriage++;
            totalPackages += 400;
        }
    }

    public boolean equals(Object t){
        return (t instanceof Train) && ((Train)t).totalPackages == totalPackages;
    }
}

interface Carriage {

    void openDoors();
    void closeDoors();
    void blockWindows();
}

class PassengerCarA implements Carriage {
    public int maxPassCap = 40;
    public int maxPackCap = 300;

    @Override
    public void openDoors() {
        System.out.println("PassangerCarA door opened");
    }

    @Override
    public void closeDoors() {
        System.out.println("PassangerCarA door closed");
    }

    @Override
    public void blockWindows() {

    }
}

class PassengerCarB implements Carriage {
    public int maxPassCap = 50;
    public int maxPackCap = 400;

    @Override
    public void openDoors() {
        System.out.println("PassangerCarB door opened");
    }

    @Override
    public void closeDoors() {
        System.out.println("PassangerCarB door closed");
    }

    @Override
    public void blockWindows() {
        System.out.println("PassangerCarB windows blocked");
    }
}

class LoadsCar implements Carriage {
    public int maxPackCap = 400;

    @Override
    public void openDoors() {

    }

    @Override
    public void closeDoors() {

    }

    @Override
    public void blockWindows() {

    }
}

class TrainCarriage {
    public static void main(String[] args) {
        Train train1 = new Train();
        train1.addCarriage("LoadsCar");
        train1.addCarriage("PassengerCarA");
        train1.addCarriage("PassengerCarB");
        Train train2 = new Train();
        train2.addCarriage("LoadsCar");
        train2.addCarriage("PassengerCarA");
        train2.addCarriage("PassengerCarB");
        Train train3 = new Train();
        train3.addCarriage("LoadsCar");

        train1.carriages[0].blockWindows();
        train1.carriages[1].closeDoors();
        train1.carriages[2].blockWindows();

        System.out.println(train1.equals(train2));
        System.out.println(train1.equals(train3));
    }
}
