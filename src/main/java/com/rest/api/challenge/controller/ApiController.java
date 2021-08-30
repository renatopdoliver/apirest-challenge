package com.rest.api.challenge.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.rest.api.challenge.model.GrupoLiquidacaoModel;
import com.rest.api.challenge.model.GrupoProdutoModel;
import com.rest.api.challenge.model.SLC0001Model;
import com.rest.api.challenge.repository.GrupoProdutoRepository;
import com.rest.api.challenge.service.MovimentacaoService;

@RestController
public class ApiController {
    	
	@Autowired
	private MovimentacaoService movimentacaoService;
	
	@GetMapping(value = "/v1/movimentacoes", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<SLC0001Model>> getMovimentacoes(){
		List<SLC0001Model> movimentacoes = movimentacaoService.listaTodasMovimentacoes();
		return new ResponseEntity<>(movimentacoes, HttpStatus.OK);
	}
	
	@GetMapping(value = "/v1/movimentacao/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<SLC0001Model> getMovimentacaoPorId(@PathVariable("id") Integer id){
		SLC0001Model movimentacao = movimentacaoService.listaMovimentacaoPorId(id);
		return new ResponseEntity<>(movimentacao, HttpStatus.OK);
	}
	
	@GetMapping(value = "/v1/movimentacao/{id}/liquidacoes", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<GrupoLiquidacaoModel>> getLiquidacoesPeloIdDaMovimentacao(@PathVariable("id") Integer id){
		List<GrupoLiquidacaoModel> liquidadoes = movimentacaoService.listaLiquidacoesPorIdDaMovimentacao(id);
		return new ResponseEntity<>(liquidadoes, HttpStatus.OK);
	}
	
	@GetMapping(value = "/v1/movimentacao/{idMovimentacao}/liquidacao/{idLiquidacao}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<GrupoLiquidacaoModel> getLiquidacoesPeloId(@PathVariable("idMovimentacao") Integer idMovimentacao, @PathVariable("idLiquidacao") Integer idLiquidacao){
		GrupoLiquidacaoModel liquidacao = movimentacaoService.listaLiquidacaoPorId(idMovimentacao, idLiquidacao);
		return new ResponseEntity<>(liquidacao, HttpStatus.OK);
	}
	
	@GetMapping(value = "/v1/movimentacao/{idMovimentacao}/liquidacao/{idLiquidacao}/produtos", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<GrupoProdutoModel>> getProdutosPeloIdDaLiquidacao(@PathVariable("idMovimentacao") Integer idMovimentacao, @PathVariable("idLiquidacao") Integer idLiquidacao){
		List<GrupoProdutoModel> produtos = movimentacaoService.listaProdutos(idMovimentacao, idLiquidacao);
		return new ResponseEntity<>(produtos, HttpStatus.OK);
	}
	
	@GetMapping(value = "/v1/movimentacao/{idMovimentacao}/liquidacao/{idLiquidacao}/produto/{idProduto}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<GrupoProdutoModel> getProdutosPeloId(@PathVariable("idMovimentacao") Integer idMovimentacao, @PathVariable("idLiquidacao") Integer idLiquidacao, @PathVariable("idProduto") Integer idProduto){
		GrupoProdutoModel produto = movimentacaoService.listaProdutoPorId(idMovimentacao, idProduto, idProduto);
		return new ResponseEntity<>(produto, HttpStatus.OK);
	}
}