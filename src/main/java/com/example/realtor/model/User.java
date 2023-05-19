package com.example.realtor.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

import java.util.Set;

@Data
@Entity
@Table(name = "usr")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Username cannot be empty")
    @Size(min = 5, message = "Username must be at least 5 character long")
    private String nickName;

    @NotBlank(message = "Password cannot be empty")
    private String password;

    private boolean active;
    private String activationCode;

    @Email(message = "Email isn't correct")
    @NotBlank(message = "Email cannot be empty")
    private String email;

    @NotBlank(message = "Bio cannot be empty")
    @Length(max = 256, message = "Message too long (more than 255 b)")
    private String bio;

    @ElementCollection(targetClass = Role.class, fetch = FetchType.EAGER)
    @CollectionTable(name = "user_role", joinColumns = @JoinColumn(name = "user_id"))
    @Enumerated(EnumType.STRING)
    private Set<Role> roles;
}
