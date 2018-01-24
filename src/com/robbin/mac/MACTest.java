package com.robbin.mac;

import java.security.NoSuchAlgorithmException;  
import javax.crypto.KeyGenerator;  
import javax.crypto.Mac;  
import javax.crypto.SecretKey;  
import javax.crypto.spec.SecretKeySpec;  
import javax.xml.bind.annotation.adapters.HexBinaryAdapter;  
  
/** 
 * MAC�㷨������ 
 * ����HmacMD5��HmacSHA1��HmacSHA256��HmacSHA384��HmacSHA512Ӧ�õĲ��趼��һģһ���ġ����忴����Ĵ��� 
 */  
class MACCoder  {  
    /** 
     * ����HmacMD5ժҪ�㷨����Կ 
     */  
    public static byte[] initHmacMD5Key() throws NoSuchAlgorithmException {  
        // ��ʼ��HmacMD5ժҪ�㷨����Կ������  
        KeyGenerator generator = KeyGenerator.getInstance("HmacMD5");  
        // ������Կ  
        SecretKey secretKey = generator.generateKey();  
        // �����Կ  
        byte[] key = secretKey.getEncoded();  
        return key;  
    }  
  
    /** 
     * HmacMd5ժҪ�㷨 
     * ���ڸ������ɵĲ�ͬ��Կ���õ���ժҪ��Ϣ�᲻ͬ��������ʵ��Ӧ���У�Ҫ�������ǵ���Կ 
     */  
    public static String encodeHmacMD5(byte[] data, byte[] key) throws Exception {  
        // ��ԭ��Կ  
        SecretKey secretKey = new SecretKeySpec(key, "HmacMD5");  
        // ʵ����Mac  
        Mac mac = Mac.getInstance(secretKey.getAlgorithm());  
        //��ʼ��mac  
        mac.init(secretKey);  
        //ִ����ϢժҪ  
        byte[] digest = mac.doFinal(data);  
        return new HexBinaryAdapter().marshal(digest);//תΪʮ�����Ƶ��ַ���  
    }  
      
      
    /** 
     * ����HmacSHA1ժҪ�㷨����Կ 
     */  
    public static byte[] initHmacSHAKey() throws NoSuchAlgorithmException {  
        // ��ʼ��HmacMD5ժҪ�㷨����Կ������  
        KeyGenerator generator = KeyGenerator.getInstance("HmacSHA1");  
        // ������Կ  
        SecretKey secretKey = generator.generateKey();  
        // �����Կ  
        byte[] key = secretKey.getEncoded();  
        return key;  
    }  
  
    /** 
     * HmacSHA1ժҪ�㷨 
     * ���ڸ������ɵĲ�ͬ��Կ���õ���ժҪ��Ϣ�᲻ͬ��������ʵ��Ӧ���У�Ҫ�������ǵ���Կ 
     */  
    public static String encodeHmacSHA(byte[] data, byte[] key) throws Exception {  
        // ��ԭ��Կ  
        SecretKey secretKey = new SecretKeySpec(key, "HmacSHA1");  
        // ʵ����Mac  
        Mac mac = Mac.getInstance(secretKey.getAlgorithm());  
        //��ʼ��mac  
        mac.init(secretKey);  
        //ִ����ϢժҪ  
        byte[] digest = mac.doFinal(data);  
        return new HexBinaryAdapter().marshal(digest);//תΪʮ�����Ƶ��ַ���  
    }  
      
      
      
    /** 
     * ����HmacSHA256ժҪ�㷨����Կ 
     */  
    public static byte[] initHmacSHA256Key() throws NoSuchAlgorithmException {  
        // ��ʼ��HmacMD5ժҪ�㷨����Կ������  
        KeyGenerator generator = KeyGenerator.getInstance("HmacSHA256");  
        // ������Կ  
        SecretKey secretKey = generator.generateKey();  
        // �����Կ  
        byte[] key = secretKey.getEncoded();  
        return key;  
    }  
  
    /** 
     * HmacSHA1ժҪ�㷨 
     * ���ڸ������ɵĲ�ͬ��Կ���õ���ժҪ��Ϣ�᲻ͬ��������ʵ��Ӧ���У�Ҫ�������ǵ���Կ 
     */  
    public static String encodeHmacSHA256(byte[] data, byte[] key) throws Exception {  
        // ��ԭ��Կ  
        SecretKey secretKey = new SecretKeySpec(key, "HmacSHA256");  
        // ʵ����Mac  
        Mac mac = Mac.getInstance(secretKey.getAlgorithm());  
        //��ʼ��mac  
        mac.init(secretKey);  
        //ִ����ϢժҪ  
        byte[] digest = mac.doFinal(data);  
        return new HexBinaryAdapter().marshal(digest);//תΪʮ�����Ƶ��ַ���  
    }  
      
      
  
