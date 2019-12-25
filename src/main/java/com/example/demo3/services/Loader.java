package com.example.demo3.services;

import com.example.demo3.entities.Collector;
import com.example.demo3.entities.nested.Nested1;
import com.example.demo3.entities.nested.Nested2;
import com.example.demo3.entities.nested.first.Nested11;
import com.example.demo3.entities.nested.first.Nested12;
import com.example.demo3.entities.nested.first.Nested13;
import com.example.demo3.entities.nested.second.Nested21;
import com.example.demo3.entities.nested.second.Nested22;
import com.example.demo3.entities.nested.second.Nested23;
import com.example.demo3.repositories.CollectorRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.PostConstruct;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Slf4j
@Service
@EnableScheduling
@RequiredArgsConstructor
public class Loader {
    private final CollectorRepository collectorRepository;

    @Scheduled(fixedDelay=1000000)
    //@Transactional
    public void afterInitialize(){
        List<Collector> all = collectorRepository.findAll();
        for (Collector collector: all){
            log.info(collector.getNested1().toString());
            log.info(collector.getNested2().toString());
            log.info(collector.getNested3().toString());
        }
        System.out.println("finished!");
    }

    @PostConstruct
    public void create(){
        Collector collector = new Collector();
        Nested1 nested1 = new Nested1();
        nested1.setNested11(Set.of(new Nested11()));
        nested1.setNested12(Set.of(new Nested12()));
        nested1.setNested13(Set.of(new Nested13()));

        Nested2 nested2 = new Nested2();
        nested2.setNested21(Set.of(new Nested21()));
        nested2.setNested22(Set.of(new Nested22()));
        nested2.setNested23(Set.of(new Nested23()));

        collector.setNested1(List.of(nested1));
        collector.setNested2(List.of(nested2));

        collectorRepository.save(collector);
    }
}
