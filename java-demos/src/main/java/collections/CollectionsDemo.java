package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CollectionsDemo {

    public static void main(String[] args) {
        // Arrays.asList() metódus által visszaadott lista nem bővíthető, de elemei módosíthatóak
        //List<String> names = Arrays.asList("John Doe", "Jane Doe");

        // List.of() metódus által visszaadott lista elemei sem módosíthatóak
        List<String> names = List.of("John Doe", "Jane Doe");

        //names.add("Jack Doe");
        // UnsupportedOperationException kivételt dob a set, hiszen módosíthatatlan
        names.set(0, "Jack Doe");
        //System.out.println(names);

        // Ha módosíthatót akarunk, copy constructort használunk
        List<Integer> numbers = new ArrayList<>(List.of(1, 2, 3));
    }
}
