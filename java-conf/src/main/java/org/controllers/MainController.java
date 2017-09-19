package org.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

    @GetMapping("/")
    @ResponseBody public String getMain() {
        return "Main Page";
    }

    @GetMapping("name")
    @ResponseBody
    public String getName() {
        return "Dispatcher Servlet";
    }
}
