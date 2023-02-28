package Extra;

class Blocks {
    public Blocks() {
        System.out.println("constructor");
    }

    {
        System.out.println("Init block1");
    }

    static {
        System.out.println("Init block2");
    }
}

public class InitBlocksExtra {
    public static void main(String[] args) {
        Blocks block1 = new Blocks();
        Blocks block2 = new Blocks();
    }
}
