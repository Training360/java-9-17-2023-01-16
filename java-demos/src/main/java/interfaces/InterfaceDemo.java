package interfaces;

import java.util.ArrayList;
import java.util.List;

public class InterfaceDemo {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("John Doe");
        names.add("Jane Doe");

        // Copy constructor
        List<String> anotherNames = new ArrayList<>(names);
        System.out.println(anotherNames);

        // Ha módosítom a lemásolt listát, akkor nem változik az eredeti lista
        anotherNames.add("Jack Doe");
        System.out.println(anotherNames);

        System.out.println(names);
    }
}
