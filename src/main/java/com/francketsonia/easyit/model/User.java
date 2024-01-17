package com.francketsonia.easyit.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "users")
@Getter
@Setter
@NoArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userID;

    @Column(length = 255)
    private String name;

    @Column(length = 255)
    private String first_name;

    @Column(length = 255)
    private String email;

    @Column(length = 255)
    private String password;

    @Column(length = 255)
    private String address;

    @Column(length = 15)
    private String phone;

}
