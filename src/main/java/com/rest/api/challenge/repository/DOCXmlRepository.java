package com.rest.api.challenge.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rest.api.challenge.model.DOCXmlModel;

@Repository
public interface DOCXmlRepository extends JpaRepository<DOCXmlModel, Integer>{

}