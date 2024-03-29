package com.leandrokhalel.goomerlistarango.model;

import jakarta.persistence.Embeddable;
import lombok.*;

@Embeddable
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Address {

    private String state;
    private String city;
    private String street;
    private String district;
    private String number;
    private String postalCode;
    private String complement;
}
