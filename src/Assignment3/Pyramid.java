package Assignment3;

class Pyramid {
    private int pyrVal;

    // default constructor
    public Pyramid(){
        pyrVal = 0;
    }

    public Pyramid(int val){
        this.pyrVal = val;
    }

    public void printPyramid(){
        for (int i = pyrVal; i > 0; i--){
            for (int j = i; j > 0; j--){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}

class PyramidMain{
    public static void main(String[] args){
        Pyramid pyramid = new Pyramid();
        Pyramid pyramid1 = new Pyramid(4);
        Pyramid pyramid2 = new Pyramid(6);

        pyramid.printPyramid();
        pyramid1.printPyramid();
        pyramid2.printPyramid();
    }
}