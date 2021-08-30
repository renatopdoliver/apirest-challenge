package com.rest.api.challenge.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rest.api.challenge.model.GrupoLiquidProdtModel;

@Repository
public interface GrupoLiquidProdtRepository extends JpaRepository<GrupoLiquidProdtModel, Integer>{

}