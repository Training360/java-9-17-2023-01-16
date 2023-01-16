package helloworld.frontend;

import helloworld.backend.api.HelloService;
import helloworld.backend.implementation.WelcomeHelloService;

public class HelloMain {

    public static void main(String[] args) {
        HelloService service = new WelcomeHelloService();
        System.out.println(service.sayHello("John Doe"));
    }
}
