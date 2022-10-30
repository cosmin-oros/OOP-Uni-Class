package Course.package1;

public class A1 {
    private int x;
    public int y;
    protected int z;
    int t;
}

class B1 {
    public void methodB1() {
        A1 ob = new A1();
//        ob.x = 1;     error
        ob.y = 1;
        ob.z = 1;
        ob.t = 1;
    }
}
