package com.example.main.configuration;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import com.example.main.entities.User;
import com.example.main.repositories.UserReopsitory;

@Component
public class CustomUserDetailsService implements UserDetailsService {

  @Autowired
  private UserReopsitory userReopsitory;

  @Override
  public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
    Optional<User> user = userReopsitory.findByUsername(username);
    return user.map(CustomUserDetails::new).orElseThrow(() -> new UsernameNotFoundException("user not found with name :" + username));
  }

}
