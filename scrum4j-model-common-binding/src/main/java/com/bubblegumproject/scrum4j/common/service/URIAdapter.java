package com.bubblegumproject.scrum4j.common.service;

import java.net.URI;
import java.net.URISyntaxException;

public class URIAdapter {
	public static URI parseURI(String xmlValue) {
		try {
			return new URI(xmlValue);
		} catch (URISyntaxException e) {
			throw new RuntimeException(xmlValue + " is not a valid URI", e);
		}
	}
	
	public static String printURI(URI uri) {
		return uri.toString();
	}
}
