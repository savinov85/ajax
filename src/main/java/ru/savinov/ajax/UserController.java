package ru.savinov.ajax;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;


    @GetMapping("/user")
    public User getTestUser() {
        return userRepository.findById(1L).get();
    }

}
