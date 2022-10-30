package Course.package2;

class A2 {
    public void methodA2() {
        Course.package1.A1 ob = new Course.package1.A1();
        /*ob.x = 1;*/ //Eroare
        ob.y = 1;
        /*ob.z = 1;*/ //Eroare
        /*ob.t = 1;*/ //Eroare
    }
}

class B2 extends Course.package1.A1 {
    public B2() {
        /*x = 1;*/ //Error
        y = 1;
        z = 1;
        /*t = 1;*/ //Error
    }
    public void methodB2() {
        Course.package1.A1 ob = new Course.package1.A1();
        /*ob.x = 1;*/ //Error
        ob.y = 1;
        /*ob.z = 1;*/ //Error
        /*ob.t = 1;*/ //Error
    }
}

class File2 {
    public static void main(String[] args){
        A2 a2 = new A2();
        B2 b2 = new B2();

        a2.methodA2();
        b2.methodB2();
    }
}
