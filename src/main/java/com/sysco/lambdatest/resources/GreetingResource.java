package com.sysco.lambdatest.resources;

import io.swagger.annotations.ApiOperation;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.sysco.lambdatest.entities.Greeting;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetingResource {

    private static final String template = "Greetings, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping(value="/v1.0/greeting", method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
    @ApiOperation(value = "Responds with Greetings, {Name}",
                  notes ="The default greeting name is [World],  if name parameter is not provided.",
                  response = Greeting.class)
    public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return new Greeting(counter.incrementAndGet(),
                            String.format(template, name));
    }
}
