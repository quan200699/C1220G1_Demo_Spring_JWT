package com.example.demojwt.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.security.core.GrantedAuthority;

import java.util.Collection;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class JwtResponse {
    private Long id;

    private String username;

    private String type = "Bearer";

    private String token;

    private Collection<? extends GrantedAuthority> roles;

    public JwtResponse(Long id, String username, String token, Collection<? extends GrantedAuthority> roles) {
        this.id = id;
        this.username = username;
        this.token = token;
        this.roles = roles;
    }
}
