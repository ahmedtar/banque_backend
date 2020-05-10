package com.ebanking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.ebanking.model.Compte;

@CrossOrigin(origins = "http://localhost:4200" , allowedHeaders = "http://localhost:4200")
@RepositoryRestResource
public interface CompteRepository extends JpaRepository<Compte, Long> {
	
}
