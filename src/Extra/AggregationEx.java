package Extra;

class Address {
    private String city;
    private String state;
    private String country;

    public Address(String city, String state, String country) {
        this.city = city;
        this.state = state;
        this.country = country;
    }

    public String getCity() {
        return this.city;
    }

    public String getState() {
        return this.state;
    }

    public String getCountry() {
        return this.country;
    }
}

class Employee {
    private String name;
    private Address address; // aggregation

    public Employee(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public void display() {
        System.out.println(name + " lives in " + address.getCity() + ", " + address.getState() + ", " + address.getCountry());
    }
}

class AggregationEx {
    public static void main(String[] args) {
        Address address1 = new Address("Timisoara", "Timis", "Romania");
        Employee employee1 = new Employee("Ion", address1);
        employee1.display();
    }
}
