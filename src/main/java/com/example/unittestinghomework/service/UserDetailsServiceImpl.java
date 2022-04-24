package com.example.unittestinghomework.service;

import com.example.unittestinghomework.repository.UserRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {
    final
    UserRepository userRepository;

    public UserDetailsServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return (UserDetails) userRepository.findUserByUsername(username);
    }

    public UserDetails loadUserByEmail(String email) throws UsernameNotFoundException {
        return (UserDetails) userRepository.findUserByEmail(email);
    }
}
