package com.jafet.lab.postsaleservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jafet.lab.postsaleservice.models.Channel;

@Repository
public interface ChannelRepository extends JpaRepository<Channel, Integer>{

}

