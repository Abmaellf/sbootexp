package com.abmael.sbootexp.api;

import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class fooController {

    @GetMapping("/public")
    public ResponseEntity<String> publicRoutr(Authentication authentication) {
        System.out.println(authentication.getClass());
        return ResponseEntity.ok("Public route ok "+authentication.getName());
    }

    @GetMapping("/private")
    public ResponseEntity<String> privateRoutr(Authentication authentication) {
        System.out.println(authentication.getClass());
        return ResponseEntity.ok("Private  route  ok "+authentication.getName() );
    }


}
