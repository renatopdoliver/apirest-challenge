package com.rest.api.challenge.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import lombok.Data;

@Data
@Entity
@JacksonXmlRootElement(localName = "DOC")
public class DOCXmlModel {
		
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@JsonIgnore
	private int id;
	
	@OneToOne(cascade=CascadeType.PERSIST)
	@JoinColumn(name = "BCMSG_ID")
	@JacksonXmlProperty(localName = "BCMSG")
	private BCMSGModel bcMsg;
		
	@OneToOne(cascade=CascadeType.PERSIST)
	@JoinColumn(name = "SISMSG_ID")
	@JacksonXmlProperty(localName = "SISMSG")
	private SISMSGModel sisMsg;

}