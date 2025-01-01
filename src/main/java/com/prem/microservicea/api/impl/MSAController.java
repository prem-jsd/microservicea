package com.prem.microservicea.api.impl;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/demo")
public class MSAController {

    @PreAuthorize("hasRole('client_user_role')")
    @GetMapping
    public String sayHello() {
        return "I'm MicroServiceA";
    }

    @PreAuthorize("hasRole('client_admin_role')")
    @GetMapping("hello2")
    public String sayHello2() {
        return "I'm MicroServiceA - Admin";
    }
}
