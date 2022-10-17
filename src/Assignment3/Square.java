package Assignment3;

class Square {
    private int side;

    public Square(){
        this.side = 15;
    }

    public Square(int s){
        this.side = s;
    }

    public void PrintSquare(){
        System.out.println("Square area: " + (int)Math.pow(side, 2));
    }
}

class SquareMain{
    public static void main(String[] args){
        Square square1 = new Square();
        Square square2 = new Square(3);
        Square square3 = new Square(5);

        square1.PrintSquare();
        square2.PrintSquare();
        square3.PrintSquare();
    }
}
