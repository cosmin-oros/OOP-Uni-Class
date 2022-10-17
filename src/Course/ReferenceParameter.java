package Course;

public class ReferenceParameter {

    public static void sendReferenceParameter1(OverloadedConstructors o){
        o.setValue(10);
    }

    public static void sendReferenceParameter2(OverloadedConstructors o){
        o = new OverloadedConstructors(50);
    }

    public static void main(String[] args){
        OverloadedConstructors v = new OverloadedConstructors(5);

        v.print();

        sendReferenceParameter1(v);
        v.print();

        sendReferenceParameter2(v);
        // v will still be 10
        v.print();
    }
}
