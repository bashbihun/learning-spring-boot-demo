package poso.space.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import poso.space.demo.dto.UserRequest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/users/")
public class UserController {

    @PostMapping("/register")
    public String registerUser(@RequestBody UserRequest request) {
        return "Registrasi berhasil untuk " + request.getUsername() + " dengan email " + request.getEmail();
    }

    @GetMapping("/{id}")
    public String getUser(@PathVariable String id) {
        return "Data pengguna dengan ID: " + id;
    }

    @GetMapping("/username/{username}")
    public String getUserByUsername(@PathVariable String username) {
        return "pengguna ditemukan " + username;
    }

    @Value("${app.registration.message}")
    private String registrationMessage;

    @PostMapping("/register2")
    public String registerUser2(@RequestBody UserRequest request) {
        return registrationMessage + " " + request.getUsername() + " ( " + request.getEmail() + ")";
    }

}
