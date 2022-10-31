package Course;

class FirPuneNumere extends Thread {
    private Container c;
    public FirPuneNumere(Container c) {
        this.c = c;
    }
    public void run() {
        int i = 0;
        while(true) {
            i++;
            c.pune(i % 1000);
        }
    }
}

class FirExtrageNumere extends Thread {
    private Container c;
    public FirExtrageNumere(Container c) {
        this.c = c;
    }
    public void run() {
        while(true) { System.out.println(c.extrage());}
    }
}

class ProgramTest {
    public static void main(String[] argv) {
        Container c = new Container();
        new FirPuneNumere(c).start();
        new FirExtrageNumere(c).start();
    }
}

class Container {
    private int element;
    private boolean existaNumar = false;
    public synchronized void pune(int l) {
        while(existaNumar) {
            try { wait(); //astept indeplinirea conditiei "container gol"
            } catch(InterruptedException e) {}
        }
        element = l;
        existaNumar = true; //am pus un numar deci nu mai
        //e loc de altul
        notifyAll(); //Anunta indeplinirea conditiei "container plin"
        //Toate firele ce sunt blocate in acest moment in wait-
        //ul din metoda extrage se pregatesc sa revina din el
        }
    public synchronized int extrage() {
            while(!existaNumar) {
                try { wait(); //astept indeplinirea conditiei "container plin"
                } catch(InterruptedException e) {}
            }
            existaNumar = false; //scot numarul, deci nu mai e nimic
    //in container
            notifyAll(); //Anunta indeplinirea conditiei "container gol"
    //Toate firele ce asteapta in acest moment la wait-ul
    //din metoda pune se pregatesc sa revina din el
        return element;
    }
}