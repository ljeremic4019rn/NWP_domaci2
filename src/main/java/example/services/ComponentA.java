package example.services;

import framework.injection.annotations.Autowired;
import framework.injection.annotations.Bean;
import framework.injection.annotations.Qualifier;

@Bean(scope = "prototype")
@Qualifier("ComponentA")
public class ComponentA implements ComponentInter {
    @Autowired(verbose = true)
    private ComponentC componentC;

    public ComponentA() {
    }
}
