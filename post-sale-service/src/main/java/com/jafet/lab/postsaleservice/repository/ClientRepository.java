package com.jafet.lab.postsaleservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jafet.lab.postsaleservice.models.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Integer>{

}

