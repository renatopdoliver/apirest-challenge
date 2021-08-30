package com.rest.api.challenge.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rest.api.challenge.model.GrupoLiquidacaoModel;

@Repository
public interface GrupoLiquidacaoRepository extends JpaRepository<GrupoLiquidacaoModel, Integer>{

}