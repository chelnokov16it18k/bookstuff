package com.chelnokov.shelf.repository;

import com.chelnokov.shelf.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UsersRepository extends JpaRepository<User, Long> {

    Optional<User> findByEmail(String email);

    User getByLogin(String login);

    @Query("select u from User u ")
    List<User> getAll();
}
