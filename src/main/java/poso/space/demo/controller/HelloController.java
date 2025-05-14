package poso.space.demo.controller;

import org.springframework.web.bind.annotation.RestController;

import poso.space.demo.RegisterRequest;
import poso.space.demo.dto.GreetingRequest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class HelloController {

    @Value("${app.welcome.message}")
    private String welcomeMessage;

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello Wolrd";
    }

    @GetMapping("/welcome")
    public String welcome() {
        return welcomeMessage;
    }

    @GetMapping("/greet/{name}")
    public String greet(@PathVariable String name) {
        return "Hello " + name + "!";
    }

    @GetMapping("/user/{id}")
    public String userId(@PathVariable String id) {
        return "User ID: " + id;
    }

    @PostMapping("/greet")
    public String greetPost(@RequestBody GreetingRequest request) {
        return "hallo " + request.getName() + "!";
    }

    @PostMapping("/register")
    public String register(@RequestBody RegisterRequest request) {
        return "Registrasi berhasil untuk " + request.getUserName();
    }

    @Value("${app.version}")
    private String versionApp;

    @GetMapping("/version")
    public String getVersion() {
        return "version aplikasi " + versionApp;
    }
}
