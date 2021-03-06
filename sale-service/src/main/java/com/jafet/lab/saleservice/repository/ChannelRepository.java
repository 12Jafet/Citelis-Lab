package com.jafet.lab.saleservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jafet.lab.saleservice.models.Channel;

@Repository
public interface ChannelRepository extends JpaRepository<Channel, Integer>{

}

