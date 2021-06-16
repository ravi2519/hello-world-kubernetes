package com.ravi.helloworldkubernetes;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="hello-text", url="${HELLO_TEXT_SERVICE_HOST:http://localhost}:8081")
public interface HelloWorldProxy {

    @GetMapping( "/hello-text/from/{name}/of/{company}")
    public HelloWorld doHelloWorld(
            @PathVariable String name,
            @PathVariable String company
    );

}
