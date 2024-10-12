package guru.springframework.spring6di.controllers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
@ActiveProfiles("uat")
@SpringBootTest
class OperatingEnvironmentControllerTest {
    @Autowired
    OperatingEnvironmentController operatingEnvironmentController;

    @Test
    void testSayHello() {
        System.out.println(operatingEnvironmentController.sayHello());

    }
}
