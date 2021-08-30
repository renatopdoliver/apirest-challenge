package com.rest.api.challenge.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import lombok.Data;

@Data
@Entity
public class BCMSGModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column
	@JacksonXmlProperty(localName = "IdentdEmissor")
	private String identdEmissor;
	
	@Column
	@JacksonXmlProperty(localName = "IdentdDestinatario")
	private String identdDestinatario;
	
	@OneToOne(cascade=CascadeType.PERSIST)
	@JoinColumn(name = "GRUPO_SEQ_ID")
	@JacksonXmlProperty(localName = "Grupo_Seq")
	private GrupoSeqModel grupo_Seq;
	
	@Column
	@JacksonXmlProperty(localName = "DomSist")
	private String domSist;
	
	@Column
	@JacksonXmlProperty(localName = "NUOp")
	private String nUOp;

}