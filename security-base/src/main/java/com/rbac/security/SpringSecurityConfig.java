package com.rbac.security;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * @author jiangxiao
 * @Title: SpringSecurityConfig
 * @Package
 * @Description: SpringSecurityConfig核心
 * @date 2020/5/814:29
 */
public class SpringSecurityConfig extends WebSecurityConfigurerAdapter {
    /**
     * 对一些静态资源 移除 不进行 控制
     * @param web
     */
    @Override
    public void configure(WebSecurity web) {
        web.ignoring().antMatchers("/js/**", "/css/**", "/images/**");
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers("/").permitAll()
                .anyRequest().authenticated()
                .and()
                .logout().permitAll()
                .and()
                .formLogin();
        http.csrf().disable();
    }
}
