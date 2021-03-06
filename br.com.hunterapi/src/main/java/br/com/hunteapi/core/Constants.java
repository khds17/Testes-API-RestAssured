package br.com.hunteapi.core;

import io.restassured.http.ContentType;

public interface Constants {
	String APP_BASE_URL = "https://api.hunter.io/v2";
	Integer APP_PORT = 443;
	String APP_BASE_PATH = "";
	ContentType APP_CONTENT_TYPE = ContentType.JSON;
	Long MAX_TIMEOUT = 5000L;

}
