package net.reimone.ttloc.application;

import javax.annotation.PostConstruct;

import net.reimone.ttloc.model.ttloc.TTLOCApplication;
import net.reimone.ttloc.model.ttloc.TtlocFactory;
import net.reimone.ttloc.model.ttloc.User;

import org.eclipse.core.runtime.preferences.ConfigurationScope;
import org.eclipse.core.runtime.preferences.IEclipsePreferences;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.jface.preference.PreferenceManager;
import org.osgi.service.prefs.BackingStoreException;
import org.osgi.service.prefs.Preferences;

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
		TTLOCApplication ttlocApplication = TtlocFactory.eINSTANCE.createTTLOCApplication();
		ttlocApplication.setBaseURL("http://sttv.tischtennislive.de/Ajax/Tischtennis/");
		ttlocApplication.setGamesOfUserURL("getSpieleOfUser.ashx");
		ttlocApplication.setGameReportURL("getSpielbericht.ashx");
		User user = TtlocFactory.eINSTANCE.createUser();
		ttlocApplication.setUser(user);
		context.set(TTLOCApplication.class, ttlocApplication);

		initPreferences(user);
	}
	
	private void initPreferences(User user){
		IEclipsePreferences preferences = ConfigurationScope.INSTANCE.getNode(ApplicationConstants.PREF_BASE);
		String id = preferences.get(ApplicationConstants.PREF_ID, null);
		String pass = preferences.get(ApplicationConstants.PREF_PASS, null);
		String name = preferences.get(ApplicationConstants.PREF_NAME, null);
		if(id != null){
			user.setId(id);
		}
		if(pass != null){
			user.setPassword(pass);
		}
		if(name != null){
			user.setName(name);
		}
		try {
			preferences.flush();
		} catch (BackingStoreException e) {
			e.printStackTrace();
		}
	}
}
