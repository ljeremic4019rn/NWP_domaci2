package example.services;

import framework.injection.annotations.Bean;
import framework.injection.annotations.Qualifier;

@Bean()
@Qualifier("ServiceD")
public class ServiceD implements ServiceInter {

    public ServiceD() {
    }
}