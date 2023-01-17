package collections;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class UnmodifiableDemo {

    public static void main(String[] args) {
        Stream<String> names = Stream.of("John Doe", "Jack Doe", "Jane Doe");

        // Régen így gyűjtöttünk listába
//        List<String> result = names.collect(Collectors.toList());

        // toList a 16-os Javaban jelent meg, és unmodifiable listát hoz létre
//        List<String> result = names.toList();

        // 10-es Javaban
        List<String> result = names.collect(Collectors.toUnmodifiableList());
    }
}
