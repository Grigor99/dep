package am.grig.deploy.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {

    @GetMapping
    public ResponseEntity<String > isHealthy(){
        return ResponseEntity.ok("get is healthy");
    }

    @GetMapping("/dddd")
    public ResponseEntity<String > isffHealthy(){
        return ResponseEntity.ok("get is healthy");
    }





    @GetMapping("/a")
    public ResponseEntity<String > isNotHealthy(){
        return ResponseEntity.ok("get a is healthy");
    }
    @GetMapping("/api")
    public ResponseEntity<String > isHealtdhy(){
        return ResponseEntity.ok("get with /api is healthy");
    }
}
