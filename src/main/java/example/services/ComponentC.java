package example.services;

import framework.injection.annotations.Autowired;
import framework.injection.annotations.Component;
import framework.injection.annotations.Qualifier;

@Component
@Qualifier("ComponentC")
public class ComponentC implements ComponentInter {

    @Autowired(verbose = true)
    @Qualifier("ServiceC")
    private ServiceInter serviceC;

    public ComponentC() {
    }
}
