package com.chelnokov.shelf.controller;

import com.chelnokov.shelf.model.User;
import com.chelnokov.shelf.service.UsersService;
import org.springframework.http.MediaType;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/users")
public class UsersController {

    private final UsersService usersService;

    public UsersController(UsersService usersService) {
        this.usersService = usersService;
    }

    @GetMapping(path = "/hi", produces = MediaType.APPLICATION_JSON_VALUE)
    public String hi() {
        return "hi";
    }

    @PreAuthorize("hasAuthority('books:read')")
    @GetMapping(path="/getAll", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<User> getAll(){
        return usersService.getAll();
    }

    @GetMapping(path="/getByLogin", produces = MediaType.APPLICATION_JSON_VALUE)
    public User getByLogin(String login){
        return usersService.getByLogin(login);
    }
}
