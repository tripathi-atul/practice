package com.snapdeal;

import java.security.spec.KeySpec;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESedeKeySpec;

import org.apache.commons.codec.binary.Base64;


public class TestClass {
	  private static final String UNICODE_FORMAT = "UTF8";
	    public static final String DESEDE_ENCRYPTION_SCHEME = "DES";
	    private KeySpec ks;
	    private SecretKeyFactory skf;
	    private Cipher cipher;
	    byte[] arrayBytes;
	    private String myEncryptionKey;
	    private String myEncryptionScheme;
	    SecretKey key;
	
	 public TestClass() throws Exception {
	        myEncryptionKey = "pass@1234566789millootilloo";
	        myEncryptionScheme = DESEDE_ENCRYPTION_SCHEME;
	        arrayBytes = myEncryptionKey.getBytes(UNICODE_FORMAT);
	        ks = new DESedeKeySpec(arrayBytes);
	        skf = SecretKeyFactory.getInstance(myEncryptionScheme);
	        cipher = Cipher.getInstance(myEncryptionScheme);
	        key = skf.generateSecret(ks);
	    }

	 public String decrypt(String encryptedString) {
	        String decryptedText=null;
	        try {
	            cipher.init(Cipher.DECRYPT_MODE, key);
	            byte[] encryptedText = Base64.decodeBase64(encryptedString);
	            byte[] plainText = cipher.doFinal(encryptedText);
	            decryptedText= new String(plainText);
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	        return decryptedText;
	    }

	public static void main(String[] args) {
		String enString1= "U2FsdGVkX18xJjOPYfy2fdvrM15oOvXP";
		// TODO Auto-generated method stub
		try {
			TestClass tc = new TestClass();
			System.out.println(tc.decrypt(enString1));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
