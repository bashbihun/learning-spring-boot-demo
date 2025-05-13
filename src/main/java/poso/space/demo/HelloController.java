package poso.space.demo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello Wolrd";
    }

    @GetMapping("/welcome")
    public String welcome() {
        return "Selamat datang!";
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
}
