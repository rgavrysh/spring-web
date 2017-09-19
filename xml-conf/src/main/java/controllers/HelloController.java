package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.UUID;

@Controller
public class HelloController {

    @RequestMapping(value = "/{name}", method = RequestMethod.GET)
    public ModelAndView helloUser(@PathVariable(value = "name") String name) {
        String id = UUID.randomUUID().toString();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("hello");
        modelAndView.addObject("user", name);
        modelAndView.addObject("id", id);
        return modelAndView;
    }
}
