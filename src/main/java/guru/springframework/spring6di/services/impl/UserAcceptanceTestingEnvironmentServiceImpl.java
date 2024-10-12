package guru.springframework.spring6di.services.impl;

import guru.springframework.spring6di.services.OperatingEnvironmentService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("uat")
@Service("userAcceptanceTesting")
public class UserAcceptanceTestingEnvironmentServiceImpl implements OperatingEnvironmentService {
    @Override
    public String getOperatingEnvironment() {
        return "The operating environment is UAT";
    }
}
