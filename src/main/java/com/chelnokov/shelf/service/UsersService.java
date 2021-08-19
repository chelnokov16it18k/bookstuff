package com.chelnokov.shelf.service;

import com.chelnokov.shelf.model.User;
import com.chelnokov.shelf.repository.UsersRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsersService {

    private final UsersRepository usersRepository;

    public UsersService(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }

    public User getByLogin(String login){
        return usersRepository.getByLogin(login);
    }

    public List<User> getAll(){
        return usersRepository.getAll();
    }
}
