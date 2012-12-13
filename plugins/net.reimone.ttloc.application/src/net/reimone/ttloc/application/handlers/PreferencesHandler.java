package net.reimone.ttloc.application.handlers;

import javax.inject.Inject;

import net.reimone.ttloc.application.ApplicationConstants;
import net.reimone.ttloc.model.ttloc.TTLOCApplication;

import org.eclipse.e4.core.di.extensions.Preference;

public class PreferencesHandler {
	 
	@Inject
	private TTLOCApplication application;
	private boolean modified = false; 
	
//	@Inject
//	private void userNameChanged(@Preference(nodePath=ApplicationConstants.PREF_BASE, value=ApplicationConstants.PREF_NAME) String userName){
//		application.getUser().setName(userName);
//		modified = true;
//	}
//	
//	@Inject
//	private void userPasswordChanged(@Preference(nodePath=ApplicationConstants.PREF_BASE, value=ApplicationConstants.PREF_PASS) String password){
//		application.getUser().setPassword(password);
//		modified = true;
//	}
//	
//	@Inject
//	private void idChanged(@Preference(nodePath=ApplicationConstants.PREF_BASE, value=ApplicationConstants.PREF_ID) String id){
//		application.getUser().setId(id);
//		modified = true;
//	}
	
	
}
