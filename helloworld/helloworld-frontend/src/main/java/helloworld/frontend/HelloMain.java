package helloworld.frontend;

import helloworld.backend.api.HelloService;

import java.util.ServiceLoader;

public class HelloMain {

    public static void main(String[] args) {
        HelloService service =
                ServiceLoader.load(HelloService.class).findFirst().orElseThrow();

        System.out.println(service.sayHello("John Doe"));
    }
}
