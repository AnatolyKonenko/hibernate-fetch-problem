package com.example.demo3.entities.nested.third;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class Nested31 {
    @Id
    @GeneratedValue
    private Long id;
}
