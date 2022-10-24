package Course;

class MyException extends Exception{
    private static int instanceNo = 0;

    public MyException(String message) {
        super(message);
        instanceNo++;
    }

    public static int getInstanceNo() {
        return instanceNo;
    }

    public static void main(String[] args){
        MyException e;
        e = new MyException("first case");
        System.out.println(e.getMessage());
        System.out.println(e.getInstanceNo());

        e = new MyException("second case");
        System.out.println(e.getMessage());
        System.out.println(e.toString());

        e = new MyException("third case");
        e.printStackTrace();
        System.out.println(e.toString());
    }
}
