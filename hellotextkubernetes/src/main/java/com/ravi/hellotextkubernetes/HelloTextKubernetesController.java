package com.ravi.hellotextkubernetes;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloTextKubernetesController {

    @GetMapping( "/hello-text/from/{name}/of/{company}")
    public HelloWorld doHelloText(
            @PathVariable String name,
            @PathVariable String company
    ) {

        return new HelloWorld(
                name, company, "Hello " + name + " from " + company
        );

    }

}
