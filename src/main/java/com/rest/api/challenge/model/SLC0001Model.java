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
public class SLC0001Model {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column
	@JacksonXmlProperty(localName = "CodMsg")
	private String codMsg;
	
	@Column
	@JacksonXmlProperty(localName = "NumCtrlSLC")
	private String numCtrlSLC;
	
	@Column
	@JacksonXmlProperty(localName = "ISPBIF")
	private String iSPBIF;
	
	@Column
	@JacksonXmlProperty(localName = "TpInf")
	private String tpInf;
	
	@OneToMany(cascade=CascadeType.PERSIST)
	@JoinColumn(name = "GRUPO_LIQUID_ID")
	@JacksonXmlElementWrapper(useWrapping = false)
	@JacksonXmlProperty(localName = "Grupo_SLC0001_Liquid")
	private List<GrupoLiquidacaoModel> grupoLiquid;
	
	@Column
	@JacksonXmlProperty(localName = "DtHrSLC")
	private String dtHrSLC;
	
	@Column
	@JacksonXmlProperty(localName = "DtMovto")
	private String dtMovto;

}