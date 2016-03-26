
package com.wrel.admin.application.security;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

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
@Service
public class WrelUserDetailsService implements UserDetailsService {

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        // TODO 自動產生方法 Stub
        return null;
    }

    //    @Autowired
    //    private UserService userService;
    //     
    //    @Transactional(readOnly=true)
    //    public UserDetails loadUserByUsername(String username)
    //            throws UsernameNotFoundException {
    //        User user = userService.findBySso(ssoId);
    //        System.out.println("User : "+user);
    //        if(user==null){
    //            System.out.println("User not found");
    //            throw new UsernameNotFoundException("Username not found");
    //        }
    //            return new org.springframework.security.core.userdetails.User(user.getSsoId(), user.getPassword(), 
    //                 user.getState().equals("Active"), true, true, true, getGrantedAuthorities(user));
    //    }
    // 
    //     
    //    private List<GrantedAuthority> getGrantedAuthorities(User user){
    //        List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
    //         
    //        for(UserProfile userProfile : user.getUserProfiles()){
    //            System.out.println("UserProfile : "+userProfile);
    //            authorities.add(new SimpleGrantedAuthority("ROLE_"+userProfile.getType()));
    //        }
    //        System.out.print("authorities :"+authorities);
    //        return authorities;
    //    }
    //     
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
    //####################################################################
    //## [Method] sub-block : 
    //####################################################################
    //====
    //== [Method] Block Stop 
    //================================================
}
