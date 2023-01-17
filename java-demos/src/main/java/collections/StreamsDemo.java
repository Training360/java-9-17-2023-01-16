package collections;

import java.util.stream.Stream;

public class StreamsDemo {

    public static void main(String[] args) {
        // Az iterate két paraméteres metódusa már létezett Java 8-ban,
        // de 9-ben megjelent a három paraméteres formája
        Stream.iterate(1, i -> i + 1)
                .limit(10)
                .forEach(System.out::println);
    }
}
