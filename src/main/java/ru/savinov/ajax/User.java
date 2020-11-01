package ru.savinov.ajax;

import lombok.*;


import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "enabled")
    private Boolean enabled;

    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;

    public User(Boolean enabled, String username, String password) {
        this.enabled = enabled;
        this.username = username;
        this.password = password;
    }
}
