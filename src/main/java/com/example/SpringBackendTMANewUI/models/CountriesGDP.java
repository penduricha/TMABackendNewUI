package com.example.SpringBackendTMANewUI.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

import java.io.Serializable;

@Getter
@Entity
@Data
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class CountriesGDP implements Serializable {
    @Id
    private Long id;
    private String name;
    private double gDP;
    private String backgroundColor;
}
