package net.reimone.ttloc.application.ui;

import javax.inject.Inject;
import javax.inject.Named;

import net.reimone.ttloc.application.ApplicationConstants;
import net.reimone.ttloc.application.databinding.EncryptionConverter;
import net.reimone.ttloc.model.ttloc.TTLOCApplication;
import net.reimone.ttloc.model.ttloc.User;

import org.eclipse.e4.ui.services.IServiceConstants;
import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Text;
import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.ValidationStatusProvider;
import org.eclipse.core.databinding.conversion.IConverter;
import org.eclipse.core.databinding.observable.list.IObservableList;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.core.runtime.preferences.ConfigurationScope;
import org.eclipse.core.runtime.preferences.IEclipsePreferences;
import org.eclipse.jface.databinding.swt.WidgetProperties;
import org.eclipse.emf.databinding.EMFObservables;
import org.osgi.service.prefs.BackingStoreException;
import org.osgi.service.prefs.Preferences;

import net.reimone.ttloc.model.ttloc.TtlocPackage.Literals;
import org.eclipse.core.databinding.Binding;
import org.eclipse.core.databinding.UpdateValueStrategy;
import net.reimone.ttloc.application.databinding.NotEmptyValidator;

/**
 * Dialog for the preferences
 * 
 * @author Jan
 *
 */
public class UserPreferencesDialog extends TitleAreaDialog{
	
	private DataBindingContext m_bindingContext;

	@Inject
	private TTLOCApplication application;
	private User user;
	private Label lblBenutzerid;
	private Text txtUserId;
	private Text txtPassword;
	private Text txtName;
	
	@Inject
	public UserPreferencesDialog(@Named(IServiceConstants.ACTIVE_SHELL) Shell parentShell) {
		super(parentShell);
	}

	private void init() {
		setTitle("Benutzereinstellungen");
		setMessage("Geben Sie hier die Angaben Ihres Nutzeraccounts an.");
		user = application.getUser();
		String errorMessage = "Die folgenden Daten müssen noch eingegben werden:";
		boolean error = false;
		if(user.getId() == null || "".equals(user.getId())){
			error = true;
			errorMessage += "ID (Benutzerkennung von Tischtennis Live)";
		}
		if(user.getName() == null || "".equals(user.getName())){
			error = true;
			errorMessage += "\nBenutzername (Ihr Name)";
		}
		if(user.getPassword() == null || "".equals(user.getPassword())){
			error = true;
			errorMessage += "\nPasswort (Ihr Passwort von Tischtennis Live)";
		}
		if(error){
			setErrorMessage(errorMessage);
		}
	}

	@Override
	protected Control createDialogArea(Composite parent) {
		Composite area = (Composite) super.createDialogArea(parent);
		
		init();
		
		Composite container = new Composite(area, SWT.NONE);
	    container.setLayoutData(new GridData(GridData.FILL_BOTH));
	    container.setLayout(new GridLayout(2, false));
	    
		lblBenutzerid = new Label(container, SWT.NONE);
		lblBenutzerid.setText("BenutzerID:");
		
		txtUserId = new Text(container, SWT.BORDER);
		txtUserId.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		
		Label lblPasswort = new Label(container, SWT.NONE);
		lblPasswort.setText("Passwort:");
		
		txtPassword = new Text(container, SWT.BORDER | SWT.PASSWORD);
		txtPassword.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		
		Label lblBenutzername = new Label(container, SWT.NONE);
		lblBenutzername.setText("Benutzername:");
		
		txtName = new Text(container, SWT.BORDER);
		txtName.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		m_bindingContext = initDataBindings();
		
		return area;
	}

	@Override
	protected void okPressed() {
		IEclipsePreferences preferences = ConfigurationScope.INSTANCE.getNode(ApplicationConstants.PREF_BASE);
		preferences.put(ApplicationConstants.PREF_ID, user.getId());
		preferences.put(ApplicationConstants.PREF_PASS, user.getPassword());
		preferences.put(ApplicationConstants.PREF_NAME, user.getName());
		try {
			preferences.flush();
		} catch (BackingStoreException e) {
			e.printStackTrace();
		}
		super.okPressed();
	}
	
	protected DataBindingContext initDataBindings() {
		DataBindingContext bindingContext = new DataBindingContext();
		//
		IObservableValue observeTextTxtUserIdObserveWidget = WidgetProperties.text(SWT.Modify).observe(txtUserId);
		IObservableValue userIdObserveValue = EMFObservables.observeValue(user, Literals.USER__ID);
		bindingContext.bindValue(observeTextTxtUserIdObserveWidget, userIdObserveValue, null, null);
		//
		IObservableValue observeTextTxtPasswordObserveWidget = WidgetProperties.text(SWT.Modify).observe(txtPassword);
		IObservableValue userPasswordObserveValue = EMFObservables.observeValue(user, Literals.USER__PASSWORD);
		UpdateValueStrategy strategy = new UpdateValueStrategy();
		strategy.setConverter(new EncryptionConverter());
		strategy.setBeforeSetValidator(new NotEmptyValidator());
		bindingContext.bindValue(observeTextTxtPasswordObserveWidget, userPasswordObserveValue, strategy, null);
		//
		IObservableValue observeTextTxtNameObserveWidget = WidgetProperties.text(SWT.Modify).observe(txtName);
		IObservableValue userNameObserveValue = EMFObservables.observeValue(user, Literals.USER__NAME);
		bindingContext.bindValue(observeTextTxtNameObserveWidget, userNameObserveValue, null, null);
		//
		return bindingContext;
	}
}
