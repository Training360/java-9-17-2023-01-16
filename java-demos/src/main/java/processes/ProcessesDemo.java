package processes;

public class ProcessesDemo {

    public static void main(String[] args) {
        // Op. rendszeren futó folyamatok listázása
        ProcessHandle
                .allProcesses()
                .forEach(p -> System.out.println(p.info()));
    }
}
