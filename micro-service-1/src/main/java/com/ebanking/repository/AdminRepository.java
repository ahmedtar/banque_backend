package com.ebanking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.ebanking.model.Admin;

@CrossOrigin(origins = "http://localhost:4200" , allowedHeaders = "*") 
@RepositoryRestResource
public interface AdminRepository extends JpaRepository<Admin, Long>{


}
