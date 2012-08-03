package net.reimone.ttloc.application.handlers;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;

import javax.inject.Inject;

import net.reimone.ttloc.model.ttloc.TTLOCApplication;
import net.reimone.ttloc.model.ttloc.User;

import org.eclipse.core.runtime.preferences.IEclipsePreferences.IPreferenceChangeListener;
import org.eclipse.core.runtime.preferences.IEclipsePreferences.PreferenceChangeEvent;
import org.osgi.service.prefs.Preferences;

public class PreferencesChangeListener implements IPreferenceChangeListener {

	@Inject
	private TTLOCApplication application;
	
	public PreferencesChangeListener(TTLOCApplication application) {
		this.application = application;
	}

	@Override
	public void preferenceChange(PreferenceChangeEvent event) {
		Preferences node = event.getNode();
		Object source = event.getSource();
		String key = event.getKey();
		Object newValue = event.getNewValue();
		Object oldValue = event.getOldValue();
		
		sendPostRequest();
	}

	
	private void sendPostRequest() {
		String baseURL = application.getBaseURL();
		String gamesOfUserURL = application.getGamesOfUserURL();
		String urlString = baseURL + gamesOfUserURL;
		User user = application.getUser();
		String id = user.getId();
		String password = user.getPassword();
		
//		HttpClient client = new DefaultHttpClient();
//		client.getParams().setParameter("http.useragent", "Test Client");
//
//	    BufferedReader br = null;
//
//	    PostMethod method = new PostMethod("http://search.yahoo.com/search");
//	    method.addParameter("p", "\"java2s\"");
//
//	    try{
//	      int returnCode = client.executeMethod(method);
//
//	      if(returnCode == HttpStatus.SC_NOT_IMPLEMENTED) {
//	        System.err.println("The Post method is not implemented by this URI");
//	        // still consume the response body
//	        method.getResponseBodyAsString();
//	      } else {
//	        br = new BufferedReader(new InputStreamReader(method.getResponseBodyAsStream()));
//	        String readLine;
//	        while(((readLine = br.readLine()) != null)) {
//	          System.err.println(readLine);
//	      }
//	      }
//	    } catch (Exception e) {
//	      System.err.println(e);
//	    } finally {
//	      method.releaseConnection();
//	      if(br != null) try { br.close(); } catch (Exception fe) {}
//	    }

		try {
		    // Construct data
		    String data = URLEncoder.encode("username", "UTF-8") + "=" + URLEncoder.encode(id, "UTF-8");
		    data += "&" + URLEncoder.encode("password", "UTF-8") + "=" + URLEncoder.encode(password, "UTF-8");

		    // Send data
		    URL url = new URL(urlString);
		    URLConnection conn = url.openConnection();
		    conn.setDoOutput(true);
		    OutputStreamWriter wr = new OutputStreamWriter(conn.getOutputStream());
		    wr.write(data);
		    wr.flush();

		    // Get the response
		    BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
		    String response = "";
		    String line;
		    while ((line = rd.readLine()) != null) {
		    	response += line + "\n";
		    }
		    System.out.println(response);
		    wr.close();
		    rd.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
