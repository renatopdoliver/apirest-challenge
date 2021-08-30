package com.rest.api.challenge.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.api.challenge.model.GrupoLiquidacaoModel;
import com.rest.api.challenge.model.SLC0001Model;
import com.rest.api.challenge.repository.MovimentacaoRepository;

@Service
public class MovimentacaoService {
	
	@Autowired
	MovimentacaoRepository movimentacaoRepository;
	  
	public List<SLC0001Model> listaTodasMovimentacoes(){
		return movimentacaoRepository.findAll();
	}
	
	public SLC0001Model listaMovimentacaoPorId(Integer id){
		return movimentacaoRepository.findById(id).get();
	}
	
	public List<GrupoLiquidacaoModel> listaLiquidacoesPorIdDaMovimentacao(Integer id){
		SLC0001Model movimentacao = listaMovimentacaoPorId(id);
		return movimentacao.getGrupoLiquid();
	}
	
	public GrupoLiquidacaoModel listaLiquidacaoPorId(Integer idMov, Integer idLiquid){
		return movimentacaoRepository.findLiquidacaoById(idMov, idLiquid);
	}
	
}