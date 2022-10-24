package Course;

class RealNumbers{
    private double[] sir = new double[100];
    private int nr = 0;
    private boolean exception = false;

    public boolean testException(){
        return exception;
    }

    public boolean add(double x){
        if (nr == sir.length){
            return false;
        }
        sir[nr] = x;
        nr++;
        return true;
    }

    public double extractAfter(double x){
        int i;
        for (i = 0; i < nr; i++){
            if (sir[i] == x){
                double result = sir[i+1];
                for (int j = i+1; j < nr-1; j++){
                    sir[j] = sir[j+1];
                }

                nr--;
                exception = false;
                return result;
            }else{
                exception = true;
                return -2;
            }
        }
        exception = true;
        return -1;
    }

}

class Util{
    private static boolean notFound = false;
    public static boolean elementLipsa() {
        return notFound;
    }

    public static double medie(double x, RealNumbers sir) {
        double medie = sir.extractAfter(x);
        notFound = false;
        if(sir.testException()) {
            if(medie == -1) {
                notFound = true;
                return 0;
            } else {
                notFound = false;
                return 0;
            }
        }
        for(int i = 1; i < 10; i++) {
            double tmp = sir.extractAfter(x);
            if(!sir.testException()) {
                medie+= tmp;
            } else {
                medie = 0;
                break;
            }
        }
        return medie / 10;
    }
}

class ExceptionHandling1 {
    public static void main(String[] args){
        RealNumbers r = new RealNumbers();
        r.add(1.0);
        r.add(2.0);
        System.out.println(r.testException());
        System.out.println(r.extractAfter(1.0));
        r.testException();
        r.add(3);
        System.out.println(r.extractAfter(1.0));
        r.testException();
    }
}
