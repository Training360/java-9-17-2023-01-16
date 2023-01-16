package interfaces;

public class Student {

    private String name;

    private String email;

    private Student(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public static Student createWithName(String name) {
        return new Student(name, null);
    }

    public static Student createWithEmail(String email) {
        return new Student(null, email);
    }
}
