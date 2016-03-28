
package com.wrel.admin.application.security;

import java.util.Collection;

import org.apache.commons.lang3.StringUtils;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

/**
 *
 * Page/Class Name: UserInfo
 * Title:
 * Description:
 * author: weiting
 * Create Date:	2016年3月28日
 * Last Modifier: eldar
 * Last Modify Date: 2016年3月28日
 * Version 1.0
 *
 */
public class LoginInfo extends User {

    //================================================
    //== [Enumeration types] Block Start
    //====
    //====
    //== [Enumeration types] Block End 
    //================================================
    //== [static variables] Block Start
    //====
    /**
     * <code>serialVersionUID</code> 的註解
     */
    private static final long serialVersionUID = 1L;

    //====
    //== [static variables] Block Stop 
    //================================================
    //== [instance variables] Block Start
    //====
    private com.wrel.admin.entity.User user;

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

    public LoginInfo(final com.wrel.admin.entity.User user, final Collection<? extends GrantedAuthority> authorities) {
        super(StringUtils.trim(user.getEmail()), StringUtils.trim(user.getPassword()), authorities);
    }

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
    public com.wrel.admin.entity.User getUser() {
        return this.user;
    }

    public void setUser(com.wrel.admin.entity.User user) {
        this.user = user;
    }
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
