package sysco.lambdatest.resources;

import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloWorldResource {

    @ApiOperation(value = "Responds with a fixed greeting", notes ="",
            response = String.class)
    @RequestMapping(value = "/v1.0/hello", method = RequestMethod.GET)
    public String index() {
        return "Hello from Spring Boot!";
    }

}
