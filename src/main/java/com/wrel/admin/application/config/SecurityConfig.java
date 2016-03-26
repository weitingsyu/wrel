
package com.wrel.admin.application.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

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
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {

        auth.inMemoryAuthentication().withUser("mkyong").password("123456").roles("USER");
        auth.inMemoryAuthentication().withUser("admin").password("123456").roles("ADMIN");
        auth.inMemoryAuthentication().withUser("dba").password("123456").roles("DBA");
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {

        http.authorizeRequests().antMatchers("/admin/**").access("hasRole('ROLE_USER')").antMatchers("/dba/**")
                .access("hasRole('ROLE_ADMIN') or hasRole('ROLE_DBA')").and().formLogin();

    }
    //####################################################################
    //## [Method] sub-block : 
    //####################################################################
    //====
    //== [Method] Block Stop 
    //================================================
}
