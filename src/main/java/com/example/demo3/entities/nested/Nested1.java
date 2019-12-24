package com.example.demo3.entities.nested;

import com.example.demo3.entities.nested.first.Nested11;
import com.example.demo3.entities.nested.first.Nested12;
import com.example.demo3.entities.nested.first.Nested13;
import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Entity
@Data
public class Nested1 {
    @Id
    @GeneratedValue
    private Long id;

    @OneToMany(cascade = CascadeType.ALL)
    private Set<Nested11> nested11;
    @OneToMany(cascade = CascadeType.ALL)
    private Set<Nested12> nested12;
    @OneToMany(cascade = CascadeType.ALL)
    private Set<Nested13> nested13;
}
