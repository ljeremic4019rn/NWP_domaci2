package example.services;

import framework.injection.annotations.Autowired;
import framework.injection.annotations.Qualifier;
import framework.injection.annotations.Service;

@Service
@Qualifier("ServiceB")
public class ServiceB implements ServiceInter {

    @Autowired(verbose = true)
    private ComponentB componentB;

    public ServiceB() {
    }
}
