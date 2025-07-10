package service.monitor;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableAdminServer
@RestController
public class ServiceMonitorApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceMonitorApplication.class, args);
    }

    @GetMapping("/service-monitor")
    public String test() {
        return "hi";
    }
}
