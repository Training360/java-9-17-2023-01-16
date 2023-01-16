import helloworld.backend.api.HelloService;

module helloworld.frontend {
    requires helloworld.backend;

    uses HelloService;
}