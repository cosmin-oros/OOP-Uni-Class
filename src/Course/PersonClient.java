package Course;

import java.util.Random;

class Person{
    private String firstName, lastName;
    protected Random random;
    protected int maxRandomValue = 25;

    public Person(String firstName, String lastName, int maxRandomValue){
        this.firstName = firstName;
        this.lastName = lastName;

        random = new Random();
        this.maxRandomValue = maxRandomValue;
    }

    public Person(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        this.maxRandomValue = 7;
    }
}

class PersonTwo extends Person{
    public PersonTwo(String firstName, String lastName, int maxRandomValue){
        super(firstName, lastName, maxRandomValue);
    }

    public PersonTwo(String firstName, String lastName){
        super(firstName, lastName);
    }

    public int[] thinkOfTwoNrs(){
        int[] nrs = new int[2];

        try {
            nrs[0] = random.nextInt(maxRandomValue);
            nrs[1] = random.nextInt(maxRandomValue);
        }catch (NullPointerException e){

        }

        return nrs;
    }
}

class PersonClient {
    public static void main(String[] args){
        Person person = new Person("John", "Ion");
        PersonTwo person2 = new PersonTwo("Dani", "Mocanu");

        int[] nrs = person2.thinkOfTwoNrs();
        System.out.println(nrs[0] + " " + nrs[1]);
    }
}
