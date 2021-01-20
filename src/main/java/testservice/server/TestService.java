package testservice.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Launcher for the authorization service.
 */
@EnableDiscoveryClient
@SpringBootApplication(scanBasePackages = {"datawave.microservice", "testservice"}, exclude = {ErrorMvcAutoConfiguration.class})
public class TestService {
    public static void main(String[] args) {
        SpringApplication.run(TestService.class, args);
    }
}
