package example.services;

import framework.injection.annotations.Autowired;
import framework.injection.annotations.Qualifier;
import framework.injection.annotations.Service;

@Service
@Qualifier("ServiceC")
public class ServiceC implements ServiceInter {
    @Autowired(verbose = true)
    @Qualifier("ServiceD")
    private ServiceInter service4;

    public ServiceC() {
    }
}
