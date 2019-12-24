package com.example.demo3.entities.nested;

import com.example.demo3.entities.nested.second.Nested21;
import com.example.demo3.entities.nested.second.Nested22;
import com.example.demo3.entities.nested.second.Nested23;
import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Data
@Entity
public class Nested2 {
    @Id
    @GeneratedValue
    private Long id;

    @OneToMany(cascade = CascadeType.ALL)
    Set<Nested21> nested21;
    @OneToMany(cascade = CascadeType.ALL)
    Set<Nested22> nested22;
    @OneToMany(cascade = CascadeType.ALL)
    Set<Nested23> nested23;
}
