
package com.wrel.admin.controller;

import org.springframework.security.core.context.SecurityContextHolder;

import com.wrel.admin.application.security.LoginInfo;
import com.wrel.admin.entity.User;

/**
 *
 * Page/Class Name: BaseController
 * Title:
 * Description:
 * author: weiting
 * Create Date:	2016年3月28日
 * Last Modifier: eldar
 * Last Modify Date: 2016年3月28日
 * Version 1.0
 *
 */
public class BaseController {
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
    //====
    //== [Overrided Method] Block Stop 
    //================================================
    //== [Method] Block Start
    //====
    public final User getLoginUser() {
        LoginInfo loginInfo = (LoginInfo) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        if (loginInfo != null) {
            return loginInfo.getUser();
        } else {
            return null;
        }
    }
    //####################################################################
    //## [Method] sub-block : 
    //####################################################################
    //====
    //== [Method] Block Stop 
    //================================================
}
