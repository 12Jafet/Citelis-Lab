package com.jafet.lab.postsaleservice.repository;

import java.util.List;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jafet.lab.postsaleservice.models.Addresse;
import com.jafet.lab.postsaleservice.models.Process;
import com.jafet.lab.postsaleservice.models.Seller;

@Repository
public interface AddresseRepository extends JpaRepository<Addresse, Integer>{
	
	@Cacheable(cacheNames = "addresse", key = "#process")  
	List<Addresse> findBySellerAndProcess(Seller seller, Process process);
	
}

