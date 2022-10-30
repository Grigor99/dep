package am.grig.deploy;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DepController {
    @GetMapping
    public ResponseEntity<String> getHi(){
        return ResponseEntity.ok("done successfully");
    }

}
