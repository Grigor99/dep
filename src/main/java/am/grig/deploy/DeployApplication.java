package am.grig.deploy;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
public class DeployApplication {


	public static void main(String[] args) {
		SpringApplication.run(DeployApplication.class, args);
	}

}
