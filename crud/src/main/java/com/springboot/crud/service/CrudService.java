package com.springboot.crud.service;


import com.springboot.crud.model.CrudModel;
import com.springboot.crud.repo.CrudRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//import javax.xml.ws.Action;
import java.util.List;
import java.util.Optional;

@Service
public class CrudService {
    @Autowired
    private CrudRepo repo;

    public CrudModel addUser(CrudModel user) {
        return repo.save(user);
    }

    public List<CrudModel> fetchUser() {
        return repo.findAll();
    }

    public Optional<CrudModel> getUserDataById(int id) {
        return repo.findById(id);
    }

    public CrudModel updateUser(CrudModel user) {
        return repo.save(user);
    }

    public String deleteById(int id) {
        String output;

        try {
            repo.deleteById(id);
            output = "delete done...";
        } catch (Exception e) {
            output = "delete not done...";
        }
        return output;
    }
}







