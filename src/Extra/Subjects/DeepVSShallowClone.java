package Extra.Subjects;

import java.io.*;

class Point implements Serializable {
    int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class DeepVSShallowClone {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Point original = new Point(1, 2);
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(original);
        oos.close();
        byte[] byteArray = baos.toByteArray();
        ByteArrayInputStream bais = new ByteArrayInputStream(byteArray);
        ObjectInputStream ois = new ObjectInputStream(bais);
        Point deepClone = (Point) ois.readObject();
        System.out.println("Original: " + original.x + " " + original.y);
        System.out.println("Deep Clone: " + deepClone.x + " " + deepClone.y);
        deepClone.x = 5;
        System.out.println("Original after modifying deep clone: " + original.x + " " + original.y);
    }
}



