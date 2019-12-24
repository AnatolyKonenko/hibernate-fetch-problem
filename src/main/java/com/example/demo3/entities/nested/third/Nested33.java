package com.example.demo3.entities.nested.third;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
public class Nested33 {
    @Id
    @GeneratedValue
    private Long id;
}
