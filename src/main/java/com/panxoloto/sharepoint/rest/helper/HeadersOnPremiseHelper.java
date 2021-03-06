package com.panxoloto.sharepoint.rest.helper;

import org.apache.http.HttpHeaders;
import org.springframework.util.LinkedMultiValueMap;

public class HeadersOnPremiseHelper {

	/**
	 * @return
	 */
	public LinkedMultiValueMap<String, String> getGetHeaders(boolean includeAuthHeader) {
		LinkedMultiValueMap<String, String> headers = new LinkedMultiValueMap<>();
		headers.add("Accept", "application/json;odata=verbose");
		headers.add("X-ClientService-ClientTag", "SDK-JAVA");
		headers.add("X-FORMS_BASED_AUTH_ACCEPTED", "f");
		headers.add(HttpHeaders.USER_AGENT, "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1)");
	    return headers;
	}
	
	/**
	 * @param payloadStr
	 * @return
	 */
	public LinkedMultiValueMap<String, String> getPostHeaders(String payloadStr) {
		LinkedMultiValueMap<String, String> headers = new LinkedMultiValueMap<>();
		headers.add("Accept", "application/json;odata=verbose");
		headers.add("Content-Type", "application/json;odata=verbose");
		headers.add("Content-length", "" + payloadStr.getBytes().length);
		headers.add("X-ClientService-ClientTag", "SDK-JAVA");
		headers.add("X-FORMS_BASED_AUTH_ACCEPTED", "f");
		headers.add(HttpHeaders.USER_AGENT, "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1)");
	    return headers;
	}
	
	/**
	 * @param payloadStr
	 * @return
	 */
	public LinkedMultiValueMap<String, String> getUpdateHeaders(String payloadStr) {
		LinkedMultiValueMap<String, String> headers = new LinkedMultiValueMap<>();
		headers.add("Accept", "application/json;odata=verbose");
		headers.add("Content-Type", "application/json;odata=verbose");
		headers.add("Content-length", "" + payloadStr.getBytes().length);
		headers.add("X-ClientService-ClientTag", "SDK-JAVA");
		headers.add("X-HTTP-Method", "MERGE");
		headers.add("IF-Match", "*");
	    return headers;
	}
	
	/**
	 * @return
	 */
	public LinkedMultiValueMap<String, String> getDeleteHeaders() {
		LinkedMultiValueMap<String, String> headers = new LinkedMultiValueMap<>();
		headers.add("Accept", "application/json;odata=verbose");
		headers.add("X-ClientService-ClientTag", "SDK-JAVA");
	    headers.add("X-HTTP-Method", "DELETE");
	    headers.add("IF-Match", "*");
	    return headers;
	}
	
}
