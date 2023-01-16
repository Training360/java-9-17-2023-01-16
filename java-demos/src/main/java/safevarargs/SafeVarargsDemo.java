package safevarargs;

import java.util.ArrayList;
import java.util.List;

public class SafeVarargsDemo {

    public static void main(String[] args) {
        // Példa a type erasure-re, azaz nem nekünk kell castolni, hanem a fordító (és nem a JVM) teszi meg helyettünk
//        List<String> names = new ArrayList<>();
//        names.add("John Doe");
//
//        String name = (String) names.get(0);

        List<String> names = new ArrayList<>();

        // List<String>-et nem lehet List<Object>-té castolni
        // List<Object> n1 = (List<Object>) names;

        // Raw type
        List items = names;

        items.add(12);

        // ClassCastExceptiont dob
        System.out.println((String) names.get(0));
    }
}
