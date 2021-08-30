package com.rest.api.challenge.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import lombok.Data;

@Data
@Entity
public class GrupoLiquidProdtModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column
	@JacksonXmlProperty(localName = "IdentdLinhaBilat")
	private String identdLinhaBilat;
	
	@Column
	@JacksonXmlProperty(localName = "TpDeb_Cred")
	private String tpDebCred;
	
	@Column
	@JacksonXmlProperty(localName = "ISPBIFCredtd")
	private String ispbifcredtd;
	
	@Column
	@JacksonXmlProperty(localName = "ISPBIFDebtd")
	private String ispbifdebtd;
	
	@Column
	@JacksonXmlProperty(localName = "VlrLanc")
	private String vlrLanc;
	
	@Column
	@JacksonXmlProperty(localName = "CNPJNLiqdantDebtd")
	private String cnpjnliqdantDebtd;
	
	@Column
	@JacksonXmlProperty(localName = "NomCliDebtd")
	private String nomCliDebtd;
	
	@Column
	@JacksonXmlProperty(localName = "CNPJNLiqdantCredtd")
	private String cnpjnliqdantCredtd;
	
	@Column
	@JacksonXmlProperty(localName = "NomCliCredtd")
	private String nomCliCredtd;
	
	@Column
	@JacksonXmlProperty(localName = "TpTranscSLC")
	private String tpTranscSLC;
	
}