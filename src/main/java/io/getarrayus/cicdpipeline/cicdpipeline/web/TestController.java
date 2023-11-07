package io.getarrayus.cicdpipeline.cicdpipeline.web;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @version 1.0
 * @Author Eric Wouwo Tionang
 * @licence
 */

@RestController
@RequestMapping(path = "/app")
public class TestController {

    @GetMapping(path = "/test")
    public ResponseEntity<Map<String,String>> test(){
        return ResponseEntity.ok().body(Map.of("Testing", "Updated and running"));
    }

    @GetMapping(path = "/health")
    public ResponseEntity<Map<String,String>> healthCheck(){
        return ResponseEntity.ok().body(Map.of("Status", "Up"));
    }
}
