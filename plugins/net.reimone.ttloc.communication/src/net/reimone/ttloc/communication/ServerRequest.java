package net.reimone.ttloc.communication;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;

public class ServerRequest {

	public static String sendPostRequest(String baseURL, String scriptURL, Map<String, String> parameters){
		String stringResponse = "";
		String urlString = baseURL + scriptURL;
		HttpClient client = new DefaultHttpClient();
		HttpPost post = new HttpPost(urlString);
		try {
			List<NameValuePair> nameValuePairs = new ArrayList<NameValuePair>();
			for (String key : parameters.keySet()) {
				String value = parameters.get(key);
				nameValuePairs.add(new BasicNameValuePair(key, value));
			}
			post.setEntity(new UrlEncodedFormEntity(nameValuePairs));
			HttpResponse response = client.execute(post);
			
			InputStream content = response.getEntity().getContent();
			Scanner scanner = new Scanner(content);
			stringResponse = scanner.useDelimiter("\\A").next();
			scanner.close();
			
//			BufferedReader rd = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));
//
//			String line = "";
//			while ((line = rd.readLine()) != null) {
//				System.out.println(line);
//				if (line.startsWith("Auth=")) {
//					String key = line.substring(5);
//					// Do something with the key
//				}
//				stringResponse += line;
//			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return stringResponse;
	}
	
//	public static String sendPostRequest(String baseURL, String scriptURL, Map<String, String> parameters){
//		String response = null;
//		String urlString = baseURL + scriptURL;
//		HttpClient client = new DefaultHttpClient();
//		HttpParams params = client.getParams();
//		try {
//			URIBuilder builder = new URIBuilder(urlString);
//			for (String key : parameters.keySet()) {
//				String value = parameters.get(key);
//				builder = builder.setParameter(key, value);
//			}
//			URI uri = builder.build();
//			HttpPost postMethod = new HttpPost(uri);
////			HttpGet postMethod = new HttpGet(uri);
//			HttpResponse httpResponse = client.execute(postMethod);
//			HttpEntity entity = httpResponse.getEntity();
//			if(entity != null){
//				Header header = entity.getContentType();
//				InputStream content = entity.getContent();
//				Scanner scanner = new Scanner(content);
//				response = scanner.useDelimiter("\\A").next();
//				scanner.close();
//			}
//
//		} catch (URISyntaxException e) {
//			e.printStackTrace();
//		} catch (ClientProtocolException e) {
//			e.printStackTrace();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//		return response;
//	}
}
