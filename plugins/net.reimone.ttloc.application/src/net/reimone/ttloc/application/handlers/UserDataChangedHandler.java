package net.reimone.ttloc.application.handlers;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.XMIResource;

import net.reimone.ttloc.communication.ServerRequest;
import net.reimone.ttloc.model.ttloc.TTLOCApplication;
import net.reimone.ttloc.model.ttloc.User;

public class UserDataChangedHandler {

	public static void dataChanged(User user) {
		TTLOCApplication application = user.getApplication();
		Resource resource = application.eResource();
		Map<String, String> options = new HashMap<String, String>();
		options.put(XMIResource.OPTION_ENCODING, "UTF-8");
		try {
			resource.save(options);
		} catch (IOException e) {
			e.printStackTrace();
		}
		String baseURL = application.getBaseURL();
		String gamesOfUserURL = application.getGamesOfUserURL();
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
