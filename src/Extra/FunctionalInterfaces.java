package Extra;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionalInterfaces {
    public static void main(String[] args) {
        Converter<String, Integer> converter = (from) -> Integer.valueOf(from);
        Integer converted = converter.convert("123");
        System.out.println(converted);    // 123

        Predicate<Integer> isEven = (n) -> n % 2 == 0;
        System.out.println(isEven.test(4));    // true
        System.out.println(isEven.test(5));    // false

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        Consumer<Integer> printer = (n) -> System.out.print(n + " ");
        numbers.forEach(printer);    // 1 2 3 4 5

        Supplier<Double> random = () -> Math.random();
        System.out.println(random.get());    // a random double between 0 and 1


    }
}

@FunctionalInterface
interface Converter<F, T> {
    T convert(F from);
}