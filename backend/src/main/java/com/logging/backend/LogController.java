package com.logging.backend;

import lombok.extern.slf4j.Slf4j;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("logs")
public class LogController {

    @GetMapping("hello")
    public ResponseEntity<String> hello() {
        log.info("hello");
        return ResponseEntity.ok("hello");
    }
}
