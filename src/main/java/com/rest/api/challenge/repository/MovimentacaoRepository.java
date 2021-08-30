package com.rest.api.challenge.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.rest.api.challenge.model.GrupoLiquidacaoModel;
import com.rest.api.challenge.model.GrupoProdutoModel;

@Repository
public interface MovimentacaoRepository extends SLC0001Repository {
	  	@Query("SELECT l FROM SLC0001Model m JOIN m.grupoLiquid l WHERE m.id = ?1 AND l.id = ?2")
	  	GrupoLiquidacaoModel findLiquidacaoById(@Param("idMovimentacao") Integer idMovimentacao, @Param("idLiquidacao") Integer idLiquidacao);
	  	
	  	@Query("SELECT p FROM SLC0001Model m JOIN m.grupoLiquid l JOIN l.produto p WHERE m.id = ?1 AND l.id = ?2 AND p.id = ?3")
	  	GrupoProdutoModel findProdutoById(@Param("idMovimentacao") Integer idMovimentacao, @Param("idLiquidacao") Integer idLiquidacao, @Param("idProduto") Integer idProduto);
	  	
}