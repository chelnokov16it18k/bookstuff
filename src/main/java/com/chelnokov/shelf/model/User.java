package com.chelnokov.shelf.model;

import lombok.*;

import javax.persistence.*;
@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "email")
    private String email;
    @Column(name = "login")
    private String login;
    @Column(name = "password")
    private String password;
    @Transient
    private String passwordConfirm;
    @Enumerated(value=EnumType.STRING)
    @Column(name="role")
    private Role role;
    @Enumerated(value=EnumType.STRING)
    @Column(name="status")
    private Status status;
}
