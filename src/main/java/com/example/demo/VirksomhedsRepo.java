package com.example.demo;

import org.springframework.data.repository.CrudRepository;

public interface VirksomhedsRepo extends CrudRepository<Virksomhed, Integer> {

    Iterable<Virksomhed> findByCVR(int CVR);

}
