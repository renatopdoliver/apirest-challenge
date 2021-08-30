package com.rest.api.challenge.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import lombok.Data;

@Data
@Entity
public class GrupoLiquidacaoModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column
	@JacksonXmlProperty(localName = "DtLiquid")
	private String dtLiquid;
	
	@Column
	@JacksonXmlProperty(localName = "NumSeqCicloLiquid")
	private String numSeqCicloLiquid;
	
	@OneToMany(cascade=CascadeType.PERSIST)
	@JoinColumn(name = "GRUPO_PRODUCT_ID")
	@JacksonXmlElementWrapper(useWrapping = false)
	@JacksonXmlProperty(localName = "Grupo_SLC0001_Prodt")
	private List<GrupoProdutoModel> produto;
	
}