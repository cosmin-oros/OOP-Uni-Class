package Assignment2;

class Engine {
    private int capacity;
    public Engine(int c) {
        capacity = c;
    }
    public void setCapacity(int c) {
        capacity = c;
    }
    public void print() {
        System.out.println("My capacity is " + capacity);
    }
}
