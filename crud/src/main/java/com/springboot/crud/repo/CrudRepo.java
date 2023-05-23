package com.springboot.crud.repo;

import com.springboot.crud.model.CrudModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CrudRepo extends JpaRepository<CrudModel,Integer> {
}
