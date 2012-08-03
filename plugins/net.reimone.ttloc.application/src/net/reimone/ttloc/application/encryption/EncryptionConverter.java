package net.reimone.ttloc.application.encryption;

import org.eclipse.core.databinding.conversion.IConverter;

public class EncryptionConverter implements IConverter {

	@Override
	public Object convert(Object fromObject) {
		String from = (String) fromObject;
		return from.toUpperCase();
	}

	@Override
	public Object getFromType() {
		return String.class;
	}

	@Override
	public Object getToType() {
		return String.class;
	}

}