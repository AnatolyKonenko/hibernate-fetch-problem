package com.example.demo3.entities.nested;

import com.example.demo3.entities.nested.third.Nested31;
import com.example.demo3.entities.nested.third.Nested32;
import com.example.demo3.entities.nested.third.Nested33;
import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Data
@Entity
public class Nested3 {
    @Id
    @GeneratedValue
    private Long id;

    @OneToMany(cascade = CascadeType.ALL)
    Set<Nested31> nested31;
    @OneToMany(cascade = CascadeType.ALL)
    Set<Nested32> nested32;
    @OneToMany(cascade = CascadeType.ALL)
    Set<Nested33> nested33;
}
