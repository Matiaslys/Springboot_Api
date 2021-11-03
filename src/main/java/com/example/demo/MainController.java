package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @Autowired
    private UserRepo userRepo;
    @Autowired
    private VirksomhedsRepo virksomhedsRepo;

    @RequestMapping(value = "greeting", method = RequestMethod.GET, produces = "text/plain")
    public String hello(@RequestParam(value = "name", defaultValue = "world") String name) {
        return "Hello " + name;
    }

    @RequestMapping(value = "user/add", method = RequestMethod.GET, produces = "text/plain")
    public String add(@RequestParam(value = "name") String name, @RequestParam(value = "email") String email) {
        User u = new User();
        u.setName(name);
        u.setEmail(email);
        userRepo.save(u);
        return "User saved with id: " + u.getId();
    }

    @RequestMapping(value = "user/all", method = RequestMethod.GET, produces = "application/json")
    public Iterable<User> find() {
        return userRepo.findAll();
    }

    @RequestMapping(value = "user/findAllBy", method = RequestMethod.GET, produces = "application/json")
    public Iterable<User> findAllBy(@Param("email") String email) {
        return userRepo.findByEmail(email);
    }

    @RequestMapping(value = "user/findUserBy", method = RequestMethod.GET, produces = "application/json")
    public User findUserBy(@Param("id") long id) {
        return userRepo.findUserById(id);
    }

    @RequestMapping(value = "corporation/all", method = RequestMethod.GET, produces = "application/json")
    public Iterable<Virksomhed> findCO() {
        return virksomhedsRepo.findAll();
    }

    @RequestMapping(value = "corporation/findByCVR", method = RequestMethod.GET, produces = "application/json")
    public Iterable<Virksomhed> findCoBy(@Param("cvr") int cvr) {
        return virksomhedsRepo.findByCVR(cvr);
    }
}
