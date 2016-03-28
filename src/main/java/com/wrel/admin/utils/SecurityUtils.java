
package com.wrel.admin.utils;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import org.apache.commons.lang3.StringUtils;
import org.springframework.security.crypto.codec.Base64;

/**
 *
 * Page/Class Name: SecurityUtils
 * Title:
 * Description:
 * author: weiting
 * Create Date:	2016年3月28日
 * Last Modifier: eldar
 * Last Modify Date: 2016年3月28日
 * Version 1.0
 *
 */
public class SecurityUtils {
    //================================================
    //== [Enumeration types] Block Start
    //====
    //====
    //== [Enumeration types] Block End 
    //================================================
    //== [static variables] Block Start
    //====
    //====
    //== [static variables] Block Stop 
    //================================================
    //== [instance variables] Block Start
    //====
    //====
    //== [instance variables] Block Stop 
    //================================================
    //== [static Constructor] Block Start
    //====
    //====
    //== [static Constructor] Block Stop 
    //================================================
    //== [Constructors] Block Start (含init method)
    //====
    //====
    //== [Constructors] Block Stop 
    //================================================
    //== [Static Method] Block Start
    //====
    public static String encodeWithMD5AndBase64(final String str) {
        System.out.println("str = " + str);
        if (StringUtils.isEmpty(str)) {
            return StringUtils.EMPTY;
        } else {
            String encodeStr = "";
            final byte[] utfBytes = str.getBytes();
            MessageDigest mdTemp;
            try {
                mdTemp = MessageDigest.getInstance("MD5");
                mdTemp.update(utfBytes);
                byte[] md5Bytes = mdTemp.digest();
                encodeStr = new String(Base64.encode(md5Bytes));

            } catch (NoSuchAlgorithmException e) {
                return null;
            }
            return encodeStr;
        }
    }
    //====
    //== [Static Method] Block Stop 
    //================================================
    //== [Accessor] Block Start
    //====
    //====
    //== [Accessor] Block Stop 
    //================================================
    //== [Overrided Method] Block Start (Ex. toString/equals+hashCode)
    //====
    //====
    //== [Overrided Method] Block Stop 
    //================================================
    //== [Method] Block Start
    //====
    //####################################################################
    //## [Method] sub-block : 
    //####################################################################
    //====
    //== [Method] Block Stop 
    //================================================
}
