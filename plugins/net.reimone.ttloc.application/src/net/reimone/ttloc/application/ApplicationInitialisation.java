package net.reimone.ttloc.application;

import javax.annotation.PostConstruct;

import net.reimone.ttloc.model.ttloc.TTLOCApplication;
import net.reimone.ttloc.model.ttloc.TtlocFactory;
import net.reimone.ttloc.model.ttloc.User;

import org.eclipse.e4.core.contexts.IEclipseContext;

/**
 * Initialises the application model.
 * 
 * @author Jan
 *
 */
public class ApplicationInitialisation {

	@SuppressWarnings("restriction")
	@PostConstruct
	public void initApplication(IEclipseContext context) {
		TTLOCApplication ttlocApplication = TtlocFactory.eINSTANCE.createTTLOCApplication();
		ttlocApplication.setBaseURL("http://sttv.tischtennislive.de/Ajax/Tischtennis/");
		ttlocApplication.setGamesOfUserURL("getSpieleOfUser.ashx");
		ttlocApplication.setGameReportURL("getSpielbericht.ashx");
		User user = TtlocFactory.eINSTANCE.createUser();
		context.set(TTLOCApplication.class, ttlocApplication);
		
	}
}
