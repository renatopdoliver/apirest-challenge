package com.rest.api.challenge.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rest.api.challenge.model.SLC0001Model;

@Repository
public interface SLC0001Repository extends JpaRepository<SLC0001Model, Integer>{

}