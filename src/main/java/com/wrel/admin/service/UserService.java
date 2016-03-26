
package com.wrel.admin.service;

import com.wrel.admin.entity.User;

/**
 *
 * Page/Class Name: UserService
 * Title:
 * Description:
 * author: weiting
 * Create Date:	2016年3月26日
 * Last Modifier: eldar
 * Last Modify Date: 2016年3月26日
 * Version 1.0
 *
 */
public interface UserService {
    //================================================
    //== [Method] Block Start
    //====
    User getUserByEmail(final String email);
    //####################################################################
    //## [Method] sub-block : 
    //####################################################################
    //====
    //== [Method] Block Stop 
    //================================================
}
