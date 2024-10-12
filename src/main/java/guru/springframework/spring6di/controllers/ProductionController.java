package guru.springframework.spring6di.controllers;

import guru.springframework.spring6di.services.OperatingEnvironmentService;
import org.springframework.stereotype.Controller;

@Controller
public class ProductionController {
    private final OperatingEnvironmentService operatingEnvironmentService;

    public ProductionController(OperatingEnvironmentService operatingEnvironmentService) {
        this.operatingEnvironmentService = operatingEnvironmentService;
    }

    public String sayHello() {
        return operatingEnvironmentService.getOperatingEnvironment();
    }
}
