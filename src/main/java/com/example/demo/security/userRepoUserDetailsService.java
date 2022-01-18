package com.example.demo.security;

import com.example.demo.domain.User;
import com.example.demo.services.UserRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class userRepoUserDetailsService implements UserDetailsService {
    private final UserRepository userRepository;

    public userRepoUserDetailsService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        User user = userRepository.findUsersByUsername(s);
        if(user != null)
            return user;
        throw new UsernameNotFoundException("User " + s + "not found");
    }
}
