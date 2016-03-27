
package com.wrel.admin.application.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;

/**
 *
 * Page/Class Name: WebSecurityConfig
 * Title:
 * Description:
 * author: weiting
 * Create Date:	2016年3月26日
 * Last Modifier: eldar
 * Last Modify Date: 2016年3月26日
 * Version 1.0
 *
 */

@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
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
    @Autowired
    private UserDetailsService userDetailsService;

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
    @Autowired
    public void configureGlobalSecurity(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(userDetailsService);
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()//
                .antMatchers("/resources/**").permitAll()//
                .antMatchers("/", "/login").permitAll()//
                .anyRequest().hasRole("USER")//
                .and().formLogin().loginPage("/login")//
                .defaultSuccessUrl("/welcome")//
                .loginProcessingUrl("/j_spring_security_check")//  
                .usernameParameter("username").passwordParameter("password").and().csrf()//
                .and().exceptionHandling().accessDeniedPage("/login");

        //      http.authorizeRequests()
        //      .antMatchers("/", "/home").permitAll()
        //      .antMatchers("/admin/**").access("hasRole('ADMIN')")
        //      .antMatchers("/db/**").access("hasRole('ADMIN') and hasRole('DBA')")
        //      .and().formLogin().loginPage("/login")
        //      .usernameParameter("ssoId").passwordParameter("password")
        //      .and().csrf()
        //      .and().exceptionHandling().accessDeniedPage("/Access_Denied");

        //        http.authorizeRequests().antMatchers("/admin/**").access("hasRole('ROLE_USER')").antMatchers("/dba/**")
        //                .access("hasRole('ROLE_ADMIN') or hasRole('ROLE_DBA')").and().formLogin();

    }
    //####################################################################
    //## [Method] sub-block : 
    //####################################################################
    //====
    //== [Method] Block Stop 
    //================================================
}
