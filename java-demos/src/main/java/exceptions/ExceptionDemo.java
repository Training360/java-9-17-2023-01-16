package exceptions;

import java.util.Optional;

public class ExceptionDemo {

    public static void main(String[] args) {
        // Azért kell Supplier, mert csak akkor példányosítja az exceptiont, ha tényleg szükség van rá
        Optional.of("name").orElseThrow(() -> new IllegalStateException("empty"));
    }
}
