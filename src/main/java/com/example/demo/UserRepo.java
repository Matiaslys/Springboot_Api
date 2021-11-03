package com.example.demo;

import org.springframework.data.repository.CrudRepository;

public interface UserRepo extends CrudRepository<User, Integer> {

    User findUserById(long id);

    Iterable<User> findByEmail(String email);

}
