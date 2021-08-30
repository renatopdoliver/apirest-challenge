package com.rest.api.challenge.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import lombok.Data;

@Data
@Entity
public class GrupoSeqModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@JsonIgnore
	private int id;
	
	@OneToOne(mappedBy = "grupo_Seq" )
	@JoinColumn(name = "BCMSG_ID")
	@JsonIgnore
	private BCMSGModel bcMsg;
	
	@Column
	@JacksonXmlProperty(localName = "NumSeq")
	private String numSeq;
	
	@Column
	@JacksonXmlProperty(localName = "IndrCont")
	private String indrCont;

}