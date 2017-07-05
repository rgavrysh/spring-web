package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

    @RequestMapping(value = "/{name}", method = RequestMethod.GET)
    public ModelAndView helloUser(@PathVariable(value = "name") String name) {
        return new ModelAndView("hello", "msg", name);
    }
}
