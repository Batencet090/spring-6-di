package guru.springframework.spring6di.controllers;

import guru.springframework.spring6di.services.OperatingEnvironmentService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class QualityAssuranceController {
    private final OperatingEnvironmentService operatingEnvironmentService;

    public QualityAssuranceController(@Qualifier("qualityAssurance") OperatingEnvironmentService operatingEnvironmentService) {
        this.operatingEnvironmentService = operatingEnvironmentService;
    }
    public String sayHello() {
        return operatingEnvironmentService.getOperatingEnvironment();
    }
}
