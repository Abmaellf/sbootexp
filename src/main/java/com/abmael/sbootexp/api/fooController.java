package com.abmael.sbootexp.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class fooController {

    @GetMapping("/public")
    public ResponseEntity<String> publicRoutr() {
        return ResponseEntity.ok("Public route ok");
    }

    @GetMapping("/private")
    public ResponseEntity<String> privateRoutr() {
        return ResponseEntity.ok("Private route ok");
    }


}
