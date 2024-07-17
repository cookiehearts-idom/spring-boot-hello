
package com.example.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controller that handles HTTP requests for the /hello endpoint.
 */
@RestController
public class HelloController {

    /**
     * Handles GET requests to /hello.
     *
     * @return a greeting message
     */
    @GetMapping("/hello")
    public String sayHello() {
        return "Hello, World!";
    }

    
}
