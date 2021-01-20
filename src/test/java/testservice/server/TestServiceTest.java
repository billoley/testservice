package testservice.server;

import testservice.server.config.TestServiceProperties;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestServiceTest {
    
    @Autowired
    private TestServiceProperties testServiceProperties;
    
    @Test
    public void runTest() {
        Assert.assertEquals("localhost", testServiceProperties.getHost());
        Assert.assertEquals("8443", testServiceProperties.getPort());
    }
}
