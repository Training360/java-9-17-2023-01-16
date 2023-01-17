package io;

import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

public class IoDemo {

    public static void main(String[] args) throws IOException {
        // Az UTF-8 a StandardCharsets osztályban található meg
        var reader = new FileReader("src/main/resources/data.txt", StandardCharsets.UTF_8);

        // Files.readString metódus egyben beolvas egy fájlt
        var content = Files.readString(Path.of("src/main/resources/data.txt"));
        System.out.println(content);

        // Be lehet olvasni a fájlt a Files.lines metódussal úgy, hogy a
        // sorok stream-jét adja vissza
        // Ilyenkor a streamet be kell zárni, ami lezárja a fájlt is
        var lines = Files.lines(Path.of("src/main/resources/data.txt"));
        try (lines) {
            lines
                    .filter(s -> !s.contains("jelszó"))
                    .forEach(System.out::println);
        }


    }
}
