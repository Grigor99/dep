package am.grig.deploy;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DepController {

    @GetMapping("/a")
    public ResponseEntity<String> getfHi() {
        return ResponseEntity.ok("done su  efef  ccessfully");
    }
    @GetMapping("/afff")
    public ResponseEntity<String> getffHi() {
        return ResponseEntity.ok("done su    efefeccessfully");
    }


    @GetMapping
    public ResponseEntity<String> getHi() {
        return ResponseEntity.ok("done su    ccessfully");
    }

}
