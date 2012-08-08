package net.reimone.ttloc.application.databinding;

import java.io.UnsupportedEncodingException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;

import net.reimone.ttloc.communication.TripleDESEncryption;

import org.eclipse.core.databinding.conversion.IConverter;

public class EncryptionConverter implements IConverter {

	@Override
	public Object convert(Object fromObject) {
//		String text = (String) fromObject;
//
//        byte[] codedText = null;
//        String decodedtext = null;
//		try {
//			codedText = TripleDESEncryption.encrypt(text);
//			decodedtext = TripleDESEncryption.decrypt(codedText);
//		} catch (InvalidKeyException | NoSuchAlgorithmException
//				| UnsupportedEncodingException | NoSuchPaddingException
//				| InvalidAlgorithmParameterException
//				| IllegalBlockSizeException | BadPaddingException e) {
//			e.printStackTrace();
//		}
////
//        System.out.println(codedText); // this is a byte array, you'll just see a reference to an array
//        System.out.println(decodedtext); // This correctly shows "kyle boon"
//		
//		try {
//			return new String(codedText, "UTF-8");
//		} catch (UnsupportedEncodingException e) {
//			e.printStackTrace();
//		}
//		return null;
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