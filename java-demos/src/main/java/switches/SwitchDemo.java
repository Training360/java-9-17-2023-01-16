package switches;

public class SwitchDemo {

    public static void main(String[] args) {
        // Olyan switch, hogy nem kell break
        int i = 1;
        switch (i) {
            case 1 -> System.out.println(1);
            case 2 -> System.out.println(2);
            case 3 -> System.out.println(3);
        }
    }
}
