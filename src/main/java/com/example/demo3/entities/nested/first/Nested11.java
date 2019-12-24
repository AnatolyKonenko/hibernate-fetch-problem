package com.example.demo3.entities.nested.first;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class Nested11 {
    @Id
    @GeneratedValue
    private Long id;
}
