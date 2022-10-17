package Course;

public class OverloadedConstructors {
    private int val;

    public OverloadedConstructors(){
        val = 0;
    }

    public OverloadedConstructors(int v){
        val = v;
    }

    // accessor method
    public void setValue(int v){
        val = v;
    }

    public void print(){
        System.out.println("My value is: " + val);
    }

    public boolean equals(Object o){
        return (o instanceof OverloadedConstructors) && ((OverloadedConstructors)o).val == val;
    }

    protected void finalize() throws Throwable{
        System.out.println("Destroying...");
    }
}

class OverloadedConstructorsMain{
    public static void main(String[] args){
        OverloadedConstructors v1 = new OverloadedConstructors();
        OverloadedConstructors v2 = new OverloadedConstructors(2);

        v1.print();
        v2.print();

        v1.setValue(5);
        v2.setValue(10);

        v1.print();
        v2.print();

        System.out.println(v1.equals(v2));

        System.gc();

        for (int i = 1; i < 10000; i++){
            v1 = new OverloadedConstructors(25);
        }
    }
}
