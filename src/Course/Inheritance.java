package Course;

class SuperClass{
    public int a;
    private int b;
    protected int c;
}

class SubClass extends SuperClass{
    public void method(SuperClass x){
        a = 1;
        /*b = 2;*/
        c = 3;

        x.a = 1;
        /*x.b = 2;*/
        x.c = 3;
    }
}

class Inheritance {
    public static void main(String[] args){
        SuperClass sp = new SubClass();
        SubClass sb = new SubClass();

        sp.a = 2;
        sp.c = 3;

        sb.a = 4;
        sb.c = 3;

        sb.method(sp);

        System.out.println(sp.a + " " + sp.c + " " + sb.a + " " + sb.c);
    }
}
