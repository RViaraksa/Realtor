package com.example.realtor.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
@Entity
public class Flat {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    private Address address;

    @NotBlank(message = "Enter price")
    private Integer price;

    @NotBlank(message = "Enter rooms count")
    private Integer rooms;

    @NotBlank(message = "Enter floor")
    private Integer floor;

    @NotBlank(message = "There is separate kitchen")
    private Boolean separateKitchen;

    @NotBlank(message = "There is parking place")
    private Boolean parkingPlace;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User owner;
}
