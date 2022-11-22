package Extra;

class GetSet {

    // Member variable of this class
    private String name;

    // Method 1 - Getter
    public String getName() { return name; }

    // Method 2 - Setter
    public void setName(String N)
    {

        // This keyword refers to current instance itself
        this.name = N;
    }
}

class GettersAndSetters {
    public static void main(String[] args) {
        GetSet a = new GetSet();
        a.setName("da");
        System.out.println(a.getName());
    }
}
