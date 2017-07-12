package com.bubblegumproject.scrum4j.common.service;

import javax.xml.bind.annotation.adapters.XmlAdapter;

import de.slub.urn.URN;

public class URNAdapter extends XmlAdapter<String, URN> {

	@Override
	public URN unmarshal(String v) throws Exception {
		return URN.fromString(v);
	}

	@Override
	public String marshal(URN v) throws Exception {
		return v.toString();
	}

}
