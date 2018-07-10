package com.iparhan.financial.until;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * 生成32位md5码
 * @param password
 * @return
 */
public class MD5Utils {
	
//	public static void main(String[] args) {
//		String string = MD5Utils.md5Password("123456");
//		System.out.println(string);
//	}
	
    public static String md5Password(String password) {
        try {
            MessageDigest digest = MessageDigest.getInstance("md5");
            byte[] result = digest.digest(password.getBytes());
            StringBuffer buffer = new StringBuffer();
            for (byte b : result) {
                // 与运算
                int number = b & 0xff;
                String str = Integer.toHexString(number);
                if (str.length() == 1) {
                    buffer.append("0");
                }
                buffer.append(str);
            }
            // 标准的md5加密后的结果
            return buffer.toString();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return "";
        }

    }
}
