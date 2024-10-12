package guru.springframework.spring6di.controllers;

import guru.springframework.spring6di.services.OperatingEnvironmentService;
import org.springframework.stereotype.Controller;

@Controller
public class DevelopmentController {
    private final OperatingEnvironmentService operatingEnvironmentService;

    public DevelopmentController(OperatingEnvironmentService operatingEnvironmentService) {
        this.operatingEnvironmentService = operatingEnvironmentService;
    }

    public String sayHello() {
        return operatingEnvironmentService.getOperatingEnvironment();
    }
}
