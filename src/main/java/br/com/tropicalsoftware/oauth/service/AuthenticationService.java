package br.com.tropicalsoftware.oauth.service;

import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {

    public String authenticate(Authentication authentication) {
        return "token" + authentication.getName();
    }
}
