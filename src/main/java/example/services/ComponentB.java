package example.services;

import framework.injection.annotations.Autowired;
import framework.injection.annotations.Component;
import framework.injection.annotations.Qualifier;

@Component
@Qualifier("ComponentB")
public class ComponentB implements ComponentInter {

    @Autowired(verbose = true)
    @Qualifier("ComponentC")
    private ComponentInter componentC;

    public ComponentB() {
    }
}
