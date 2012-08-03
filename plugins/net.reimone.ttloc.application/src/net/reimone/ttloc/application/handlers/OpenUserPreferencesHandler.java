package net.reimone.ttloc.application.handlers;

import net.reimone.ttloc.application.ApplicationConstants;
import net.reimone.ttloc.application.ui.UserPreferencesDialog;

import org.eclipse.e4.core.contexts.ContextInjectionFactory;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.core.di.extensions.Preference;

public class OpenUserPreferencesHandler {

	@Execute
	private void preferencesUserChanged(IEclipseContext context){
		UserPreferencesDialog dialog = ContextInjectionFactory.make(UserPreferencesDialog.class, context);
		dialog.open();
	}
}
