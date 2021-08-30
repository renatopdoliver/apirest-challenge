package com.rest.api.challenge.controller;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.JacksonXmlModule;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.rest.api.challenge.model.DOCXmlModel;
import com.rest.api.challenge.repository.DOCXmlRepository;

@Component
public class PopulaBancoController {
		
	@Value("${xml.file.url}")
	Resource gitXmlFile;
	
	@Autowired
	private DOCXmlRepository docXmlRepository;
	
	@EventListener(ApplicationReadyEvent.class)
	public void runAfterStartup() throws IOException {
		InputStream file = gitXmlFile.getInputStream();
		String data = IOUtils.toString(file, StandardCharsets.UTF_8);
		JacksonXmlModule module = new JacksonXmlModule();
		module.setDefaultUseWrapper(false);
		ObjectMapper objectMapper = new XmlMapper();
		DOCXmlModel document  = objectMapper.readValue(data, DOCXmlModel.class);
		docXmlRepository.save(document);
	}
}