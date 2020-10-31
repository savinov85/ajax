package ru.savinov.ajax;

import lombok.Getter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {


    @GetMapping("/user")
    public User getTestUser() {
        return new User(1L, true, "user", "user");
    }

}
