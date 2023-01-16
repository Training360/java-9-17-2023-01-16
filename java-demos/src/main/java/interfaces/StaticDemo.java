package interfaces;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.Duration;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class StaticDemo {

    public static void main(String[] args) {
        // Statikus gyártó metódus - optimális - flyweight
        int number = Integer.parseInt("123");

        // A null paraméterként való átadása nem javasolt
//        Student student1 = new Student("John Doe", null);
//        Student student2 = new Student(null, "jack@training.com");

        // Létrehozás statikus gyártó függvényekkel
        Student student1 = Student.createWithName("John Doe");
        Student student2 = Student.createWithEmail("jack@trainig.com");

        // Példa a statikus gyártó metódusra a Java SE-ben
        LocalDate date = LocalDate.of(2022, 1, 16);

        // Interfészekben statikus gyártó metódusok
        List<String> names = List.of("John Doe", "Jane Doe");

        //List<String> names = Arrays.asList("John Doe", "Jane Doe");

        //Path path = Paths.get("C:\\data.csv");
        // WindowsPath vagy LinuxPath példányt hoz létre
        Path path = Path.of("C:\\data.csv");

    }
}
