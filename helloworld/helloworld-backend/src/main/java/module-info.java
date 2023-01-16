import helloworld.backend.api.HelloService;
import helloworld.backend.implementation.WelcomeHelloService;

module helloworld.backend {

    exports helloworld.backend.api;

    provides HelloService with WelcomeHelloService;
}