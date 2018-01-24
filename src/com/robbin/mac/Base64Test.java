package com.robbin.mac;

import org.apache.commons.codec.binary.Base64;
import org.junit.Test;

public class Base64Test {
	
	@Test
	public void test_01(){
		
		String secret = "abcedfg23432432"+"9000000001"; // abcedfg23432432900000000
		
		byte[] decodeBase64 = Base64.decodeBase64(secret.getBytes());
		for (byte b : decodeBase64) {
		  System.out.print(b);
		}
		System.out.println();
//		System.out.println(new String(Base64.decodeBase64(decodeBase64)));
		
		
		
		String secret2 = "abcedfg23432432"+"9000000002";
		byte[] decodeBase642 = Base64.decodeBase64(secret2.getBytes());
		for (byte b : decodeBase642) {
		  System.out.print(b);
		}
		System.out.println();
		
	}

}
