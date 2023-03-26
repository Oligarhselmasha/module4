package ru.practicum.user;

import lombok.Data;

import javax.persistence.*;
@Entity
@Data
@Table(name = "usersDto", schema = "public")
public class UserDto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String email;

    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "registration_date")
    private String registrationDate;

    @Enumerated(EnumType.STRING)
    private UserState state;
}
