package com.rest.api.challenge.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rest.api.challenge.model.GrupoProdutoModel;

@Repository
public interface GrupoProdutoRepository extends JpaRepository<GrupoProdutoModel, Integer>{

}