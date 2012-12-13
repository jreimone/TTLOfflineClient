package net.reimone.ttloc.application;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.PostConstruct;

import net.reimone.ttloc.application.handlers.PreferencesChangeListener;
import net.reimone.ttloc.communication.TripleDes;
import net.reimone.ttloc.model.ttloc.TTLOCApplication;
import net.reimone.ttloc.model.ttloc.TtlocFactory;
import net.reimone.ttloc.model.ttloc.User;

import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.preferences.ConfigurationScope;
import org.eclipse.core.runtime.preferences.IEclipsePreferences;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.osgi.framework.Bundle;
import org.osgi.service.prefs.BackingStoreException;

/**
 * Initialises the application model.
 * 
 * @author Jan
 *
 */
public class ApplicationInitialisation {

	@SuppressWarnings("restriction")
	@PostConstruct
	public void initApplicationModel(IEclipseContext context) {
		TTLOCApplication ttlocApplication = getApplication();
		context.set(TTLOCApplication.class, ttlocApplication);

//		initPreferences(ttlocApplication);
	}
	
	private TTLOCApplication getApplication() {
		TTLOCApplication application = null;
		Bundle bundle = ApplicationActivator.getContext().getBundle();
		IPath stateLocation = Platform.getStateLocation(bundle);
		IPath applicationModelFilePath = stateLocation.append("/" + ApplicationConstants.APP_MODEL_FILE_NAME);
		ResourceSet rs = new ResourceSetImpl();
		Resource resource = null;
		URI uri = URI.createFileURI(applicationModelFilePath.toString());
		if(!applicationModelFilePath.toFile().exists()){
			resource = rs.createResource(uri);
			application = createInitialApplication();
			resource.getContents().add(application);
			try {
				Map<String, String> options = new HashMap<String, String>();
				options.put(XMIResource.OPTION_ENCODING, "UTF-8");
				resource.save(options);
			} catch (IOException e) {
				e.printStackTrace();
			}
		} else {
			resource = rs.getResource(uri, true);
			application = (TTLOCApplication) resource.getContents().get(0);
		}
		return application;
	}

	private TTLOCApplication createInitialApplication() {
		TTLOCApplication ttlocApplication = TtlocFactory.eINSTANCE.createTTLOCApplication();
		ttlocApplication.setBaseURL("http://sttv.tischtennislive.de/Ajax/Tischtennis/");
		ttlocApplication.setGamesOfUserURL("getSpieleOfUser.ashx");
		ttlocApplication.setGameReportURL("getSpielbericht.ashx");
		User user = TtlocFactory.eINSTANCE.createUser();
		ttlocApplication.setUser(user);
		return ttlocApplication;
	}

//	private void initPreferences(TTLOCApplication ttlocApplication){
//		User user = ttlocApplication.getUser();
//		IEclipsePreferences preferences = ConfigurationScope.INSTANCE.getNode(ApplicationConstants.PREF_BASE);
//		preferences.addPreferenceChangeListener(new PreferencesChangeListener(ttlocApplication));
//		String id = preferences.get(ApplicationConstants.PREF_ID, null);
//		String pass = preferences.get(ApplicationConstants.PREF_PASS, null);
//		String name = preferences.get(ApplicationConstants.PREF_NAME, null);
//		if(id != null){
//			user.setId(id);
//		}
//		if(pass != null){
//			user.setPassword(pass);
//		}
//		if(name != null){
//			user.setName(name);
//		}
//		try {
//			preferences.flush();
//		} catch (BackingStoreException e) {
//			e.printStackTrace();
//		}
//	}
}
