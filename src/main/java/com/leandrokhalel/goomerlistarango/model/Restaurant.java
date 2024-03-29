package com.leandrokhalel.goomerlistarango.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity(name = "restaurant")
@Table(name = "restaurant")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@EqualsAndHashCode(of = "id")
public class Restaurant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Embedded
    private Address address;

    @Lob
    @JsonIgnore
    private byte[] image;

    @OneToMany(mappedBy = "restaurant", cascade = CascadeType.ALL)
    private List<OpeningHour> openingHours;

    @OneToMany(mappedBy = "restaurant", cascade = CascadeType.ALL)
    @JsonIgnore
    private List<Product> products;
}
