package com.testco.springcloud.controller;

import com.testco.springcloud.model.Verified;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringCloudController {

    @GetMapping("/check")
    public ResponseEntity<?> check(){
        return new ResponseEntity<>("Checked!",HttpStatus.ACCEPTED);
    }

    @GetMapping("/verify")
    public ResponseEntity<?> verify(){
        return new ResponseEntity<>(new Verified(), HttpStatus.ACCEPTED);
    }
}
