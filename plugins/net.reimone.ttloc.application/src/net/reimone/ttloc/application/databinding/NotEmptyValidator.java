package net.reimone.ttloc.application.databinding;

import org.eclipse.core.databinding.validation.IValidator;
import org.eclipse.core.databinding.validation.ValidationStatus;
import org.eclipse.core.runtime.IStatus;

public class NotEmptyValidator implements IValidator {

	@Override
	public IStatus validate(Object value) {
		if(value == null || "".equals(value)){
			return ValidationStatus.error("Wert muss gesetzt werden");
		}
		return ValidationStatus.ok();
	}

}
