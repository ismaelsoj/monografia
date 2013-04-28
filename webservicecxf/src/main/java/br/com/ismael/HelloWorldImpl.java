
package br.com.ismael;

import javax.jws.WebService;

@WebService(endpointInterface = "br.com.ismael.HelloWorld")
public class HelloWorldImpl implements HelloWorld {

    public String sayHi(String text) {
        return "Hello " + text;
    }
}

