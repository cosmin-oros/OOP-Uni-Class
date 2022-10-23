package Course;

interface Expresie {
    Expresie calculDerivata();
}

class Constanta implements Expresie {
    private double valoare;
    public Constanta(double valoare) {
        this.valoare = valoare;
    }
    public Expresie calculDerivata() {
        return new Constanta(0);
    }
    public String toString() {
        return valoare + "";
    }
}

class Variabila implements Expresie {
    public Expresie calculDerivata() {
        return new Constanta(1);
    }
    public String toString() {
        return "x";
    }
}

// declared as abstract because we don't need to instantiate it
abstract class ExpresieBinara implements Expresie {
    protected Expresie st,dr;
    public ExpresieBinara(Expresie st, Expresie dr) {
        this.st = st;
        this.dr = dr;
    }
}

class Suma extends ExpresieBinara {
    public Suma(Expresie st, Expresie dr) {
        super(st,dr);
    }
    public Expresie calculDerivata() {
        return new Suma(st.calculDerivata(),dr.calculDerivata());
    }
    public String toString() {
        return "(" + st.toString() + " + " + dr.toString() + ")";
    }
}

class Inmultire extends ExpresieBinara {
    public Inmultire(Expresie st, Expresie dr) {
        super(st,dr);
    }
    public Expresie calculDerivata() {
        Expresie t1 = new Inmultire(st,dr.calculDerivata());
        Expresie t2 = new Inmultire(st.calculDerivata(),dr);
        return new Suma(t1,t2);
    }
    public String toString() {
        return "(" + st.toString() + " * " + dr.toString() + ")";
    }
}

class InterfacesEx2 {
    public static void main(String[] args){
        Constanta c1 = new Constanta(1);
        Variabila v1 = new Variabila();
        Variabila v2 = new Variabila();
        Inmultire i1 = new Inmultire(v1,v2);
        Suma exp = new Suma(c1,i1);
        System.out.println(exp);

        Expresie deriv1 = exp.calculDerivata();
        System.out.println(deriv1);

        Expresie deriv2 = deriv1.calculDerivata();
        System.out.println(deriv2);
    }
}
