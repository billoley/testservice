package testservice.server.config;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(TestServiceProperties.class)
public class TestServiceConfiguration {
    
}
