package Extra;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test1 {

    public static void reverse(List<Integer> list) {
        Collections.reverse(list);
        System.out.println(list);
    }

    private static void myRecursiveFunction(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        myRecursiveFunction(n-1);
    }

    public static void main(String[] args) {
        myRecursiveFunction(10);

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);

        reverse(list);
    }
}

