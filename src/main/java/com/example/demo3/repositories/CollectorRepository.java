package com.example.demo3.repositories;

import com.example.demo3.entities.Collector;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CollectorRepository extends JpaRepository<Collector,Long> {

    @EntityGraph(attributePaths = {"nested1","nested2","nested3","nested1.nested11"})
    List<Collector> findAll();
}
