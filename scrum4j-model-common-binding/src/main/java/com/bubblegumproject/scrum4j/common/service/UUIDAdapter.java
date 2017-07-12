package com.bubblegumproject.scrum4j.common.service;

import java.util.UUID;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class UUIDAdapter  extends XmlAdapter<String, UUID>{

	@Override
	public UUID unmarshal(String xmlValue)  throws Exception{
		return UUID.fromString(xmlValue);
	}
	
	@Override
	public String marshal(UUID value) throws Exception {
		return value.toString();
	}
	
}