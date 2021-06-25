package com.ravi.helloworldkubernetes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.ravi.helloworldkubernetes.HelloWorldProxy;
import com.ravi.helloworldkubernetes.HelloWorld;

@RestController
public class HelloWorldKubernetesController {

    @Autowired
    private HelloWorldProxy proxy;

    @CrossOrigin
    @GetMapping( "/hello-world/from/{name}/of/{company}")
    public HelloWorld doHelloWorld(
            @PathVariable String name,
            @PathVariable String company
    ) {

        // call hello-text using OpenFeign proxy client
        HelloWorld helloWorld = proxy.doHelloWorld(name, company);

        return new HelloWorld(
                name, company, helloWorld.getText()
        );

    }

}
