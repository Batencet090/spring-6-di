package guru.springframework.spring6di.controllers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles("prod")
@SpringBootTest
class ProductionEnvironmentControllerTest {
    @Autowired
    ProductionController productionController;
    @Test
    void testSayHello() {
        System.out.println(productionController.sayHello());
    }
}
