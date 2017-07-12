package com.bubblegumproject.scrum4j.common.service;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class UTCTimestampAdapter extends XmlAdapter<String, Long> {

	@Override
	public Long unmarshal(String v) throws Exception {
		return Long.valueOf(v);
	}

	@Override
	public String marshal(Long v) throws Exception {
		return Long.toString(v.longValue());
	}
}