    /** 
     * ����HmacSHA256ժҪ�㷨����Կ 
     */  
    public static byte[] initHmacSHA384Key() throws NoSuchAlgorithmException {  
        // ��ʼ��HmacMD5ժҪ�㷨����Կ������  
        KeyGenerator generator = KeyGenerator.getInstance("HmacSHA384");  
        // ������Կ  
        SecretKey secretKey = generator.generateKey();  
        // �����Կ  
        byte[] key = secretKey.getEncoded();  
        return key;  
    }  
  
    /** 
     * HmacSHA1ժҪ�㷨 
     * ���ڸ������ɵĲ�ͬ��Կ���õ���ժҪ��Ϣ�᲻ͬ��������ʵ��Ӧ���У�Ҫ�������ǵ���Կ 
     */  
    public static String encodeHmacSHA384(byte[] data, byte[] key) throws Exception {  
        // ��ԭ��Կ  
        SecretKey secretKey = new SecretKeySpec(key, "HmacSHA384");  
        // ʵ����Mac  
        Mac mac = Mac.getInstance(secretKey.getAlgorithm());  
        //��ʼ��mac  
        mac.init(secretKey);  
        //ִ����ϢժҪ  
        byte[] digest = mac.doFinal(data);  
        return new HexBinaryAdapter().marshal(digest);//תΪʮ�����Ƶ��ַ���  
    }  
      
      
  
    /** 
     * ����HmacSHA256ժҪ�㷨����Կ 
     */  
    public static byte[] initHmacSHA512Key() throws NoSuchAlgorithmException {  
        // ��ʼ��HmacMD5ժҪ�㷨����Կ������  
        KeyGenerator generator = KeyGenerator.getInstance("HmacSHA512");  
        // ������Կ  
        SecretKey secretKey = generator.generateKey();  
        // �����Կ  
        byte[] key = secretKey.getEncoded();  
        return key;  
    }  
  
    /** 
     * HmacSHA1ժҪ�㷨 
     * ���ڸ������ɵĲ�ͬ��Կ���õ���ժҪ��Ϣ�᲻ͬ��������ʵ��Ӧ���У�Ҫ�������ǵ���Կ 
     */  
    public static String encodeHmacSHA512(byte[] data, byte[] key) throws Exception {  
        // ��ԭ��Կ  
        SecretKey secretKey = new SecretKeySpec(key, "HmacSHA512");  
        // ʵ����Mac  
        Mac mac = Mac.getInstance(secretKey.getAlgorithm());  
        //��ʼ��mac  
        mac.init(secretKey);  
        //ִ����ϢժҪ  
        byte[] digest = mac.doFinal(data);  
        return new HexBinaryAdapter().marshal(digest);//תΪʮ�����Ƶ��ַ���  
    }  
}  
  
public class MACTest {  
	
    public static void main(String[] args) throws Exception {  
    	 String testString = "9000000002";  
         byte[] keyHmacSHA1=MACCoder.initHmacSHAKey();  
         System.out.println(MACCoder.encodeHmacSHA(testString.getBytes(),keyHmacSHA1));  
         // 2C97F4EAB2B081AD3CD24FE55D19B61EC67AD59F
    	
    }
	
    public static void main2(String[] args) throws Exception {  
        String testString = "asdasd";  
          
        byte[] keyHmacMD5= MACCoder.initHmacMD5Key();  
        System.out.println(MACCoder.encodeHmacMD5(testString.getBytes(),keyHmacMD5));  
          
        byte[] keyHmacSHA1=MACCoder.initHmacSHAKey();  
        System.out.println(MACCoder.encodeHmacSHA(testString.getBytes(),keyHmacSHA1));  
          
        byte[] keyHmacSHA256=MACCoder.initHmacSHA256Key();  
        System.out.println(MACCoder.encodeHmacSHA256(testString.getBytes(),keyHmacSHA256));  
          
        byte[] keyHmacSHA384=MACCoder.initHmacSHA384Key();  
        System.out.println(MACCoder.encodeHmacSHA384(testString.getBytes(),keyHmacSHA384));  
          
        byte[] keyHmacSHA512=MACCoder.initHmacSHA512Key();  
        System.out.println(MACCoder.encodeHmacSHA512(testString.getBytes(),keyHmacSHA512));  
    }  
}  
