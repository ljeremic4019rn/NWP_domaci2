package example.controllers;

import framework.annotations.Controller;
import framework.annotations.Get;
import framework.annotations.Path;
import framework.annotations.Post;
import framework.injection.annotations.Autowired;
import framework.injection.annotations.Qualifier;
import example.services.ServiceA;
import example.services.ServiceB;
import example.services.ServiceInter;

@Controller
public class ControllerB {
    @Autowired(verbose = true)
    private ServiceA serviceA;

    @Autowired(verbose = true)
    private ServiceB serviceB;

    @Autowired(verbose = true)
    @Qualifier("ServiceC")
    private ServiceInter serviceC;

    @Path(path = "/methodC")
    @Get
    public void methodC(){}

    @Path(path = "/methodD")
    @Post
    public void methodD(){}
}
