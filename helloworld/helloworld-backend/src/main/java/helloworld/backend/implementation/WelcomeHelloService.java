package helloworld.backend.implementation;

import helloworld.backend.api.HelloService;

public class WelcomeHelloService implements HelloService {

    @Override
    public String sayHello(String name) {
        return "Welcome %s".formatted(name);
    }
}
