package com.example.main.controllers;

import com.example.main.configuration.CustomUserDetails;
import com.example.main.dto.AuthRequestDto;
import com.example.main.dto.AuthResponseDto;
import com.example.main.entities.User;
import com.example.main.services.AuthService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {

  @Autowired
  private AuthService authService;

  @Autowired
  private AuthenticationManager authenticationManager;

  @PostMapping("/register")
  public String register(@RequestBody User user) {
    return authService.saveUser(user);
  }

  @PostMapping("/login")
  public AuthResponseDto login(@RequestBody AuthRequestDto authRequestDto) throws Exception {
    User user = null;
    Authentication authentication = authenticationManager
        .authenticate(new UsernamePasswordAuthenticationToken(authRequestDto.getUsername(), authRequestDto.getMdp()));

    if (authentication.isAuthenticated()) {
      CustomUserDetails userDetails = (CustomUserDetails) authentication.getPrincipal();
      user = userDetails.getUser();
      String token = authService.generateToken(authRequestDto.getUsername(), user.getRole().getNom());
      return new AuthResponseDto(user, token);
    } else {
      throw new Exception("Invalid Access");
    }
  }
}
