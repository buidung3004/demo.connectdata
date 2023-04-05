package com.example.connectmysql.demo.connectdata.User;

import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private String email;
    private String firstName;
    private String lastName;

}
