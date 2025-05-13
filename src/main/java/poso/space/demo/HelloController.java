package poso.space.demo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

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
}
