package com.javastudio.tutorial.api.dto;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.Collection;

public class Principal implements UserDetails {

    final String username;
    final String password;
    final PasswordEncoder passwordEncoder;

    public Principal(String username, String password, PasswordEncoder passwordEncoder) {
        this.username = username;
        this.password = password;
        this.passwordEncoder = passwordEncoder;
    }

    private static final long serialVersionUID = -1875318681165409048L;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }

    @Override
    public String getPassword() {
        return passwordEncoder.encode(password);
    }

    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
