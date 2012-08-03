package net.reimone.ttloc.application.ui;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.inject.Inject;

import net.reimone.ttloc.model.ttloc.TTLOCApplication;

import org.eclipse.e4.ui.di.Focus;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;

public class UserGamesPart {

	private Label label;
	@Inject
	private TTLOCApplication application;
	
	@PostConstruct
	public void createControls(Composite parent) {
		label = new Label(parent,SWT.NONE);
		label.setText("Hahah");
	} 
	
	@Focus
	private void setFocus() {
		label.setFocus();
	} 
	
	@PreDestroy
	public void dispose(){
		
	}
}
