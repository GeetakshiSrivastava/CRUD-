package com.springboot.crud.controller;

import com.springboot.crud.model.CrudModel;
import com.springboot.crud.service.CrudService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class CrudController {
    @Autowired
    private CrudService service;



    @PostMapping("/users")
    public CrudModel addUser(@RequestBody CrudModel user){
        return service.addUser(user);
    }

    @GetMapping("/getDate")
    @CrossOrigin(origins = "http://localhost:8080")
    public List<CrudModel> getUser(){
        return service.fetchUser();
    }

    @GetMapping("/getDataById/{id}")
    public Optional<CrudModel> getDataById(@PathVariable int id){
        return service.getUserDataById(id);
    }
    @PutMapping("/UpdateUsers")
    public CrudModel updateUser(@RequestBody CrudModel user){
        return service.updateUser(user);
    }

    @DeleteMapping("/deleteDataById/{id}")
    public String deleteDataById(@PathVariable int id){
        return service.deleteById(id);
    }
}
