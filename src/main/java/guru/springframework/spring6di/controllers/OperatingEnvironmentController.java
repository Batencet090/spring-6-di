package guru.springframework.spring6di.controllers;

import guru.springframework.spring6di.services.OperatingEnvironmentService;
import org.springframework.stereotype.Controller;

@Controller
public class OperatingEnvironmentController {
    private final OperatingEnvironmentService operatingEnvironmentService;

    public OperatingEnvironmentController(OperatingEnvironmentService operatingEnvironmentService) {
        this.operatingEnvironmentService = operatingEnvironmentService;
    }

    public String sayHello() {
        return operatingEnvironmentService.getOperatingEnvironment();
    }
}
