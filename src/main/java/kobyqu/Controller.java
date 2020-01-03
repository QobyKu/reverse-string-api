package kobyqu;

import org.springframework.web.bind.annotation.*;

// controller to handle incoming HTTP requests
// @RestController annotation tells Spring that this class is a controller
@RestController
public class Controller {

    // root URL("/") returns default message
    @RequestMapping("/")
    public @ResponseBody String homePage() {
        return "Hello :)";
    }

    // /reverse/<string> returns <string> reversed
    @RequestMapping(value = "/reverse/{string}", method = RequestMethod.GET)
    public @ResponseBody String getBody (@PathVariable String string) {
        ReverseString rs = new ReverseString(string);
        return rs.getReverseString();
    }
}
