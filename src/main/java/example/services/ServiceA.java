package example.services;

import framework.injection.annotations.Autowired;
import framework.injection.annotations.Bean;
import framework.injection.annotations.Qualifier;

@Bean()
@Qualifier("ServiceA")
public class ServiceA implements ServiceInter {
    @Autowired(verbose = true)
    private ComponentA componentA;

    public ServiceA() {
    }
}
