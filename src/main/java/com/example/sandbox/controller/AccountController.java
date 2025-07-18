package com.example.sandbox.controller;

import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/v1/accounts")
public class AccountController {

    @GetMapping
    public Map<String, String> getAccounts() {
        return Map.of("message", "Accounts fetched successfully");
    }

    @PostMapping
    public Map<String, String> createAccount(@RequestBody Map<String, String> request) {
        return Map.of("message", "Account created", "name", request.getOrDefault("name", "unknown"));
    }
}