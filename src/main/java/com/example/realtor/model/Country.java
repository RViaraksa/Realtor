package com.example.realtor.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
@Entity
public class Country {

    @Id()
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Please, enter country")
    private String name;

    @NotBlank(message = "Please, enter aplphaCode")
    @Size(min = 2, max = 2, message = "Alphacode contains 2 character: USA - us, Germany - de")
    private String alphaCode;
}
