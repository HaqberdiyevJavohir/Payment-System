package com.example.paymentsysteminjava.controller.agent;

import com.example.paymentsysteminjava.dto.UserRegisterDto;
import com.example.paymentsysteminjava.servise.jwt.JwtProvider;
import com.example.paymentsysteminjava.servise.user.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/agent")
@RequiredArgsConstructor
public class AgentController {

    private  JwtProvider jwtProvider;

    @Qualifier("a")
    private final UserService userService;

    @PreAuthorize("hasRole('ROLE_SUPER_ADMIN')")
    @PostMapping("/register")
    public ResponseEntity<?> add(@RequestBody UserRegisterDto userRegisterDto) {


        Boolean add = userService.add(userRegisterDto);

        if(add)
            return ResponseEntity.ok().body("Created");

        return ResponseEntity.status(HttpStatus.CONFLICT).body("Something is wrong");
    }

    @PostMapping("/api/check")
    public ResponseEntity<?> check(
            @RequestBody UserRegisterDto userRegisterDto
    ){
        return null;
    }

}