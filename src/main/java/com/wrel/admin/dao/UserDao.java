
package com.wrel.admin.dao;

import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import com.wrel.admin.entity.User;
import com.wrel.admin.entity.User.Status;

/**
 *
 * Page/Class Name: UserDao
 * Title:
 * Description:
 * author: weiting
 * Create Date:	2016年3月26日
 * Last Modifier: eldar
 * Last Modify Date: 2016年3月26日
 * Version 1.0
 *
 */
@Repository
public class UserDao extends BaseDao {
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
    public final User getUserByEmail(final String email, final Status status) {
        final StringBuilder str = new StringBuilder();
        str.append(" FROM User ");
        str.append(" WHERE email = :email ");
        str.append("    AND   ");
        str.append(" status = :status  ");

        final Query query = this.sessionFactory.getCurrentSession().createQuery(str.toString());
        query.setString("email", email);
        query.setInteger("status", status.getValue());

        final User user = (User) query.uniqueResult();
        return user;

    }
    //####################################################################
    //## [Method] sub-block : 
    //####################################################################
    //====
    //== [Method] Block Stop 
    //================================================
}
