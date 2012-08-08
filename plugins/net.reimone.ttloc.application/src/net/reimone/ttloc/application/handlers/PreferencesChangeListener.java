package net.reimone.ttloc.application.handlers;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Map;

import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.inject.Inject;

import net.reimone.ttloc.communication.ServerRequest;
import net.reimone.ttloc.communication.TestHttpClient;
import net.reimone.ttloc.communication.TripleDESEncryption;
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
		
		String baseURL = application.getBaseURL();
		String gamesOfUserURL = application.getGamesOfUserURL();
		User user = application.getUser();
		String id = user.getId();
		String password = user.getPassword();
		String encryptedID = "";
		String encryptedPassword = "";
//		try {
//			encryptedID = new String(TripleDESEncryption.encrypt(id), Charset.forName("UTF-8"));
//			id = TripleDESEncryption.decrypt(encryptedID.getBytes());
//			encryptedPassword = new String(TripleDESEncryption.encrypt(id));
//			password = TripleDESEncryption.decrypt(encryptedPassword.getBytes());
//		} catch (InvalidKeyException | NoSuchAlgorithmException
//				| UnsupportedEncodingException | NoSuchPaddingException
//				| InvalidAlgorithmParameterException
//				| IllegalBlockSizeException | BadPaddingException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		Map<String, String> parameters = new HashMap<>();
//		parameters.put("username", encryptedID);
//		parameters.put("password", encryptedPassword);
		parameters.put("username", id);
		parameters.put("password", password);
		
		String response = ServerRequest.sendPostRequest(baseURL, gamesOfUserURL, parameters);
		System.out.println(response);
	}
}
