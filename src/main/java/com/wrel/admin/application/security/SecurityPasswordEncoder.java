
package com.wrel.admin.application.security;

import org.apache.commons.lang3.StringUtils;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.wrel.admin.utils.SecurityUtils;

/**
 *
 * Page/Class Name: SecurityPasswordEncoder
 * Title:
 * Description:
 * author: weiting
 * Create Date:	2016年3月28日
 * Last Modifier: eldar
 * Last Modify Date: 2016年3月28日
 * Version 1.0
 *
 */
public class SecurityPasswordEncoder implements PasswordEncoder {

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
    @Override
    public String encode(CharSequence rawPassword) {

        return SecurityUtils.encodeWithMD5AndBase64(rawPassword.toString());
    }

    @Override
    public boolean matches(CharSequence rawPassword, String encodedPassword) {

        if (StringUtils.equals(this.encode(rawPassword), encodedPassword)) {
            return true;
        }
        return false;
    }
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
