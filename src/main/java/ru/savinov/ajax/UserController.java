package ru.savinov.ajax;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;


    @GetMapping("/user")
    public List<User> getTestUser() {
        List<User> userList = new ArrayList<>();
        userRepository.findAll().forEach(userList::add);
        return userList;
    }

    @PostMapping("/add_user")
    public @ResponseBody User addUser(@RequestBody User user) {
        userRepository.save(user);
        return user;
    }
}
