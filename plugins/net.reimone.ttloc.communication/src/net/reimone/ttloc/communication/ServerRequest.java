package net.reimone.ttloc.communication;

import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Map;
import java.util.Scanner;

import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.HttpParams;

public class ServerRequest {

	public static String sendPostRequest(String baseURL, String scriptURL, Map<String, String> parameters){
		String response = null;
		String urlString = baseURL + scriptURL;
		HttpClient client = new DefaultHttpClient();
		HttpParams params = client.getParams();
		try {
			URIBuilder builder = new URIBuilder(urlString);
			for (String key : parameters.keySet()) {
				String value = parameters.get(key);
				builder = builder.setParameter(key, value);
			}
			URI uri = builder.build();
			HttpPost postMethod = new HttpPost(uri);
			HttpResponse httpResponse = client.execute(postMethod);
			HttpEntity entity = httpResponse.getEntity();
			if(entity != null){
				Header header = entity.getContentType();
				InputStream content = entity.getContent();
				Scanner scanner = new Scanner(content);
				response = scanner.useDelimiter("\\A").next();
				scanner.close();
			}

		} catch (URISyntaxException e) {
			e.printStackTrace();
		} catch (ClientProtocolException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return response;
	}
}
