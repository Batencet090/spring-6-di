package guru.springframework.spring6di.services.impl;

import guru.springframework.spring6di.services.OperatingEnvironmentService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("dev")
@Service("development")
public class DevelopmentEnvironmentServiceImpl implements OperatingEnvironmentService {
    @Override
    public String getOperatingEnvironment() {
        return "The operating environment is DEV";
    }
}
