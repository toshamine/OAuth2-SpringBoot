package dev.chiba.Oath2App.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/secure")
public class MainController {


    @GetMapping
    public ResponseEntity<String> secureEndpoint(){
        return ResponseEntity.ok("Hello from secure endpoint");
    }
}
