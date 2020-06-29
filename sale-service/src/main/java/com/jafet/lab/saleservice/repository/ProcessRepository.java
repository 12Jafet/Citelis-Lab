package com.jafet.lab.saleservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jafet.lab.saleservice.models.Process;

@Repository
public interface ProcessRepository extends JpaRepository<Process, Integer>{

}

