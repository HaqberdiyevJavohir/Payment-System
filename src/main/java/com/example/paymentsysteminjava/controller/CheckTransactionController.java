package com.example.paymentsysteminjava.controller;

import com.example.paymentsysteminjava.dto.request.agent.BaseAgentRequest;
import com.example.paymentsysteminjava.dto.request.agent.DefaultAgentRequest;
import com.example.paymentsysteminjava.dto.response.agent.BaseAgentResponse;
import com.example.paymentsysteminjava.entity.AgentEntity;
import com.example.paymentsysteminjava.servise.transaction.CheckTransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.util.Iterator;

@RestController
@RequestMapping("/api/transaction")
public class CheckTransactionController {

    @Autowired
    private CheckTransactionService checkTransactionService;

    @PreAuthorize("hasRole('ROLE_AGENT')")
    @PostMapping("/check")
    public BaseAgentResponse checkTransaction(
            @RequestBody DefaultAgentRequest baseAgentRequest,
            @AuthenticationPrincipal String username
    ) {
        DefaultAgentRequest defaultAgentRequest = baseAgentRequest.getDefaultAgentRequest();
        return null;
    }
}
