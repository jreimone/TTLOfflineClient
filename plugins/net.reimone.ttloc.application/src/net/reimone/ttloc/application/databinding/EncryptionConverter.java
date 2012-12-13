package net.reimone.ttloc.application.databinding;

import net.reimone.ttloc.communication.TripleDes;

import org.eclipse.core.databinding.conversion.IConverter;

public class EncryptionConverter implements IConverter {

	@Override
	public Object convert(Object fromObject) {
		String text = (String) fromObject;

		String codedText = null;
//		String decodedtext = null;
		TripleDes tripleDes;
		try {
			tripleDes = new TripleDes();
			codedText = tripleDes.encrypt(text);
//			decodedtext = tripleDes.decrypt(codedText);
			return codedText;

		} catch (Exception e) {
			e.printStackTrace();
		}
		return fromObject;
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