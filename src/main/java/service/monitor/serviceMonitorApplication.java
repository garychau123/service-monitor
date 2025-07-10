package service.monitor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class serviceMonitorApplication {
    public static void main(String[] args) {
        SpringApplication.run(serviceMonitorApplication.class, args);
    }
   @GetMapping("/service-monitor")
    public String test() {
        return "hi";
    }
}


