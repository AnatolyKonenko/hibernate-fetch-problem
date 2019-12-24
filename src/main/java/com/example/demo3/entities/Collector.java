package com.example.demo3.entities;

import com.example.demo3.entities.nested.Nested1;
import com.example.demo3.entities.nested.Nested2;
import com.example.demo3.entities.nested.Nested3;
import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Entity
@Data
public class Collector {
    @Id
    @GeneratedValue
    private Long id;



    @OneToMany(cascade = CascadeType.ALL)
    private Set<Nested1> nested1;
    @OneToMany(cascade = CascadeType.ALL)
    private Set<Nested2> nested2;
    @OneToMany(cascade = CascadeType.ALL)
    private Set<Nested3> nested3;
}
