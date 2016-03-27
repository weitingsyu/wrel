
package com.wrel.admin.application.security;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wrel.admin.entity.User;
import com.wrel.admin.entity.User.Status;
import com.wrel.admin.service.UserService;

/**
 *
 * Page/Class Name: WrelUserDetailsService
 * Title:
 * Description:
 * author: weiting
 * Create Date:	2016年3月26日
 * Last Modifier: eldar
 * Last Modify Date: 2016年3月26日
 * Version 1.0
 *
 */
@Service("userDetailsService")
public class WrelUserDetailsService implements UserDetailsService {

    //     
    //================================================
    //== [Enumeration types] Block Start
    //====
    //====
    //== [Enumeration types] Block End 
    //================================================
    //== [static variables] Block Start
    //====
    private final Logger LOGGER = LoggerFactory.getLogger(WrelUserDetailsService.class);

    //====
    //== [static variables] Block Stop 
    //================================================
    //== [instance variables] Block Start
    //====
    @Autowired
    private UserService userService;

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
    @Transactional(readOnly = true)
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        LOGGER.debug("email :{}", email);
        final User user = userService.getUserByEmail(email, Status.ACTIVE);

        if (user == null) {
            LOGGER.info("user :{} not found", email);
            throw new UsernameNotFoundException("Username not found");
        }
        return new org.springframework.security.core.userdetails.User(user.getEmail(), user.getPassword(), true, true,
                true, true, getGrantedAuthorities(user));
    }

    //====
    //== [Overrided Method] Block Stop 
    //================================================
    //== [Method] Block Start
    //====
    //####################################################################
    //## [Method] sub-block :

    private final List<GrantedAuthority> getGrantedAuthorities(User user) {
        final List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();

        authorities.add(new SimpleGrantedAuthority("ROLE_USER"));
        //        for (UserProfile userProfile : user.getUserProfiles()) {
        //            System.out.println("UserProfile : " + userProfile);
        //            authorities.add(new SimpleGrantedAuthority("ROLE_" + userProfile.getType()));
        //        }
        // System.out.print("authorities :" + authorities);
        return authorities;
    }
    //####################################################################
    //====
    //== [Method] Block Stop 
    //================================================
}
